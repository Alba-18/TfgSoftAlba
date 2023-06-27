package com.example.TfgSoftAlba.models.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;

import com.example.TfgSoftAlba.models.entity.Article;

public interface ArticleService {

    public List<Article> listAllArticles();

    public Article get(Long id);

    public ArrayList<Article> getArticlesByIds(ArrayList<Long> ArticleIds);

    public int save(Article user, MultipartFile multipartFile) throws IOException;

    public Optional<Article> edit(Long id);

    public void delete(Long id);

    Page<Article> findPaginated(int pageNo, int pageSize);


}
