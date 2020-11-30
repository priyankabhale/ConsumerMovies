package com.consumer.ConsumerMovies.dao;

public class Consumer {
	private int phone_no;
	private String cust_name;
	private Movie movie;

	public Consumer() {
		super();
	}

	public Consumer(int phone_no, String cust_name, Movie movie) {
		super();
		this.phone_no = phone_no;
		this.cust_name = cust_name;
		this.movie = movie;
	}

	public int getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Consumer [phone_no=" + phone_no + ", cust_name=" + cust_name + ", movie=" + movie + "]";
	}

}
