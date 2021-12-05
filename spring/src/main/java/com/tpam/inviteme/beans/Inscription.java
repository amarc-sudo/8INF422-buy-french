package com.tpam.inviteme.beans;

import javax.persistence.*;
import java.time.LocalDate;
import lombok.*;

@Table(name = "inscription")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inscription", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_event")
    private Event idEvent;

    @ManyToOne
    @JoinColumn(name = "id_person")
    private Person idPerson;

    @ManyToOne
    @JoinColumn(name = "id_status")
    private TableData idStatus;

    @Column(name = "inscription_date")
    private LocalDate inscriptionDate;


}