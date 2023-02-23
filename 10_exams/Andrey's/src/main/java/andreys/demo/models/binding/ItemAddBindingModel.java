package andreys.demo.models.binding;

import andreys.demo.models.entities.Category;
import andreys.demo.models.entities.CategoryName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Setter
public class ItemAddBindingModel {

    @Length(min = 2, message = "Name length must be more than two characters")
    private String name;
    @Length(min = 3, message = "Description length must be more than two characters")
    private String description;
    @NotNull
    private CategoryName category;
    @NotNull
    private String gender;
    @DecimalMin(value = "0", message = "Price must be positive number")
    private BigDecimal price;
}
