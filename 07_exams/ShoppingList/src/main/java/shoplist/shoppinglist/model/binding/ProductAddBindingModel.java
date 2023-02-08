package shoplist.shoppinglist.model.binding;

import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;
import shoplist.shoppinglist.model.enums.CategotyName;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProductAddBindingModel {

    @NotBlank(message = "Name cannot be empty")
    @Size(min = 3, max = 20, message = "Name must be between 3 and 20 characters")
    private String name;

    @NotBlank(message = "Description cannot be empty")
    @Size(min = 5, message = "Description must be min 5 characters")
    private String description;

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    @FutureOrPresent(message = "The date cannot be in the past")
    private LocalDateTime neededBefore;

    @DecimalMin(value = "0", message = "Price must be positive")
    private BigDecimal price;

    @NotNull(message = "You must select category")
    private CategotyName categoty;

    public ProductAddBindingModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getNeededBefore() {
        return neededBefore;
    }

    public void setNeededBefore(LocalDateTime neededBefore) {
        this.neededBefore = neededBefore;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public CategotyName getCategoty() {
        return categoty;
    }

    public void setCategoty(CategotyName categoty) {
        this.categoty = categoty;
    }
}