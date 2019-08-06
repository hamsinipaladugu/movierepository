package com.dbs.movieapp.dao;

import java.util.List;

import com.dbs.movieapp.model.Movie;

public interface MovieDAO {
	
	Movie save(Movie movie);

	Movie update(long id, Movie movie);

    List<Movie> findAll();

    Movie findById(long id);

    void deleteMovie(long id);

}
