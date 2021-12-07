package com.iut.james.beans;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Lob
    @Column(name = "lastName", nullable = false)
    private String lastName;

    @Lob
    @Column(name = "salt", nullable = false)
    private String salt;

    @Lob
    @Column(name = "password", nullable = false)
    private String password;

    @Lob
    @Column(name = "mail", nullable = false)
    private String mail;

    @Lob
    @Column(name = "phone", nullable = false)
    private String phone;

    @ManyToOne(optional = false)
    @JoinColumn(name = "typeID", nullable = false)
    private UserType typeID;

    public UserType getTypeID() {
        return typeID;
    }

    public void setTypeID(UserType typeID) {
        this.typeID = typeID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}