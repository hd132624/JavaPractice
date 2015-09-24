package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *  ㄴMovieTest
 * </pre>
 * @author : 장태진
 * @version: 1.0
 */
public class MovieTest {
	public static void main(String[] args) {
			Movie[] movies = {
					new Movie("엔트맨", 12),
					new Movie("사도", 19),
					new Movie("베테랑", 15)
			};
			
			int age = 13;
			for(Movie movie : movies)	{
				try{
					buyTicket(movie, age); // 여기서 예외 던짐
				} catch(Exception e)	{
					System.out.println(e.getMessage());
				}
			}
	}
	
	private static void buyTicket(Movie movie, int age)	throws Exception{
		if(age < movie.getLimitAge())	{
			throw new AgeCheckException();
		}
		System.out.println(movie.getTitle() + "은/는 볼 수 있습니다.");
	}
}
