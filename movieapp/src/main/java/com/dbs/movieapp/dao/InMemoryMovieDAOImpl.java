package com.dbs.movieapp.dao;

import org.springframework.stereotype.Repository;

import com.dbs.movieapp.model.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("inMemory")
public class InMemoryMovieDAOImpl implements MovieDAO{
	
	private static final List<Movie> movieList = new ArrayList<Movie>();
	
	 @Override
	    public Movie save(Movie movie) {
	        movieList.add(movie);
	        System.out.println("Saved the employee in the in Memory list "+movie);
	        return movie;
	    }

	    @Override
	    public Movie update(long id, Movie movie) {
	        Optional<Movie> optionalMovie = movieList.stream().filter(movie1 -> movie1.getId() == id).findFirst();
	        optionalMovie.ifPresent(movie1 -> movieList.add(movieList.indexOf(movie), movie));
	        return movie;
	    }

	    @Override
	    public List<Movie> findAll() {
	        return movieList;
	    }

	    @Override
	    public Movie findById(long id) {
	        Optional<Movie> optionalMovie = movieList.stream().filter(movie1 -> movie1.getId() == id).findFirst();
	        if(optionalMovie.isPresent()){
	            return optionalMovie.get();
	        }
	        return null;
	    }

	    @Override
	    public void deleteMovie(long id) {
	    	movieList.removeIf(movie -> movie.getId() == id);
	    }
	
}