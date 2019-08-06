package com.dbs.movieapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.dbs.movieapp.model.Movie;


@Repository("h2Dao")
public class MySQLMovieDAOImpl implements MovieDAO{
	
	private JdbcTemplate jdbcTemplate;

    @Autowired
    public MySQLMovieDAOImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }


	public Movie save(Movie movie) {
		// TODO Auto-generated method stub
		this.jdbcTemplate.execute("insert into movie values ("+movie.getId()+",'"+movie.getName()+"',"+movie.getDuration()+","+movie.getRating()+")");    	
		return movie;
	}

	public Movie update(long id, Movie movie) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Movie> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Movie findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteMovie(long id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
