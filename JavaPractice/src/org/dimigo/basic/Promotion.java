package org.dimigo.basic;

public class Promotion {
	public static void main(String argc[])
	{
		int monMoney	= 1700000;
		byte people		= 3;
		int store 		= 1500;
		long total	= (long)monMoney * (long)people * (long)store * (long)12;
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", monMoney) + "원");
		System.out.println("점포 내 직원 수 : " + people + "명");
		System.out.println("점포 수 : " + String.format("%,d", store) + "개");
		System.out.println("\n\n연간 인건비 : " + String.format("%,d", total) + "원");
	}
}
