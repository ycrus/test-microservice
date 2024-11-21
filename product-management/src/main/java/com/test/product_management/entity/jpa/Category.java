package com.test.product_management.entity.jpa;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tbl_category")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Category extends AuditEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Long id;

    @Column(length = 50)
    private String name;
    @Column(length = 50)
    private String description;

}
