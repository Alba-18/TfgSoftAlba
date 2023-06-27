package com.example.TfgSoftAlba.models.repository;

import com.example.TfgSoftAlba.models.entity.User;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

//@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    public User findByEmail(String email);
   
    boolean existsByEmail(String email);


    User findByEmailAndName(String email, String name);
}
