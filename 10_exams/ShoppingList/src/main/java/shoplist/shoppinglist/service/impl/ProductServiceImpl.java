package shoplist.shoppinglist.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import shoplist.shoppinglist.model.entity.Product;
import shoplist.shoppinglist.model.enums.CategoryName;
import shoplist.shoppinglist.model.service.ProductServiceModel;
import shoplist.shoppinglist.model.view.ProductViewModel;
import shoplist.shoppinglist.repository.ProductRepository;
import shoplist.shoppinglist.service.CategoryService;
import shoplist.shoppinglist.service.ProductService;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final CategoryService categoryService;
    private final ModelMapper modelMapper;

    public ProductServiceImpl(ProductRepository productRepository, CategoryService categoryService, ModelMapper modelMapper) {
        this.productRepository = productRepository;
        this.categoryService = categoryService;
        this.modelMapper = modelMapper;
    }

    @Override
    public void add(ProductServiceModel productServiceModel) {

        //We are need to get enums Category in our table, not from class
        Product product = modelMapper.map(productServiceModel, Product.class);
        product.setCategory(categoryService.findByName(productServiceModel.getCategory()));
        productRepository.save(product);
    }

    @Override
    public BigDecimal getTotalSum() {
        return productRepository.findTotalProductsSum();
    }

    @Override
    public List<ProductViewModel> findAllProductsByCategoryName(CategoryName categoryName) {
        return productRepository
                .findAllByCategory_Name(categoryName)
                .stream().map(product -> modelMapper.map(product, ProductViewModel.class))
                .collect(Collectors.toList());
    }

    @Override
    public void buyById(String id) {
        productRepository.deleteById(id);
    }

    @Override
    public void buyAll() {
        productRepository.deleteAll();
    }
}
