package com.example.TfgSoftAlba.controller;

import com.example.TfgSoftAlba.models.entity.Article;
import com.example.TfgSoftAlba.models.entity.User;
import com.example.TfgSoftAlba.models.service.ArticleService;
import com.example.TfgSoftAlba.models.service.CustomUserDetails;
import com.example.TfgSoftAlba.models.service.UserService;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;
import java.security.Principal;
import java.util.concurrent.CompletableFuture;

import javax.tools.JavaFileObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private UserService userService;

    @GetMapping ({"/","/index"})
    public String index(Model model){

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        Object principal =  auth.getPrincipal();

        Long idUser = null;
        if (principal instanceof CustomUserDetails) {
            idUser = ((CustomUserDetails)principal).getId();
        }


        if(idUser != null){

            User user = userService.get(idUser);   
            model.addAttribute("Article", user.getArticles());

            // llamada a la api en Python
            // HttpClient client = HttpClient.newHttpClient();
            // HttpRequest httpRequest = HttpRequest.newBuilder(new URI(BASE_URL))
            //         .header("Accept", "application/json")
            //         .header("Content-Type", "application/json")
            //         .timeout(TIMEOUT_DURATION)
            //         .POST(HttpRequest.BodyPublishers.ofString(json.toString()))
            //         .build();
        
            // HttpResponse<String> httpResponse = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            // String jsonResponse = httpResponse.body();
        
            // JavaFileObject getSth = (JSONObject) jsonResponse;

        }else{
            model.addAttribute("Article", articleService.listAllArticles());
        }
        
        // System.out.print("pipipipi "+ idUser+" pipipipi");


        // model.addAttribute("Article", articleService.listAllArticles());

        return"index";
    }

    @GetMapping("/article/{id}")
    public String showSave(@PathVariable("id") Long id, Model model) {
        if (id != null && id != 0) {
        model.addAttribute("Article", articleService.get(id));
        } else {
        model.addAttribute("Article", new Article());
        }
        return "article";
    }

    @GetMapping ({"/about"})
    public String about(){        
        return"about";
    }
}
