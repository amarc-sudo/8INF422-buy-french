package com.iut.james.beans;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "command")
public class Command {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private User idUser;

    @Column(name = "date")
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "idDeliver")
    private User idDeliver;

    @Getter
    @Setter
    @ManyToMany(cascade = {CascadeType.PERSIST})
    @JoinTable(
            name = "productCommand",
            joinColumns = @JoinColumn(name = "commandID", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "productID", referencedColumnName = "id")
    )
    private List<Product> products = new java.util.ArrayList<>();

    public User getIdDeliver() {
        return idDeliver;
    }

    public void setIdDeliver(User idDeliver) {
        this.idDeliver = idDeliver;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}