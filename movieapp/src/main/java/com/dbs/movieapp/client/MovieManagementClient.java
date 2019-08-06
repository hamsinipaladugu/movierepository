package com.dbs.movieapp.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dbs.movieapp.controller.MovieController;
import com.dbs.movieapp.model.Movie;

public class MovieManagementClient {
	
	private static  MovieController movieController;

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        movieController = applicationContext.getBean(MovieController.class);
        saveMovies();
        listAllMovies();
        fetchMovieDetailsById(12);
    }

    private static void fetchMovieDetailsById(int i) {
        System.out.println("Employee with id "+i +" is " + movieController.findById(i));
    }

    private static void listAllMovies() {
        movieController.listAll().forEach(System.out::println);
    }



    private static void saveMovies(){
        Movie movie = new Movie(12,"DDLJ", 180, 9);
        movieController.saveMovie(movie);
        movie = new Movie(15,"DJ", 10, 8);
        movieController.saveMovie(movie);
        movie = new Movie(11,"FSOG", 155, 9);
        movieController.saveMovie(movie);
    }
}

