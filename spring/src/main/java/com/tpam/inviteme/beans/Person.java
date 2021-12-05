package com.tpam.inviteme.beans;

import javax.persistence.*;
import java.time.LocalDate;
import lombok.*;

@Table(name = "person")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    @Column(name = "id_person", nullable = false)
    private Long idPerson;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "surname")
    private String surname;

    @Column(name = "cell_number")
    private Integer cellNumber;

    @Column(name = "international_code")
    private Integer internationalCode;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "country")
    private Integer country;

    @Column(name = "private_person")
    private Boolean privatePerson;

    @Transient
    private String token;

}