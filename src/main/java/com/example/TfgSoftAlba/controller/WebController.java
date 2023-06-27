package com.example.TfgSoftAlba.controller;

import com.example.TfgSoftAlba.models.entity.Article;
import com.example.TfgSoftAlba.models.entity.Rol;
import com.example.TfgSoftAlba.models.entity.User;
import com.example.TfgSoftAlba.models.entity.UserArticleLike;
import com.example.TfgSoftAlba.models.repository.UserArticleLikeRepository;
import com.example.TfgSoftAlba.models.service.ArticleService;
import com.example.TfgSoftAlba.models.service.UserArticleLikeService;
import com.example.TfgSoftAlba.models.service.UserService;
import com.example.TfgSoftAlba.util.CustomUserDetails;
import com.example.TfgSoftAlba.util.UserArticleLikeService;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

@Controller
public class WebController {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private UserService userService;

    @Autowired
    private UserArticleLikeService userArticleLikeService;

    @Autowired
    private UserArticleLikeRepository userArticleRepository;


    @GetMapping ({"/","/index"})
    public String index(Model model){

        return findPaginated(1, model);  
      //  return "index";
    }

    @GetMapping("/page/{pageNo}")
    public String findPaginated(@PathVariable(value = "pageNo") int pageNo, Model model) {
        int pageSize = 6;

        Page<Article> page = articleService.findPaginated(pageNo, pageSize);
        List<Article> listArticles = page.getContent();

        model.addAttribute("currentPage", pageNo);
        model.addAttribute("totalPages", page.getTotalPages());
        model.addAttribute("totalItems", page.getTotalElements());
        model.addAttribute("Articles", listArticles);



        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Object principal =  auth.getPrincipal();
        Long idUser = null;
        if (principal instanceof CustomUserDetails)  idUser = ((CustomUserDetails)principal).getId();

        if(idUser != null){ 
            User usuario = userService.get(idUser);
            Collection<Rol> roles = usuario.getRoles();
            Rol rol =  roles.iterator().next();
            model.addAttribute("rol", rol.getName());
        }

        return "index";
    }

    @GetMapping("/favorites")
    public String showLikedNews(Model model, Authentication authentication){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Object principal =  auth.getPrincipal();
        Long idUser = null;
        if (principal instanceof CustomUserDetails)  idUser = ((CustomUserDetails)principal).getId();
        ArrayList<Long> likedNewsIds = (ArrayList<Long>) userArticleLikeService.getLikedNewsIdsByUserId(idUser);
        ArrayList<Article> likedArticles = articleService.getArticlesByIds(likedNewsIds);
        model.addAttribute("likedArticles", likedArticles);
        return "likedArticles";
    }
}