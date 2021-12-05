package com.tpam.inviteme.beans;

import javax.persistence.*;
import lombok.*;

@Table(name = "friends")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_friends", nullable = false)
    private Long idFriend;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_person1", nullable = false)
    private Person idPerson1;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_person2", nullable = false)
    private Person idPerson2;


}