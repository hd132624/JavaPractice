package org.dimigo.basic;

public class PrimitiveDataType {
	public static void main(String argc[])
	{
		String name = "아이유";
		boolean sex	= false;
		int 	age = 23;
		double 	height	= 161.8;
		float 	weight 	= (float)44.3;
		char 	bloodType 	= 'A';
		
		printf("<< 아이유 프로필 >>");
		printf("이름 : " + name);
		printf("성별 : " + ((sex == true)? "남자" : "여자"));
		printf("나이 : " + age + " 세");
		printf("키   : " + height + " cm");
		printf("몸무게 : " + weight + " kg");
		printf("혈액형 : " + bloodType + " 형");
	}
	public static void printf(String string)
	{
		System.out.println(string);
	}
}
