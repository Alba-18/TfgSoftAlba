
////BORRAR 
//// NO SE USA

package com.example.TfgSoftAlba.models.entity;

import javax.persistence.*;

@Entity
@Table(name= "User_Article_Sim")
public class UserArticleSim{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "article_id")
    private Long articleId;
                                                                                         
    @Column(name = "val_cos")
    private Double valCos;

    

    public UserArticleSim(){    

    }
    

    public UserArticleSim(Long userId, Long articleId, Double valCos)
    {
        this.userId = userId;
        this.articleId = articleId;
        this.valCos = valCos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Double getValCos() {
        return valCos;
    }

    public void setValCos(Double valCos) {
        this.valCos = valCos;
    }

    
}

