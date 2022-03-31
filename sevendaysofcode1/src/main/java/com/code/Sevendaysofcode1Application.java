package com.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import com.code.entity.MovieList;
import com.code.service.ConsumeApi;

@SpringBootApplication
public class Sevendaysofcode1Application implements CommandLineRunner {
	
	@Autowired
    private Environment env;

	public static void main(String[] args) {
		SpringApplication.run(Sevendaysofcode1Application.class, args);		
	}

	@Override
	public void run(String... args) throws Exception {
		ConsumeApi api = new ConsumeApi(env.getProperty("apikey"));
		MovieList top250Movies = api.getTop250Movies();
		top250Movies.getItems(). forEach(movie -> System.out.println(movie));		
	}

}
