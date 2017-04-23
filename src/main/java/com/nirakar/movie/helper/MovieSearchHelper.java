package com.nirakar.movie.helper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nirakar.movie.dao.MovieSearchDAO;
import com.nirakar.movie.data.Movie;

/**
 * THis class interacts between Restfull web service layer and DB layer
 * 
 * @author NIRAKAR
 * 
 */
@Component
public class MovieSearchHelper {

	@Autowired
	MovieSearchDAO movieSearchUsingDBImpl;

	/**
	 * Get the Movie Details For specific Rank
	 * 
	 * @param rank
	 * @return
	 */
	public Movie getMovieByRank(int rank) {
		return movieSearchUsingDBImpl.getMovieByRank(rank);

	}

	/**
	 * Method used for returning Movie details by year.
	 * 
	 * @param year
	 * @return Movie
	 */
	public Movie getMovieByYear(int year) {
		return movieSearchUsingDBImpl.getMovieByYear(year);
	}

	/**
	 * Method used for returning Movie details by Title.
	 * 
	 * @param title
	 * @return Movie
	 */
	Movie getMovieByTitle(String title) {
		return movieSearchUsingDBImpl.getMovieByTitle(title);
	}

	/**
	 * Method used for returning Movie details by Director Name.
	 * 
	 * @param directors
	 * @return Movie
	 */
	public Movie getMovieByDirector(String directors) {
		return movieSearchUsingDBImpl.getMovieByDirector(directors);
	}

	/**
	 * Method used for returning Movie details by Geners.
	 * 
	 * @param geners
	 * @return Movie
	 */
	public Movie getMovieByGeners(String geners) {
		return movieSearchUsingDBImpl.getMovieByGeners(geners);
	}

	/**
	 * Method used for returning Movie details by Number of Votes.
	 * 
	 * @param noOfVote
	 * @return Movie
	 */
	public Movie getMovieByNoOfVote(int noOfVote) {
		return movieSearchUsingDBImpl.getMovieByNoOfVote(noOfVote);
	}

	/**
	 * Method used for returning Movie details by Runtime duration.
	 * 
	 * @param runtime
	 * @return Movie
	 */
	public Movie getMovieByRuntime(int runtime) {
		return movieSearchUsingDBImpl.getMovieByRuntime(runtime);
	}

	/**
	 * Method used for returning Movie details by passing Date.
	 * 
	 * @param date
	 * @return Movie
	 */
	public Movie getMovieByRelease(String date) {
		return movieSearchUsingDBImpl.getMovieByRelease(date);
	}

	/**
	 * Method used for returning Movie details by IMDB rating.
	 * 
	 * @param rating
	 * @return Movie
	 */
	public Movie getMovieByIMDBRating(int rating) {
		return movieSearchUsingDBImpl.getMovieByIMDBRating(rating);
	}

	/**
	 * Method used for returning Movie details by IMDB Url.
	 * 
	 * @param Url
	 * @return Movie
	 */
	public Movie getMovieByUrl(String Url) {
		return movieSearchUsingDBImpl.getMovieByUrl(Url);
	}

	public List<Movie> getMovieBetweenYear(int firstYear,int secondYear){
		
		return movieSearchUsingDBImpl.getMovieBetweenYear(firstYear,secondYear);
		
	}
}
