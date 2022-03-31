package com.code.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.code.entity.MovieList;

public class ConsumeApi {
	
	private final String apiKey; 
	
	public ConsumeApi(String apiKey) {		
		this.apiKey = apiKey;
		
		if (apiKey == null || apiKey.isEmpty())
			throw new RuntimeException("Informe apiKey no arquivo properties");
	}

	public MovieList getTop250Movies() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<MovieList> response = restTemplate.getForEntity(
				"https://imdb-api.com/en/API/Top250Movies/" + apiKey, 
				MovieList.class);
		return response.getBody();
	}

}
