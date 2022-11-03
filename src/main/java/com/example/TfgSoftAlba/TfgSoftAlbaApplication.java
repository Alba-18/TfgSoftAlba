package com.example.TfgSoftAlba;

import com.example.TfgSoftAlba.models.entity.news;
import com.example.TfgSoftAlba.models.repository.NewRepository;
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
	public NewRepository newrepository;

	@Override
	public void run(String... args) throws Exception {
		news new1= new news("Pepe y luis","kjhdjhdghjwdekehdkjwejwhdwekdwejkwhwhdj");
		newrepository.save(new1);

		news new2= new news("Noticia de ultima hora","kjhdjhdghjwdekehdkjwejwhdwekdwejkwhwhdj");
		newrepository.save(new2);
	}
}
