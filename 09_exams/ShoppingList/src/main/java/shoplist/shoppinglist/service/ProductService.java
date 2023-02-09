package shoplist.shoppinglist.service;

import shoplist.shoppinglist.model.enums.CategoryName;
import shoplist.shoppinglist.model.service.ProductServiceModel;
import shoplist.shoppinglist.model.view.ProductViewModel;

import java.math.BigDecimal;
import java.util.List;

public interface ProductService {
    void add(ProductServiceModel productServiceModel);

    BigDecimal getTotalSum();

    List<ProductViewModel> findAllProductsByCategoryName(CategoryName categoryName);

    void buyById(String id);

    void buyAll();
}
