package com.tpam.inviteme.beans;

import javax.persistence.*;
import lombok.*;

@Table(name = "person_groups")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_person_groups", nullable = false)
    private Integer idPersonGroups;

    @ManyToOne
    @JoinColumn(name = "id_person")
    private Person idPerson;

    @ManyToOne
    @JoinColumn(name = "id_groups")
    private Group idGroups;

    @Column(name = "id_statut")
    private Integer idStatut;


}