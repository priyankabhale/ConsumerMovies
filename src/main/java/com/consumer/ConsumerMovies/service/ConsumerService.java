package com.consumer.ConsumerMovies.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.consumer.ConsumerMovies.dao.Movie;

@Service
public class ConsumerService {
	
	@Autowired
	RestTemplate restTemplate;
	
	public List<Movie> getMovies() {
//		Movie movie = restTemplate.getForObject("http://movie-service/catalog/single", Movie.class);
		Movie [] arr = restTemplate.getForObject("http://movie-service/catalog/single", Movie[].class);
		List<Movie> list = Arrays.asList(arr);
		return list;
	}

}
