package org.dimigo.basic;

public class Operator {
	public static void main(String args[])
	{
		int a = 9;
		int b = 10;
		float h = 5.8f;
		
		int a_ = 9;
		float h_ = 5.4f;
		
		float aa = ((a + b) * h / 2);
		float bb = (a_ * h_);
		float cc = (aa > bb) ? aa - bb : bb - aa;
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + String.format("%.1f", aa));
		System.out.println("평행사변형 넓이 : " + String.format("%.1f", bb));
		System.out.println("\n\n");
		System.out.println("사다리꼴이 평행사변형 보다 " + ( cc ) + " 더 큽니다.");
	}
}
