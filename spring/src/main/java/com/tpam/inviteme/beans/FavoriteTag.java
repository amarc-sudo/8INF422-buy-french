package com.tpam.inviteme.beans;

import javax.persistence.*;
import lombok.*;

@Table(name = "favorite_tags")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FavoriteTag {
    @Id
    @Column(name = "id_favorite_tags", nullable = false)
    private Integer idFavoriteTags;

    @ManyToOne
    @JoinColumn(name = "id_tags")
    private TableData idTags;

    @ManyToOne
    @JoinColumn(name = "id_person")
    private Person idPerson;

}