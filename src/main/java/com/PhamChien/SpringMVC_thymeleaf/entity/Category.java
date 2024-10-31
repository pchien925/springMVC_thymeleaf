package com.PhamChien.SpringMVC_thymeleaf.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "category")
public class Category extends AbstractEntity<Long> {
    @Column(name = "category_name")
    private String name;

    @Column(name = "images")
    private String images;

    @Column(name = "status")
    private int status;
}
