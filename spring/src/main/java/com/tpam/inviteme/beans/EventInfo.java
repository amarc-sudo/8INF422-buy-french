package com.tpam.inviteme.beans;

import javax.persistence.*;
import lombok.*;

@Table(name = "event_info")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EventInfo {
    @Id
    @Column(name = "id_event_info", nullable = false)
    private Long idEventInfo;

    @ManyToOne
    @JoinColumn(name = "id_event")
    private Event idEvent;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "info")
    private byte[] info;


}