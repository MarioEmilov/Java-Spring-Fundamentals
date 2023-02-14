package andreys.demo.service;

import andreys.demo.models.entities.Category;
import andreys.demo.models.entities.CategoryName;
import andreys.demo.models.service.CategoryServiceModel;
import andreys.demo.repositories.CategoryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;

    public CategoryServiceImpl(CategoryRepository categoryRepository, ModelMapper modelMapper) {
        this.categoryRepository = categoryRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void initCategories() {
        if (this.categoryRepository.count() == 0) {
            Arrays.stream(CategoryName.values())
                    .forEach(categoryName -> {
                        this.categoryRepository
                                .save(new Category(categoryName,
                                        String.format("Description for %s",
                                                categoryName.name())));
                    });
        }
    }

    @Override
    public Category find(CategoryName categoryName) {
        return this.categoryRepository.findByName(categoryName)
                .orElse(null);
    }
}
