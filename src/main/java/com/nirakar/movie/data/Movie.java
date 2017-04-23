package com.nirakar.movie.data;

import java.io.Serializable;
import java.util.Date;

/**
 * Movie Object with setter and getters
 * @author NIRAKAR
 * Jul 23, 2016
 */
public class Movie implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Variable used to hold rank.
	 */
	private int rank;
	/**
	 * Variable used to hold year.
	 */
	private int year;
	/**
	 * Variable used to hold title.
	 */
	private String title;
	/**
	 * Variable used to hold Directors.
	 */
	private String directors;
	/**
	 * Variable used to hold Genrs.
	 */
	private String genrs;
	/**
	 * Variable used to hold no of votes.
	 */
	private long no_of_votes;
	/**
	 * Variable used to hold duration of movie run time.
	 */
	private long runtime_duration;
	/**
	 * Variable used to hold release date of movie.
	 */
	private Date release_date;
	/**
	 * Variable used to hold tile of the movie.
	 */
	private String title_type;
	/**
	 *Variable used to hold IMDB rating of movie. 
	 */
	private int imdb_rating;
	/**
	 * Variable used to hold URL constant of movie.
	 */
	private String url_const;
	/**
	 * Variable used to hold duration IMDB URL of movie.
	 */
	private String url;

	/**
	 * get rank
	 * @return int
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * Setting Rank .
	 * @param rank
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}

	/**
	 * Getting year.
	 * @return Integer
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Setting Year.
	 * @param year
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * Getting title.
	 * @return String
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Setting title.
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Getting director.
	 * @return String.
	 */
	public String getDirectors() {
		return directors;
	}

	/**
	 * Setting director.
	 * @param directors
	 */
	public void setDirectors(String directors) {
		this.directors = directors;
	}

	/**
	 * Getting geners
	 * @return String
	 */
	public String getGenrs() {
		return genrs;
	}

	/**
	 * Setting geners.
	 * @param genrs
	 */
	public void setGenrs(String genrs) {
		this.genrs = genrs;
	}

	/**
	 * Getting no of votes.
	 * @return long
	 */
	public long getNo_of_votes() {
		return no_of_votes;
	}

	/**
	 * Setting no of votes.
	 * @param no_of_votes
	 */
	public void setNo_of_votes(long no_of_votes) {
		this.no_of_votes = no_of_votes;
	}

	/**
	 * Getting run time.
	 * @return long
	 */
	public long getRuntime_duration() {
		return runtime_duration;
	}

	/**
	 * Setting runtime duration.
	 * @param runtime_duration
	 */
	public void setRuntime_duration(long runtime_duration) {
		this.runtime_duration = runtime_duration;
	}

	/**
	 * Getting release date.
	 * @return Date.
	 */
	public Date getRelease_date() {
		return release_date;
	}

	/**
	 * Setting release date.
	 * @param release_date.
	 */
	@SuppressWarnings("javadoc")
	public void setRelease_date(Date release_date) {
		this.release_date = release_date;
	}

	/**
	 * Getting title.
	 * @return String
	 */
	public String getTitle_type() {
		return title_type;
	}

	/**
	 * Setting title type
	 * @param title_type
	 */
	public void setTitle_type(String title_type) {
		this.title_type = title_type;
	}

	/**
	 * Getting IMDB rating.
	 * @return Integer.
	 */
	public int getImdb_rating() {
		return imdb_rating;
	}

	/**
	 * Setting IMDB rating.
	 * @param imdb_rating
	 */
	public void setImdb_rating(int imdb_rating) {
		this.imdb_rating = imdb_rating;
	}

	/**
	 * Getting URL Constant.
	 * @return String
	 */
	public String getUrl_const() {
		return url_const;
	}

	/**
	 * Setting URL Constant.
	 * @param url_const
	 */
	public void setUrl_const(String url_const) {
		this.url_const = url_const;
	}

	/**
	 * Getting URL
	 * @return String.
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Setting URL.
	 * @param url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {

		 return "Movie [ "+"rank: " + rank + " | " + "year: " + year + " | "
				+ "title: " + title + " | " + "directors: "
				+ directors + " | " + "genrs: " + genrs +
				" | " + "no_of_votes: " + no_of_votes + 
				" | " + "runtime_duration: " + runtime_duration +
				" | " + "release_date: " + release_date +
				" | " + "title_type: " + title_type +
				" | " + "imdb_rating: " + imdb_rating 
				+ "]";

	}
}
