package com.u8inf422.spring.beans;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "seller")
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "lat", nullable = false)
    private Double lat;

    @Column(name = "`long`", nullable = false)
    private Double _long;


}