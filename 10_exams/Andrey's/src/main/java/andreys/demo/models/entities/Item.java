package andreys.demo.models.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import java.math.BigDecimal;

@Entity
@Table(name = "items")
@NoArgsConstructor
@Getter
@Setter
public class Item extends BaseEntity {

    @Column(name = "name", unique = true, nullable = false)
    private String name;
    @Column(name = "description", columnDefinition = "TEXT")
    private String description;
    @DecimalMin(value = "0")
    private BigDecimal price;
    @ManyToOne
    private Category category;
    private String gender;

}
