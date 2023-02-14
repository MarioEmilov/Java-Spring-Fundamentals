package andreys.demo.service;

import andreys.demo.models.entities.Category;
import andreys.demo.models.entities.CategoryName;
import andreys.demo.models.service.CategoryServiceModel;

public interface CategoryService {
    Category find(CategoryName categoryName);

    void initCategories();
}
