package org.dimigo.ingeritance;

/**
 * <pre>
 * org.dimigo.ingeritance
 *  ㄴTriangle
 * </pre>
 * @author : 장태진
 * @version: 1.0
 */
public class Triangle extends Figure{
	private int width = 0;
	private int height = 0;
	
	public Triangle(int width, int height)
	{
		super(0, 0);
		
	}
	
	public Triangle(int centerX, int centerY, int width, int height)
	{
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void printCenter()
	{
		System.out.print("삼각형의 ");
		super.printCenter();
	}

	@Override
	public double calcArea()
	{
		double result = width * height / 2;
		return result;
	}
}
