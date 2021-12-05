package com.tpam.inviteme.beans;

import javax.persistence.*;
import java.time.LocalDate;
import lombok.*;

@Table(name = "event")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_event", nullable = false)
    private Long idEvent;

    @OneToOne
    @JoinColumn(name = "id_createur")
    private Person createur;

    @Column(name = "create_date")
    private LocalDate createDate;

    @ManyToOne
    @JoinColumn(name = "id_statut")
    private TableData idStatut;

    @ManyToOne
    @JoinColumn(name = "id_groups")
    private Group idGroups;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", nullable = false)
    private String description;
}