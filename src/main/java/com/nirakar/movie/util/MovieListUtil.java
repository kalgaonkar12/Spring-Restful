package com.nirakar.movie.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.nirakar.movie.data.Movie;

/**
 * THis class can be used as an Util class . Various methods which are defined
 * in DAO can be implemented in this class.
 * 
 * @author NIRAKAR
 * 
 */
@Component
public class MovieListUtil {

	/**
	 * This method prepares a Map object consists of Int as Key and Movie as an
	 * Object.
	 * 
	 * @param List
	 * @return Map
	 */
	@SuppressWarnings("javadoc")
	public Map<Integer, Movie> preparemovieResultsByRanks(List<Movie> lt) {
		Map<Integer, Movie> mp = new HashMap<Integer, Movie>();
		for (Movie m : lt) {
			mp.put(m.getRank(), m);
		}
		return mp;
	}

	/**
	 * This method prepares a Map object consists of Integer(year) as Key and
	 * Movie as an Object.
	 * 
	 * @param lt
	 * @return Map<String,Movie>
	 */
	public Map<Integer, Movie> preparemovieResultsByYear(List<Movie> lt) {
		Map<Integer, Movie> mp = new HashMap<Integer, Movie>();
		for (Movie m : lt) {
			mp.put(m.getYear(), m);
		}
		return mp;
	}

	/**
	 * This method prepares a Map object consists of String(Title) as Key and
	 * Movie as an Object.
	 * 
	 * @param movieList
	 * @return Map<String,Movie>
	 */
	public Map<String, Movie> preparemovieResultsByTitle(List<Movie> movieList) {
		Map<String, Movie> mp = new HashMap<String, Movie>();
		for (Movie m : movieList) {
			mp.put(m.getTitle(), m);
		}
		return mp;
	}

	/**
	 * This method prepares a Map object consists of String(Director) as Key and
	 * Movie as an Object.
	 * 
	 * @param movieList
	 * @return Map<String,Movie>
	 */
	public Map<String, Movie> preparemovieResultsByDiector(List<Movie> movieList) {
		Map<String, Movie> mp = new HashMap<String, Movie>();
		for (Movie m : movieList) {
			mp.put(m.getDirectors(), m);
		}
		return mp;
	}

	/**
	 * This method prepares a Map object consists of String(Geners) as Key and
	 * Movie as an Object.
	 * 
	 * @param movieList
	 * @return Map<String,Movie>
	 */
	public Map<String, Movie> preparemovieResultsByGeners(List<Movie> movieList) {
		Map<String, Movie> mp = new HashMap<String, Movie>();
		for (Movie m : movieList) {
			mp.put(m.getGenrs(), m);
		}
		return mp;
	}

	/**
	 * This method prepares a Map object consists of No of vote as Key and Movie
	 * as an Object.
	 * 
	 * @param movieList
	 * @return Map<String,Movie>
	 */
	public Map<Long, Movie> preparemovieResultsByNoOfVote(List<Movie> movieList) {
		Map<Long, Movie> mp = new HashMap<Long, Movie>();
		for (Movie m : movieList) {
			mp.put(m.getNo_of_votes(), m);
		}
		return mp;
	}

	/**
	 * This method prepares a Map object consists of Integer(run time) as Key
	 * and Movie as an Object.
	 * 
	 * @param movieList
	 * @return Map<Long,Movie>
	 */
	public Map<Integer, Movie> preparemovieResultsByRuntime(
			List<Movie> movieList) {
		Map<Integer, Movie> mp = new HashMap<Integer, Movie>();
		for (Movie m : movieList) {
			mp.put((int) m.getRuntime_duration(), m);
		}
		return mp;
	}

	/**
	 * This method prepares a Map object consists of Integer(release date) as
	 * Key and Movie as an Object.
	 * 
	 * @param movieList
	 * @return Map<Integer,Movie>
	 */
	public Map<String, Movie> preparemovieResultsByRelease(List<Movie> movieList) {
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		// Date date = Calendar.getInstance().getTime();
		Map<String, Movie> mp = new HashMap<String, Movie>();
		for (Movie m : movieList) {
			String date = df.format(m.getRelease_date());
			mp.put(date, m);
		}
		return mp;
	}

	/**
	 * This method prepares a Map object consists of String(IMDB rating) as Key
	 * and Movie as an Object.
	 * 
	 * @param movieList
	 * @return Map<String,Movie>
	 */
	public Map<Integer, Movie> preparemovieResultsByIMDBRating(
			List<Movie> movieList) {
		Map<Integer, Movie> mp = new HashMap<Integer, Movie>();
		for (Movie m : movieList) {
			mp.put(m.getImdb_rating(), m);
		}
		return mp;
	}

	/**
	 * This method prepares a Map object consists of String(Url) as Key and
	 * Movie as an Object.
	 * 
	 * @param movieList
	 * @return Map<String,Movie>
	 */
	public Map<String, Movie> preparemovieResultsByURL(List<Movie> movieList) {
		Map<String, Movie> mp = new HashMap<String, Movie>();
		for (Movie m : movieList) {
			mp.put(m.getUrl(), m);
		}
		return mp;
	}

	

}
