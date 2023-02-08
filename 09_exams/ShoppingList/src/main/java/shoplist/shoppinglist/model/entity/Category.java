package shoplist.shoppinglist.model.entity;

import jakarta.persistence.*;
import shoplist.shoppinglist.model.enums.CategotyName;

@Entity
@Table(name = "categories")
public class Category extends BaseEntity{

    @Enumerated(EnumType.STRING)
    private CategotyName name;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    public Category() {
    }

    public Category(CategotyName name, String description) {
        this.name = name;
        this.description = description;
    }

    public CategotyName getName() {
        return name;
    }

    public void setName(CategotyName name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
