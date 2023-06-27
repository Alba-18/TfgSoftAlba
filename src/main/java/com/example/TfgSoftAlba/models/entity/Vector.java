
////BORRAR 
//// NO SE USA

package com.example.TfgSoftAlba.models.entity;

import javax.persistence.*;

import org.json.simple.JSONObject;

@Entity
@Table(name = "vector")
public class Vector {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
    
    @Lob()
    @Column
	private JSONObject vector;

    public Vector(){}

    public Vector(User user, JSONObject vector) {
        super();
        this.user = user;
        this.vector = vector;
    }

    public Vector(Long id, User user, JSONObject vector) {
        super();
        this.id = id;
        this.user = user;
        this.vector = vector;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public JSONObject getVector() {
        return vector;
    }

    public void setVector(JSONObject vector) {
        this.vector = vector;
    }
    
}
