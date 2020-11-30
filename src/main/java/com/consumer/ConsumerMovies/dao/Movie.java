package com.consumer.ConsumerMovies.dao;

public class Movie {
	private int id;
	private String movie_name;
	private String rating;
	
	public Movie() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", movie_name=" + movie_name + ", rating=" + rating + "]";
	}
	
}
