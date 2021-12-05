package com.tpam.inviteme.beans;

import javax.persistence.*;
import java.time.LocalDate;
import lombok.*;

@Table(name = "user", indexes = {
        @Index(name = "user_surname_uindex", columnList = "surname", unique = true),
        @Index(name = "user_email_uindex", columnList = "email", unique = true)
})
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user", nullable = false)
    private Long idUser;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "create_date", nullable = false)
    private LocalDate createDate;

    @Column(name = "id_statut")
    private Integer idStatut;

    @Column(name = "echec_connection")
    private Integer echecConnection;

    @Column(name = "last_connection")
    private LocalDate lastConnection;

    @Column(name = "id_person")
    private Long idPerson;

}