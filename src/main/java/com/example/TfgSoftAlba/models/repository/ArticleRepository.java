package com.example.TfgSoftAlba.models.repository;

import com.example.TfgSoftAlba.models.entity.Article;

import antlr.collections.List;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

//@Repository
public interface ArticleRepository extends JpaRepository<Article,Long> {
    ArrayList<Article> findByIdIn(ArrayList<Long> ArticleIds);

}
