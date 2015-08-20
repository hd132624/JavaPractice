package org.dimigo.ingeritance;

/**
 * <pre>
 * org.dimigo.ingeritance
 *  ㄴCircle
 * </pre>
 * @author : 장태진
 * @version: 1.0
 */
public class Circle extends Figure {
	private int radius = 0;
	
	public Circle(int radius)
	{
		super(0, 0);
		this.radius = radius;
	}
	
	public Circle(int centerX, int centerY, int radius)
	{
		super(centerX, centerY);
		this.radius = radius;
	}
	
	@Override
	public double calcArea()
	{
		double result = radius * radius * Math.PI;
		return result;
	}
}
