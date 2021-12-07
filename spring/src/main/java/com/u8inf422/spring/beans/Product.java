package com.u8inf422.spring.beans;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "name", nullable = false)
    private String name;

    @Lob
    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "price", nullable = false)
    private Double price;

    @Lob
    @Column(name = "photo", nullable = false)
    private String photo;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idSeller", nullable = false)
    private Seller idSeller;

}