package com.example.TfgSoftAlba.models.entity;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@Table(name= "Article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="sTitle", nullable = false, length = 250)
    private String sTitle;

    @Column(name="sBody", nullable = false, length = 2500)
    private String sBody;

    @Lob
    @Column(name="Image", nullable = true)
    private String Image;

    @ManyToMany(mappedBy = "articles")
    public List<User> users = new ArrayList<>();

    
    public Article(){}

    public Article(String sTitle, String sBody, String image) {
        this.sTitle = sTitle;
        this.sBody = sBody;
        this.Image= image;
    }

    public Long getId() {
        return id;
    }

    public String getsTitle() {
        return sTitle;
    }

    public String getsBody() {
        return sBody;
    }

    public String getImage() {
        return Image;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setsTitle(String sTitle) {
        this.sTitle = sTitle;
    }

    public void setsBody(String sBody) {
        this.sBody = sBody;
    }

    public void setImage(String image) {
        Image = image;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", sTitle='" + sTitle + '\'' +
                ", sBody='" + sBody + '\'' +
                ", Image=" + Image +
                '}';
    }
}
