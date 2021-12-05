package com.tpam.inviteme.beans;

import javax.persistence.*;
import lombok.*;

@Table(name = "table_data")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TableData {
    @Id
    @Column(name = "id_table_data", nullable = false)
    private Integer idTableData;

    @Column(name = "type_table_data", nullable = false)
    private String typeTableData;

    @Column(name = "name_table_data", nullable = false)
    private String nameTableData;

    @Column(name = "labels")
    private String labels;

    @Column(name = "info_table_data")
    private byte[] infoTableData;

    @Lob
    @Column(name = "`desc`")
    private String desc;


}