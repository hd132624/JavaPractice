package org.dimigo.ingeritance;

/**
 * <pre>
 * org.dimigo.ingeritance
 *  ㄴRectangle
 * </pre>
 * @author : 장태진
 * @version: 1.0
 */
public class Rectangle extends Figure{
	private int width = 0;
	private int height = 0;
	
	public Rectangle(int width, int height)
	{
		super(0, 0);
		
	}
	
	public Rectangle(int centerX, int centerY, int width, int height)
	{
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
	
	public double calcArea()
	{
		double result = width * height;
		return result;
	}
}
