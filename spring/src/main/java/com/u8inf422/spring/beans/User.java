package com.u8inf422.spring.beans;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Lob
    @Column(name = "lastName", nullable = false)
    private String lastName;

    @Lob
    @Column(name = "salt", nullable = false)
    private String salt;

    @Lob
    @Column(name = "password", nullable = false)
    private String password;

    @Lob
    @Column(name = "mail", nullable = false)
    private String mail;

    @Lob
    @Column(name = "phone", nullable = false)
    private String phone;

    @ManyToOne(optional = false)
    @JoinColumn(name = "typeID", nullable = false)
    private UserType typeID;

}