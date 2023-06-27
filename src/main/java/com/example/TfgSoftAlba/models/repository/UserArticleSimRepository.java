
////BORRAR 
//// NO SE USA

package com.example.TfgSoftAlba.models.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import com.example.TfgSoftAlba.models.entity.UserArticleSim;

//@Repository
public interface UserArticleSimRepository extends JpaRepository<UserArticleSim,Long>{

    Optional<UserArticleSim> findByUserIdAndArticleId(Long userId, Long articleId);

    List<UserArticleSim> findByUserId(Long userId);

    List<UserArticleSim> findByUserIdAndValCosNot(Long userId, Double valCos);
    
}
