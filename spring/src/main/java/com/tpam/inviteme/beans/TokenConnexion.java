package com.tpam.inviteme.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;

@Table(name = "token_connexion")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TokenConnexion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_token", nullable = false)
    private Integer id;

    @Column(name = "token", nullable = false)
    private String token;

    @Column(name = "date_expiration_token", nullable = false)
    private Instant dateExpirationToken;

    @Column(name = "email_connexion", nullable = false)
    private String emailConnexion;
}