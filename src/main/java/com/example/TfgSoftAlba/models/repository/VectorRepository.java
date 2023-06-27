
////BORRAR 
//// NO SE USA

package com.example.TfgSoftAlba.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import com.example.TfgSoftAlba.models.entity.Vector;

//@Repository
public interface VectorRepository extends JpaRepository<Vector,Long>{

    Vector findByUserId(Long idUser);
}
