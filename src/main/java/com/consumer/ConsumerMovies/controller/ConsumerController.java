package com.consumer.ConsumerMovies.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consumer.ConsumerMovies.dao.Consumer;
import com.consumer.ConsumerMovies.dao.Movie;
import com.consumer.ConsumerMovies.service.ConsumerService;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {
	
	@Autowired
	ConsumerService consumerService;
	
	List<Consumer> consumersList = new ArrayList();
	
	public ConsumerController() {
		
		consumersList = Stream.of(new Consumer(126426, "Kani", null),
				new Consumer(257, "Mani", null),
				new Consumer(1922, "Guni", null)
				).collect(Collectors.toList());
	}
	
	@RequestMapping(value = "/all/names")
	public List<Consumer> getAllCustomerNames() {
		return consumersList;
	}
	
	@RequestMapping(value = "/movielist")
	public List<Movie> getMoviesForaCustomer() {
		return consumerService.getMovies();
	}

}
