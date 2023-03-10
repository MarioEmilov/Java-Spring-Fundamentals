package shoplist.shoppinglist.service.impl;

import org.springframework.stereotype.Service;
import shoplist.shoppinglist.model.entity.Category;
import shoplist.shoppinglist.model.enums.CategoryName;
import shoplist.shoppinglist.repository.CategoryRepository;
import shoplist.shoppinglist.service.CategoryService;

import java.util.Arrays;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void initCategories() {
        if (categoryRepository.count() == 0) {
            Arrays.stream(CategoryName.values())
                    .forEach(categoryName -> {
                        Category category = new Category(categoryName,
                                "Description for " + categoryName.name());
                        categoryRepository.save(category);
                    });
        }
    }

    @Override
    public Category findByName(CategoryName categoryName) {
        return categoryRepository
                .findByName(categoryName)
                .orElse(null);
    }
}
