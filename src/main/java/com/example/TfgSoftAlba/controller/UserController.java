package com.example.TfgSoftAlba.controller;


import com.example.TfgSoftAlba.models.entity.User;
import com.example.TfgSoftAlba.models.service.ArticleService;
import com.example.TfgSoftAlba.models.service.UserService;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@ModelAttribute("user")
	public User returnNewUserRegisterDTO() {
		return new User();
	}

	@GetMapping("/register")
	public String showRegisterForm() {
		return "register";
	}
	
	@PostMapping("/register")
	public String registrarCuentaDeUsuario(@ModelAttribute("user") User regiserDTO) {
		

		userService.save(regiserDTO);

		return "redirect:/register?exito";
	}



    @GetMapping("/login")
    public String login(){
        return"login";
    }

}
