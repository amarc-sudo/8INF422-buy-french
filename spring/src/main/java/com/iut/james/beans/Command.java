package com.iut.james.beans;

import javax.persistence.*;
import java.time.LocalDate;

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