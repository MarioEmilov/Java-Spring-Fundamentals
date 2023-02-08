package shoplist.shoppinglist.service.impl;

import org.springframework.stereotype.Service;
import shoplist.shoppinglist.model.entity.Category;
import shoplist.shoppinglist.model.enums.CategotyName;
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
            Arrays.stream(CategotyName.values())
                    .forEach(categotyName -> {
                        Category category = new Category(categotyName,
                                "Description for " + categotyName.name());
                        categoryRepository.save(category);
                    });
        }
    }
}
