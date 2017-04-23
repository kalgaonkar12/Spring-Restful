package com.nirakar.movie.dao;

import java.util.List;

import com.nirakar.movie.data.Movie;

/**
 * Defines contract of various methods to search specific Movie . For example
 * Search by IMDB rank ,name,year etc...
 * 
 * @author NIRAKAR Jul 23, 2016
 */
public interface MovieSearchDAO {

	/**
	 * Method used for returning Movie details by Rank.
	 * 
	 * @param rank
	 * @return Movie
	 */
	Movie getMovieByRank(int rank);

	/**
	 * Method used for returning Movie details by year.
	 * 
	 * @param year
	 * @return Movie
	 */
	Movie getMovieByYear(int year);

	/**
	 * Method used for returning Movie details by Title.
	 * 
	 * @param title
	 * @return Movie
	 */
	Movie getMovieByTitle(String title);

	/**
	 * Method used for returning Movie details by Director Name.
	 * 
	 * @param directors
	 * @return Movie
	 */
	Movie getMovieByDirector(String directors);

	/**
	 * Method used for returning Movie details by Geners.
	 * 
	 * @param geners
	 * @return Movie
	 */
	Movie getMovieByGeners(String geners);

	/**
	 * Method used for returning Movie details by Number of Votes.
	 * 
	 * @param noOfVote
	 * @return Movie
	 */
	Movie getMovieByNoOfVote(int noOfVote);

	/**
	 * Method used for returning Movie details by Runtime duration.
	 * 
	 * @param runtime
	 * @return Movie
	 */
	Movie getMovieByRuntime(int runtime);

	/**
	 * Method used for returning Movie details by passing Date.
	 * 
	 * @param date
	 * @return Movie
	 */
	Movie getMovieByRelease(String date);

	/**
	 * Method used for returning Movie details by IMDB rating.
	 * 
	 * @param rating
	 * @return Movie
	 */
	Movie getMovieByIMDBRating(int rating);

	/**
	 * Method used for returning Movie details by IMDB Url.
	 * 
	 * @param Url
	 * @return Movie
	 */
	Movie getMovieByUrl(String Url);
	
	/**
	 * Methos used to return List of Movies in between two Years
	 * @param firstYear
	 * @param secondYear
	 * @return
	 */
	List<Movie> getMovieBetweenYear(int firstYear,int secondYear);

}
