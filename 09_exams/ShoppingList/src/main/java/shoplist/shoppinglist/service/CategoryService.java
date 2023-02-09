package shoplist.shoppinglist.service;

import shoplist.shoppinglist.model.entity.Category;
import shoplist.shoppinglist.model.enums.CategoryName;

public interface CategoryService {
    void initCategories();

    Category findByName (CategoryName categoryName);
}
