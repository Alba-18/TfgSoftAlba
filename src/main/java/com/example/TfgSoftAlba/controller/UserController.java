package com.example.TfgSoftAlba.controller;

import com.example.TfgSoftAlba.models.entity.User;
import com.example.TfgSoftAlba.models.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login(){
        return"login";
    }

    @GetMapping("/users/new")
    public String createUserForm(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "create_user";
    }
}
