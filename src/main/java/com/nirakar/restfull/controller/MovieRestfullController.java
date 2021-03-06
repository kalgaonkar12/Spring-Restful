package com.nirakar.restfull.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nirakar.movie.data.Movie;
import com.nirakar.movie.helper.MovieSearchHelper;

/**
 * This class is used as Restfull controller
 * @author NIRAKAR
 *
 */
@RestController
public class MovieRestfullController {

	@Autowired
	MovieSearchHelper movieSearchHelper;

	/**
	 * Method used as getting Movie details by using rank number
	 * @param rank
	 * @return
	 */
	@RequestMapping(value = "/GetRank/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Movie> getMovieByRank(@PathVariable("id") int rank) {// ,
																				// @RequestBody
																				// Employee
																				// employee)
																				// {

		// MovieSearchHelper movieSearchHelper = new MovieSearchHelper();
		Movie movie = movieSearchHelper.getMovieByRank(rank);
		HttpHeaders headers = new HttpHeaders();

		headers.add("Number Of Records Found", "1");
		return new ResponseEntity<Movie>(movie, headers, HttpStatus.OK);
	}

	@RequestMapping(value = "/GetYear/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Movie> getMovieByYear(@PathVariable("id") int year) {// @RequestBody Employee employee) {
		Movie movie = movieSearchHelper.getMovieByYear(year);
		HttpHeaders headers = new HttpHeaders();

		headers.add("Number Of Records Found", "1");
		return new ResponseEntity<Movie>(movie, headers, HttpStatus.OK);
	}

	/**
	 * This method gives a list of Movies in between two years. 
	 * @param firstY
	 * @param secondY
	 * @return
	 */
	@RequestMapping(value = "/GetYear/{firstYear}/{secondYear}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Movie>> getMovieBetweenYear(
			@PathVariable("firstYear") int firstY,
			@PathVariable("secondYear") int secondY) {// , @RequestBody Employee employee) {
	
		List<Movie> movies = movieSearchHelper.getMovieBetweenYear(firstY,secondY);
		HttpHeaders headers = new HttpHeaders();

		headers.add("Number Of Records Found", "1");
		
		return new ResponseEntity<List<Movie>>(movies, headers, HttpStatus.OK);
	}
}
