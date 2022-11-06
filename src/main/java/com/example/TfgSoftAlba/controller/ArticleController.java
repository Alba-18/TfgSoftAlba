package com.example.TfgSoftAlba.controller;

import com.example.TfgSoftAlba.models.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping ({"/","/index"})
    public String index(Model model){
        model.addAttribute("Article", articleService.listAllNews());
        return"home";
    }
}
