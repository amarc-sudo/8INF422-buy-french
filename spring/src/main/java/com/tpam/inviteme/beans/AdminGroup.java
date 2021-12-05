package com.tpam.inviteme.beans;

import javax.persistence.*;
import lombok.*;

@Table(name = "admin_groups")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AdminGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_admin_groups", nullable = false)
    private Integer idAdminGroup;

    @ManyToOne
    @JoinColumn(name = "id_person")
    private Person idPerson;

    @ManyToOne
    @JoinColumn(name = "id_groups")
    private Group idGroups;

    @Column(name = "groups_privileges")
    private Integer groupsPrivileges;

}