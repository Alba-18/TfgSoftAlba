package com.example.TfgSoftAlba.controller;

import com.example.TfgSoftAlba.models.service.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private NewService newService;

    @GetMapping ({"/","/index"})
    public String index(Model model){
        model.addAttribute("news",newService.listAllNews());
        return"home";
    }
}
