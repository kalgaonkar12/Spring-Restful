package com.nirakar.movie.constants;

public class MovieDBConstants {
	
	public static final String SQL_SELECT = "select * from MOVIE_DIECTORY";
	
	public static final String MOVIE_BETWEEN_TWO_YEAR =
			//"SELECT * FROM MOVIE_DIECTORY WHERE YEAR=?";
			"SELECT * FROM MOVIE_DIECTORY WHERE YEAR BETWEEN ? AND ?";

}
