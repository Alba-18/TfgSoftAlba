package com.example.TfgSoftAlba.models.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import com.example.TfgSoftAlba.models.entity.Article;
import com.example.TfgSoftAlba.models.entity.User;
import com.example.TfgSoftAlba.models.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

	@Autowired
	private ArticleService articleService;


    @Override
    public List<User> listAllUsers() {
        return userRepository.findAll();
    }

	
    @Override
	public User get(long id) {
		User user =  userRepository.findById(id).get();
		return user;
	}
    @Override
	public User save(User user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(user.getPassword());

		User userR = new User(user.getEmail(), user.getName(), encodedPassword);

		
		ArrayList articles = new ArrayList();
		int idArticle;
		int nroArticle;

		
		nroArticle = (int) (Math.random() * 3 + 2);
		// Genera 3 numeros entre 1 y 10 //algoritmo para aagregar 3 articulos aleatorios a un nuevo usuario
		for (int i = 0; i < nroArticle; i++) {
			idArticle = (int) (Math.random() * 10 + 1);
			if (articles.contains(idArticle)) {
				i--;
			} else {
				articles.add(idArticle);

				Article article =  articleService.get((long) idArticle);
				userR.addArticle(article);
			}
		}	

        
		return userRepository.save(userR);
	}

    @Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByEmail(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found");
		}
		return new CustomUserDetails(user);
	}

	
}
