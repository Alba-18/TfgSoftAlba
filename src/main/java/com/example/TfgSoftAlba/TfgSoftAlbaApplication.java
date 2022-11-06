package com.example.TfgSoftAlba;

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
		/**Article new1;
		new1 = new Article("Noticia de ultima hora 1","cuerponoticia1");
		newrepository.save(new1);

		Article new2;
		new2 = new Article("Noticia de ultima hora","cuerponoticia2");
		newrepository.save(new2);**/
	}
}
