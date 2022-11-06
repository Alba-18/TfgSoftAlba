package com.example.TfgSoftAlba.models.service;

import com.example.TfgSoftAlba.models.entity.Article;
import com.example.TfgSoftAlba.models.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleRepository repository;

    @Override
    public List<Article> listAllNews() {
        return repository.findAll();
    }
}
