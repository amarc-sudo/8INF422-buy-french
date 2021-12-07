create table if not exists data
(
    id_data int auto_increment
        primary key,
    donnees varchar(20) not null,
    code    varchar(10) not null
);

insert into data
values (1, 'présent', 'pre')
on duplicate key update id_data = id_data;

insert into data
values (2, 'en retard', 'ret')
on duplicate key update id_data = id_data;

insert into data
values (3, 'absent', 'abs')
on duplicate key update id_data = id_data;

insert into data
values (4, 'envoyé', 'env')
on duplicate key update id_data = id_data;

insert into data
values (5, 'non envoyé', 'non_env')
on duplicate key update id_data = id_data;

create table if not exists compte
(
    id_compte int auto_increment
        primary key,
    password  varchar(50)          null,
    reset     tinyint(1) default 0 null
);

create table if not exists contact
(
    id_contact    int auto_increment
        primary key,
    adresse_mail  varchar(40)            not null,
    date_creation date default sysdate() null,
    id_compte     int                    null,
    constraint contact_adresse_mail_uindex
        unique (adresse_mail),
    constraint contact_compte_id_compte_fk
        foreign key (id_compte) references compte (id_compte)
);

create table if not exists personne
(
    id_personne   int auto_increment
        primary key,
    nom           varchar(30)            null,
    prenom        varchar(30)            null,
    date_creation date default sysdate() not null
);

create table if not exists professeur
(
    id_professeur int auto_increment
        primary key,
    id_personne   int      not null,
    id_contact    int      null,
    signature     longblob null,
    constraint professeur_personne_fk
        foreign key (id_personne) references personne (id_personne),
    constraint professeur_contact_id_contact_fk
        foreign key (id_contact) references contact (id_contact)
);

create table if not exists formation
(
    id_formation   int auto_increment
        primary key,
    id_responsable int         not null,
    intitule       varchar(30) not null,
    constraint formation_responsable_fk
        foreign key (id_responsable) references professeur (id_professeur)
);

create table if not exists formation_professeur
(
    id_formation_professeur int auto_increment
        primary key,
    id_formation            int not null,
    id_professeur           int null,
    constraint formation_professeur_formation_id_formation_fk
        foreign key (id_formation) references formation (id_formation),
    constraint formation_professeur_professeur_id_professeur_fk
        foreign key (id_professeur) references professeur (id_professeur)
);

create table if not exists secretaire
(
    id_secretaire int auto_increment
        primary key,
    id_personne   int null,
    id_contact    int null,
    constraint secretaire_contact_id_contact_fk
        foreign key (id_contact) references contact (id_contact),
    constraint secretaire_personne_id_personne_fk
        foreign key (id_personne) references personne (id_personne)
);

create table if not exists formation_secretaire
(
    id_formation_secretaire int auto_increment
        primary key,
    id_secretaire           int not null,
    id_formation            int not null,
    constraint formation_secretaire_formation_id_formation_fk
        foreign key (id_formation) references formation (id_formation),
    constraint formation_secretaire_secretaire_id_secretaire_fk
        foreign key (id_secretaire) references secretaire (id_secretaire)
) charset = utf8mb4;

create table if not exists matiere
(
    id_matiere   int auto_increment
        primary key,
    id_formation int         not null,
    intitule     varchar(50) not null,
    constraint formation_matiere_fk
        foreign key (id_formation) references formation (id_formation)
);

create table if not exists etudiant
(
    id_etudiant  int auto_increment
        primary key,
    id_personne  int         null,
    id_formation int         not null,
    groupe       int         null,
    signature    longblob    null,
    adresse_mail varchar(50) null,
    constraint etudiant_formation_id_formation_fk
        foreign key (id_formation) references formation (id_formation),
    constraint etudiant_personne_id_personne_fk
        foreign key (id_personne) references personne (id_personne)
);

create table if not exists cours
(
    id_cours      int auto_increment
        primary key,
    id_matiere    int                    not null,
    date          date default curdate() not null,
    begin         time                   not null,
    end           time                   not null,
    id_professeur int                    not null,
    id_etat       int  default 5         not null,
    last_modif_date date default curdate() not null,
    last_modif_id int not null,
    constraint cours_data_id_data_fk
        foreign key (id_etat) references data (id_data),
    constraint cours_matiere_id_matiere_fk
        foreign key (id_matiere) references matiere (id_matiere),
    constraint cours_professeur_id_professeur_fk
        foreign key (id_professeur) references professeur (id_professeur),
    constraint cours_last_modif_id_personne_fk
        foreign key (last_modif_id) references personne (id_personne)
);

create table if not exists presence
(
    id_presence      int auto_increment
        primary key,
    id_etudiant      int not null,
    id_cours         int not null,
    id_etat_presence int not null,
    constraint presence_cours_id_cours_fk
        foreign key (id_cours) references cours (id_cours),
    constraint presence_data_id_data_fk
        foreign key (id_etat_presence) references data (id_data),
    constraint presence_etudiant_id_etudiant_fk
        foreign key (id_etudiant) references etudiant (id_etudiant)
);

create table if not exists password_reset_token
(
    id            int auto_increment
        primary key,
    token         varchar(255) null,
    adresse_email int          null,
    expiry_date   date         not null,
    constraint password_reset_token_contact_id_contact_fk
        foreign key (adresse_email) references contact (id_contact)
);

create table if not exists historique_fiche
(
    id_historique_fiche int auto_increment primary key,
    date                date                        not null,
    id_formation        int                         not null,
    url                 varchar(100)                not null,
    horaire             time default current_time() null,
    constraint formation_historique_fiche_fk
        foreign key (id_formation) references formation (id_formation)
);

create table if not exists token_connexion
(
    id_token              int auto_increment primary key,
    token                 varchar(255) not null,
    date_expiration_token timestamp    not null,
    email_connexion       varchar(255) not null,
    origine               varchar(255) not null
);

create table if not exists admin_compte
(
    email                 varchar(255) primary key,
    password              varchar(255) not null
);

create table if not exists log
(
    date_heure            datetime null,
    type                  varchar(255) null,
    commentaire           varchar(255) null,
    ip                    varchar(255) null,
    id                    bigint auto_increment primary key
);




