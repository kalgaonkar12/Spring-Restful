package com.nirakar.movie.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.nirakar.movie.constants.MovieDBConstants;
import com.nirakar.movie.dao.MovieSearchDAO;
import com.nirakar.movie.data.Movie;
import com.nirakar.movie.data.rowmapper.MovieRowMapper;
import com.nirakar.movie.util.MovieListUtil;

/**
 * This class used as implementation of Database . At loading of this class ,
 * this class will execute first and invoke the data base and load the data to a
 * Map Object so that no repetition of invocation required .
 * 
 * @author NIRAKAR
 * 
 */
//@Component("movieSearchUsingDBImpl")
@Component
public class MovieSearchUsingDBImpl implements MovieSearchDAO {
	/**
	 * Logger Instantiation
	 */
	private static Logger logger = Logger
			.getLogger(MovieSearchUsingDBImpl.class.getName());

	

	/**
	 * Variable used to hold the Data which will be populated by DB call.
	 */
	List<Movie> movieList = new ArrayList<Movie>();
	/**
	 * Map variable used to hold the Movie Object as Object and Rank as a Key.
	 */
	Map<Integer, Movie> findMovieByRankMap = new HashMap<Integer, Movie>();

	/**
	 * Map variable used to hold the variable used for Movie object and Year as
	 * a Key.
	 */
	Map<Integer, Movie> findMovieByYearMap = new HashMap<Integer, Movie>();

	/**
	 ** Map variable used to hold the variable used for Movie object and Ttile as
	 * a Key.
	 */
	Map<String, Movie> findMovieByTitleMap = new HashMap<String, Movie>();

	/**
	 * * Map variable used to hold the variable used for Movie object and
	 * Director as a Key.
	 */
	Map<String, Movie> findMovieByDirectorMap = new HashMap<String, Movie>();
	/**
	 * * Map variable used to hold the variable used for Movie object and Geners as a Key.
	 */
	Map<String, Movie> findMovieByGenersMap = new HashMap<String, Movie>();
	/**
	 * * Map variable used to hold the variable used for Movie object and no of votes as a Key.
	 */
	Map<Long, Movie> findMovieByNoOfVoteMap = new HashMap<Long, Movie>();
	/**
	 * * Map variable used to hold the variable used for Movie object and
	 * duration (runtime) as a Key.
	 */
	Map<Integer, Movie> findMovieByRuntimeMap = new HashMap<Integer, Movie>();

	/**
	 * * Map variable used to hold the variable used for Movie object and
	 * release date as a Key.
	 */
	Map<String, Movie> findMovieByReleaseMap = new HashMap<String, Movie>();
	/**
	 * * Map variable used to hold the variable used for Movie object and IMDB
	 * rating as a Key.
	 */
	Map<Integer, Movie> findMovieByIMDBRatingMap = new HashMap<Integer, Movie>();
	/**
	 * * Map variable used to hold the variable used for Movie object and movie
	 * Url as a Key.
	 */
	Map<String, Movie> findMovieByUrlMap = new HashMap<String, Movie>();

	/**
	 * Util class Initialized through Spring.
	 */
	@Autowired
	MovieListUtil movieUtilList;

	/**
	 * variable used to hold Jdbc Template.
	 */
	private JdbcTemplate jdbcTemplate;

	/**
	 * Getter method.
	 * 
	 * @return JdbcTemplate
	 */
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	/**
	 * Setter Method.
	 * 
	 * @param jdbcTemplate
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * Method used for DB initiation.
	 */
	@PostConstruct
	public void init() {
		logger.info("Loading the data from DB....");
		populateDB();
		findMovieByRankMap = movieUtilList
				.preparemovieResultsByRanks(movieList);
		findMovieByYearMap = movieUtilList.preparemovieResultsByYear(movieList);
		findMovieByTitleMap = movieUtilList
				.preparemovieResultsByTitle(movieList);
		findMovieByDirectorMap = movieUtilList
				.preparemovieResultsByDiector(movieList);
		findMovieByGenersMap = movieUtilList
				.preparemovieResultsByGeners(movieList);
		findMovieByNoOfVoteMap = movieUtilList
				.preparemovieResultsByNoOfVote(movieList);
		findMovieByRuntimeMap = movieUtilList
				.preparemovieResultsByRuntime(movieList);
		findMovieByReleaseMap = movieUtilList
				.preparemovieResultsByRelease(movieList);
		findMovieByIMDBRatingMap = movieUtilList
				.preparemovieResultsByIMDBRating(movieList);
		findMovieByUrlMap = movieUtilList.preparemovieResultsByURL(movieList);

	}

	/**
	 * Method used for DB invoke.
	 */
	private void populateDB() {
		logger.info("**********************PopulateDB method executed*****************************");
		movieList = jdbcTemplate.query(MovieDBConstants.SQL_SELECT, new MovieRowMapper());
		System.out.println(movieList.size());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nirakar.movie.dao.MovieSearchDAO#findMovieByRank(int)
	 */
	@Override
	@Cacheable("movieResultsByRanks")
	//@Cacheable(value="movieResultsByRanks", key="#rank")
	public Movie getMovieByRank(int rank) {
		logger.info("**********************Find Movie by Rank executed*****************************");
		return findMovieByRankMap.get(rank);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nirakar.movie.dao.MovieSearchDAO#findMovieByYear(int)
	 */
	@Override
	public Movie getMovieByYear(int year) {
		logger.info("**********************Find Movie by Year executed*****************************");
		return findMovieByYearMap.get(year);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.nirakar.movie.dao.MovieSearchDAO#findMovieByTitle(java.lang.String)
	 */
	@Override
	public Movie getMovieByTitle(String title) {
		logger.info("**********************Find Movie by Title executed*****************************");
		return findMovieByTitleMap.get(title);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.nirakar.movie.dao.MovieSearchDAO#findMovieByDirector(java.lang.String
	 * )
	 */
	@Override
	public Movie getMovieByDirector(String directors) {
		logger.info("**********************Find Movie by Director executed*****************************");
		return findMovieByDirectorMap.get(directors);
	}

	@Override
	public Movie getMovieByGeners(String geners) {
		logger.info("**********************Find Movie by Geners executed*****************************");
		return findMovieByGenersMap.get(geners);
	}

	@Override
	public Movie getMovieByNoOfVote(int noOfVote) {
		logger.info("**********************Find Movie by No of Votes executed*****************************");
		return findMovieByNoOfVoteMap.get(noOfVote);
	}

	@Override
	public Movie getMovieByRuntime(int runtime) {
		logger.info("**********************Find Movie by Runtime executed*****************************");
		return findMovieByRuntimeMap.get(runtime);
	}

	@Override
	public Movie getMovieByRelease(String date) {
		logger.info("**********************Find Movie by Runtime executed*****************************");
		return findMovieByReleaseMap.get(date);
	}

	@Override
	public Movie getMovieByIMDBRating(int rating) {
		logger.info("**********************Find Movie by Runtime executed*****************************");
		return findMovieByIMDBRatingMap.get(rating);
	}

	@Override
	public Movie getMovieByUrl(String Url) {
		logger.info("**********************Find Movie by Runtime executed*****************************");
		return findMovieByUrlMap.get(Url);
	}

	@Override
	public List<Movie> getMovieBetweenYear(int firstYear, int secondYear) {
		logger.info("**********************getMovieBetweenYear method executed*****************************");
		
		movieList = jdbcTemplate.query(MovieDBConstants.MOVIE_BETWEEN_TWO_YEAR,new Object[] { firstYear,secondYear}, new MovieRowMapper());
		System.out.println(movieList.size());
		
		//movieUtilList.getMovieBetweenYear(firstYear,secondYear);
		return movieList;
	}

}
