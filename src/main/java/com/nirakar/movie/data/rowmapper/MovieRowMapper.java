package com.nirakar.movie.data.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import com.nirakar.movie.data.Movie;

public class MovieRowMapper implements RowMapper<Movie> {

	@Override
	public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
		Movie movieObject  = new Movie();
		movieObject.setRank(rs.getInt("ID"));
		movieObject.setYear(rs.getInt("YEAR"));
		movieObject.setTitle(rs.getString("TITLE"));
		movieObject.setDirectors(rs.getString("DIRECTORS"));
		movieObject.setGenrs(rs.getString("GENRES"));
		movieObject.setNo_of_votes(rs.getInt("NUM_VOTES"));
		movieObject.setRuntime_duration(rs.getInt("RUNTIME_MINS"));
		movieObject.setRelease_date(new Date(rs.getString("RELEASE_DATE_MONTHDAYYEAR")));
		movieObject.setTitle_type(rs.getString("TITLE_TYPE"));
		movieObject.setImdb_rating(rs.getInt("IMDB_RATING"));
		movieObject.setUrl(rs.getString("URL"));
		movieObject.setUrl_const(rs.getString("CONST"));
		return movieObject;
	}

}
