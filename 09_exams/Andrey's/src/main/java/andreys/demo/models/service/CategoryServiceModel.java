package andreys.demo.models.service;

import andreys.demo.models.entities.CategoryName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryServiceModel extends BaseServiceModel {

    private CategoryName categoryName;
    private String description;
}
