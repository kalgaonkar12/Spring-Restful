package com.nirakar.movie.exception;

/**
 * This class is an user defined exception which extends Exception.
 * @author NIRAKAR
 * Jul 23, 2016
 */
public class MovieSearchException extends Exception {

	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Overloaded constructor used for Exception handling.
	 */
	public MovieSearchException(){
		super();
	}
	/**
	 * Overloaded constructor used for Exception handling.
	 * @param message
	 */
	public  MovieSearchException(String message) {
		super(message);
	}
	/**
	 * Overloaded constructor used for Exception handling.
	 * @param message
	 * @param throwableMeaasge
	 */
	public MovieSearchException(String message,Throwable throwableMeaasge){
		super(message,throwableMeaasge);
	}
}
