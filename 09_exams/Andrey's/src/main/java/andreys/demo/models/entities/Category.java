package andreys.demo.models.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "categories")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Category extends BaseEntity {

    @Enumerated(EnumType.STRING)
    @Column(name = "category_name")
    private CategoryName name;
    @Column(name = "description", columnDefinition = "TEXT")
    private String description;
}
