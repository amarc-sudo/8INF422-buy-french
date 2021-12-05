create table invitemeapp.`groups`
(
    id_groups    int          not null
        primary key,
    name_groups  varchar(255) null,
    place_groups text         null,
    desc_groups  text         null
);

create table invitemeapp.person
(
    id_person          bigint       not null
        primary key,
    first_name         varchar(255) null,
    last_name          varchar(255) null,
    surname            varchar(255) null,
    cell_number        int          null,
    international_code int          null,
    birth_date         date         null,
    country            int          null,
    private_person     tinyint(1)   null
);

create table invitemeapp.admin_groups
(
    id_admin_groups   int    not null
        primary key,
    id_person         bigint null,
    id_groups         int    null,
    groups_privileges int    null,
    constraint admin_groups_groups_id_groups_fk
        foreign key (id_groups) references invitemeapp.`groups` (id_groups),
    constraint admin_groups_person_id_person_fk
        foreign key (id_person) references invitemeapp.person (id_person)
);

create index admin_groups_id_admin_groups_index
    on invitemeapp.admin_groups (id_admin_groups);

create table invitemeapp.friends
(
    id_friends bigint not null
        primary key,
    id_person1 bigint not null,
    id_person2 bigint not null,
    constraint friends_person_id_person_fk
        foreign key (id_person1) references invitemeapp.person (id_person),
    constraint friends_person_id_person_fk_2
        foreign key (id_person2) references invitemeapp.person (id_person)
);

create index friends_id_friends_index
    on invitemeapp.friends (id_friends);

create table invitemeapp.person_groups
(
    id_person_groups int not null
        primary key,
    id_person        int null,
    id_groups        int null,
    id_statut        int null,
    constraint person_groups_groups_id_groups_fk
        foreign key (id_groups) references invitemeapp.`groups` (id_groups)
);

create table invitemeapp.table_data
(
    id_table_data   int          not null
        primary key,
    type_table_data varchar(255) not null,
    name_table_data varchar(255) not null,
    labels          varchar(255) null,
    info_table_data longblob     null,
    `desc`          text         null
);

create table invitemeapp.event
(
    id_event    bigint auto_increment
        primary key,
    id_createur bigint(11)   null,
    create_date date         null,
    id_statut   int          null,
    id_groups   int          null,
    title       varchar(255) null,
    description varchar(255) null,
    constraint event_groups_id_groups_fk
        foreign key (id_groups) references invitemeapp.`groups` (id_groups),
    constraint event_person_id_person_fk
        foreign key (id_createur) references invitemeapp.person (id_person),
    constraint event_table_data_id_table_data_fk
        foreign key (id_statut) references invitemeapp.table_data (id_table_data)
);

create table invitemeapp.event_info
(
    id_event_info bigint   not null
        primary key,
    id_event      bigint   null,
    type          int      not null,
    info          longblob null,
    constraint event_info_table_data_id_table_data_fk
        foreign key (type) references invitemeapp.table_data (id_table_data),
    constraint info_event_event_id_event_fk
        foreign key (id_event) references invitemeapp.event (id_event)
);

create table invitemeapp.favorite_tags
(
    id_favorite_tags int    not null
        primary key,
    id_tags          int    null,
    id_person        bigint null,
    constraint favorite_tags_person_id_person_fk
        foreign key (id_person) references invitemeapp.person (id_person),
    constraint favorite_tags_table_data_id_table_data_fk
        foreign key (id_tags) references invitemeapp.table_data (id_table_data)
);

create index favorite_tags_id_favorite_tags_index
    on invitemeapp.favorite_tags (id_favorite_tags);

create table invitemeapp.inscription
(
    id_inscription   bigint auto_increment
        primary key,
    id_event         bigint null,
    id_person        bigint null,
    id_status        int    null,
    inscription_date date   null,
    constraint inscription_event_id_event_fk
        foreign key (id_event) references invitemeapp.event (id_event),
    constraint inscription_person_id_person_fk
        foreign key (id_person) references invitemeapp.person (id_person),
    constraint inscription_table_data_id_table_data_fk
        foreign key (id_status) references invitemeapp.table_data (id_table_data)
);

create table invitemeapp.logs
(
    id_log       int auto_increment
        primary key,
    date_log     datetime     null,
    ip           varchar(255) null,
    id_person    bigint       null,
    id_type_logs int          null,
    description  varchar(255) null,
    labels       varchar(255) null,
    constraint logs_person_id_person_fk
        foreign key (id_person) references invitemeapp.person (id_person),
    constraint logs_table_data_id_table_data_fk
        foreign key (id_type_logs) references invitemeapp.table_data (id_table_data)
);

create index table_data_id_table_data_index
    on invitemeapp.table_data (id_table_data);

create table invitemeapp.user
(
    id_user          bigint auto_increment,
    email            varchar(255) not null,
    surname          varchar(255) not null,
    password         varchar(255) not null,
    create_date      date         not null,
    id_statut        int          null,
    echec_connection int          null,
    last_connection  date         null,
    constraint user_email_uindex
        unique (email),
    constraint user_id_user_uindex
        unique (id_user),
    constraint user_surname_uindex
        unique (surname)
);

create table test.token_connexion
(
    id_token              int auto_increment
        primary key,
    token                 varchar(255)                          not null,
    date_expiration_token timestamp default current_timestamp() not null on update current_timestamp(),
    email_connexion       varchar(255)                          not null
);

alter table invitemeapp.user
    add primary key (id_user);
