package com.example.TfgSoftAlba;

import com.example.TfgSoftAlba.models.entity.Article;
import com.example.TfgSoftAlba.models.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TfgSoftAlbaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TfgSoftAlbaApplication.class, args);
	}

	@Autowired
	public ArticleRepository articleRepository;


	@Override
	public void run(String... args) throws Exception {
		/**Article article1;
		article1 = new Article("Noticia de ultima hora 1","cuerponoticia1");
		articleRepository.save(article1);

		Article article2;
		article2 = new Article("Noticia de ultima hora","cuerponoticia2");
		articleRepository.save(article2);**/
	}
}
