package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		int km 	= 13; // how many run?
		int car = 0; // 0 = bus, 1 = SmallCar, car >= 2 ETC
		int val = 0; // charge		
		int i = 0; // for FOR
		int a = 0; // for BASE VALUE
		int b = 0; // for ADD VALUE
		
		String carString = ""; // kind of car
		
		switch(car)
		{
		case 0:
			carString = "버스";
			a = 850;
			b = 300;
			break;
		case 1:
			carString = "경차";
			a = 300;
			b = 200;
			break;
		default:
			carString = "그 외";
			a = 600;
			b = 200;
			break;
		}
		
		val = a;
		for(i=0;i<(int)(km%10);i++)
		{
			val += b;
		}
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + km + "km");
		System.out.println("차종 : " + carString);
		System.out.println("통행료 : " + val + "원");
	}

}
