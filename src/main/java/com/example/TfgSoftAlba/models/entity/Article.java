package com.example.TfgSoftAlba.models.entity;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name= "Article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="sTitle", nullable = false, length = 50)
    private String sTitle;

    @Column(name="sBody", nullable = false, length = 500)
    private String sBody;

    @Lob
    @Column(name="Image", nullable = true)
    private byte[] Image;

    public Article(){}

    public Article(String sTitle, String sBody, byte[] image) {
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

    public byte[] getImage() {
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

    public void setImage(byte[] image) {
        Image = image;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", sTitle='" + sTitle + '\'' +
                ", sBody='" + sBody + '\'' +
                ", Image=" + Arrays.toString(Image) +
                '}';
    }
}
