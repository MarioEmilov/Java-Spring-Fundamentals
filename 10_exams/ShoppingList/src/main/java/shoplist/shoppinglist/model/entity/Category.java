package shoplist.shoppinglist.model.entity;

import jakarta.persistence.*;
import shoplist.shoppinglist.model.enums.CategoryName;

@Entity
@Table(name = "categories")
public class Category extends BaseEntity{

    @Enumerated(EnumType.STRING)
    private CategoryName name;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    public Category() {
    }

    public Category(CategoryName name, String description) {
        this.name = name;
        this.description = description;
    }

    public CategoryName getName() {
        return name;
    }

    public void setName(CategoryName name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
