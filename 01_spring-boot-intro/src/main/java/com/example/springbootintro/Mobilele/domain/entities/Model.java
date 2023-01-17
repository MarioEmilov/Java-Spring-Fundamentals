package com.example.springbootintro.Mobilele.domain.entities;

import com.example.springbootintro.Mobilele.domain.enums.ModelCategory;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "models")
public class Model extends BaseEntity {

    @Column
    private String name;
    @Enumerated(EnumType.STRING)
    private ModelCategory category;
    @Column
    private String imageUrl;
    @Column
    private Integer startYear;
    @Column
    private Integer endYear;
    @Column
    private Date created;
    @Column
    private Date modified;
    @ManyToOne
    private Brand brand;


}
