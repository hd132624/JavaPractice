package org.dimigo.oop;

import java.util.Scanner;

public class Question {
	public static void main(String[] args) {
		problem("가장 좋아하는 프로그래밍 언어는?", "php");
		problem("지금 먹고 싶은 음식은?", "치킨");
		problem("하고 싶은 것은?", "코딩");
	}
	
	public static void problem(String problem, String answer_){
		Scanner s 	= new Scanner(System.in);
		System.out.println(problem);
		String answer 	= s.nextLine();
		if(answer_.equalsIgnoreCase(answer))
		{
			System.out.println("정답입니다!! ^^");
		}
		else
		{
			System.out.println("틀렸습니다!! ㅠㅠ");
		}
	}
}
