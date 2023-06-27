package com.example.TfgSoftAlba.models.service.Impl;

import com.example.TfgSoftAlba.models.entity.Article;
import com.example.TfgSoftAlba.models.entity.UserArticleLike;
//import com.example.TfgSoftAlba.models.entity.UserArticleSim;
import com.example.TfgSoftAlba.models.repository.ArticleRepository;
import com.example.TfgSoftAlba.models.repository.UserArticleLikeRepository;
//import com.example.TfgSoftAlba.models.repository.UserArticleSimRepository;
import com.example.TfgSoftAlba.models.service.ArticleService;
import com.example.TfgSoftAlba.util.CustomUserDetails;
import com.example.TfgSoftAlba.util.FileUploadUtil;
import com.example.TfgSoftAlba.util.Stemm_es;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.io.ClassPathResource;
import org.springframework.data.domain.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
//import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

@Service
public class ArticleServiceImpl implements ArticleService {


    @Autowired
    private ArticleRepository articleRrepository;

    //@Autowired
    //private UserArticleSimRepository userArticleSimRepository;

    @Autowired
    private UserArticleLikeRepository userArticleLikeRepository;

    @Override
    public List<Article> listAllArticles() {
        return articleRrepository.findAll();
    }

    public ArrayList<Article> getArticlesByIds(ArrayList<Long> ArticleIds) {
        return articleRrepository.findByIdIn(ArticleIds);
    }

    @Override
    public Article get(Long id) {
        return articleRrepository.findById(id).get();
    }

    @Override
	public int save(Article article, MultipartFile multipartFile) throws IOException {
		int res=0;
		Article newArticle = articleRrepository.save(article);
		if(!newArticle.equals(null)) {
			res=1; 
            String fileName = newArticle.getId().toString();
            //Article newArticleWithVector = generateVector(newArticle);

            if(!multipartFile.isEmpty()){
                FileUploadUtil.saveFile(fileName, multipartFile);
                //newArticleWithVector.setImage(fileName);
            }            
            
            articleRrepository.save(newArticle); 
		}
		return res;
	}

    @Override
    public Optional<Article> edit(Long id) {
        return articleRrepository.findById(id);
    }

    
    @Override
	public void delete(Long id) {
		articleRrepository.deleteById(id);		
	}


    @Override
    public Page<Article> findPaginated(int pageNo, int pageSize) {

        //verifica si hay usuario con sesion iniciada
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Object principal =  auth.getPrincipal();
        Long idUser = null; 
        if (principal instanceof CustomUserDetails)  idUser = ((CustomUserDetails)principal).getId(); 
    
        List<Article> allContent = articleRrepository.findAll();

        int totalElements = allContent.size();
        int fromIndex = (pageNo - 1) * pageSize;
        int toIndex = Math.min(fromIndex + pageSize, totalElements);
        List<Article> content = allContent.subList(fromIndex, toIndex);

        Pageable pageable = PageRequest.of(pageNo - 1, pageSize, Sort.by(Sort.Direction.DESC, "id"));
        Page<Article> page = new PageImpl<>(content, pageable, totalElements);
        
        return page;
    }

}
