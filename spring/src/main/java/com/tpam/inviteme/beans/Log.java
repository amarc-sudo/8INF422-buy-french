package com.tpam.inviteme.beans;

import javax.persistence.*;
import java.time.Instant;
import lombok.*;

@Table(name = "logs")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_log", nullable = false)
    private Integer idLog;

    @Column(name = "date_log")
    private Instant dateLog;

    @Column(name = "ip")
    private String ip;

    @ManyToOne
    @JoinColumn(name = "id_person")
    private Person idPerson;

    @ManyToOne
    @JoinColumn(name = "id_type_logs")
    private TableData idTypeLogs;

    @Column(name = "description")
    private String description;

    @Column(name = "labels")
    private String labels;
}