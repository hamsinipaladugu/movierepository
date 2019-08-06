package com.dbs.movieapp.service;

import java.util.List;

import com.dbs.movieapp.model.Movie;

public interface MovieService {


	   Movie saveMovie(Movie movie);

	   List<Movie> listAll();

	   Movie findById(long id);

	   void deleteMovie(long id);
	
}
