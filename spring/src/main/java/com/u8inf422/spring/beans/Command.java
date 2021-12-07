package com.u8inf422.spring.beans;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
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


}