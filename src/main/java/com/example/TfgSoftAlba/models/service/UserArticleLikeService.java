package com.example.TfgSoftAlba.models.service;

import java.util.ArrayList;
import java.util.List;

import com.example.TfgSoftAlba.models.repository.UserArticleLikeRepository;


public class UserArticleLikeService {
    
     private final UserArticleLikeRepository userArticleLikeRepository;

    public UserArticleLikeService(UserArticleLikeRepository userArticleLikeRepository) {
        this.userArticleLikeRepository = userArticleLikeRepository;
    }

    public List<Long> getLikedNewsIdsByUserId(Long userId) {
        List<Long> likedNewsIds= userArticleLikeRepository.findNewsIdsByUserIdAndLiked(userId);
        return likedNewsIds;
    }

}
