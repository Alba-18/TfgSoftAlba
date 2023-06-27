package com.example.TfgSoftAlba.models.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import com.example.TfgSoftAlba.models.entity.UserArticleLike;

//@Repository
public interface UserArticleLikeRepository extends JpaRepository<UserArticleLike,Long>{

    Optional<UserArticleLike> findByUserIdAndArticleId(Long userId, Long articleId);

    @Query("SELECT article_id FROM user_article_like WHERE user_article_id.user_id = :userId AND user_article_id.active = 1")
    List<Long> findNewsIdsByUserIdAndLiked(Long userId);
    
}
