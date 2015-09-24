package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *  ㄴAgeCheckException
 * </pre>
 * @author : 장태진
 * @version: 1.0
 */
public class AgeCheckException extends Exception{
	public AgeCheckException() {
		super("볼 수 없는 영화입니다.");
	}
	
	public AgeCheckException(Movie movie) {
		super(movie.getTitle() + "은/는 " + movie.getLimitAge() + "부터 볼 수 있습니다.");
	}
}
