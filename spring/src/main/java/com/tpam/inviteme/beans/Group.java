package com.tpam.inviteme.beans;

import javax.persistence.*;
import lombok.*;

@Table(name = "groups")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Group {
    @Id
    @Column(name = "id_groups", nullable = false)
    private Integer idGroups;

    @Column(name = "name_groups")
    private String nameGroups;

    @Lob
    @Column(name = "place_groups")
    private String placeGroups;

    @Lob
    @Column(name = "desc_groups")
    private String descGroups;


}