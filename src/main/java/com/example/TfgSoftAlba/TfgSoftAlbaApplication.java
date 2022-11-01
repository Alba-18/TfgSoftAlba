package com.example.TfgSoftAlba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class TfgSoftAlbaApplication {

	public static void main(String[] args) {
		System.setProperty("server.port", "8080");
		SpringApplication.run(TfgSoftAlbaApplication.class, args);
	}

}
