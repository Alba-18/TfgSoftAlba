package com.example.TfgSoftAlba.models.entity;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name= "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="sEmail", nullable = false, length = 50)
    private String sEmail;

    @Column(name="sName", nullable = false, length = 500)
    private String sName;

    @Column(name="sPassword", nullable = true)
    private String sPassword;

    public User(){}

    public User(String sEmail, String sName, String sPassword) {
        this.sEmail = sEmail;
        this.sName = sName;
        this.sPassword = sPassword;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsPassword() {
        return sPassword;
    }

    public void setsPassword(String sPassword) {
        this.sPassword = sPassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", sEmail='" + sEmail + '\'' +
                ", sName='" + sName + '\'' +
                ", sPassword='" + sPassword + '\'' +
                '}';
    }
}
