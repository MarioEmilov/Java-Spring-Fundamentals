package andreys.demo.models.service;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Setter
public class ItemServiceModel extends BaseServiceModel {
    private String name;
    private String description;
    private BigDecimal price;
    private CategoryServiceModel category;
    private String gender;
}
