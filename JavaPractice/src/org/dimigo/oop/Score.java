package org.dimigo.oop;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner s 	= new Scanner(System.in);

		System.out.print("국어 점수 입력 >> ");
		int kor 	= s.nextInt();
		System.out.print("수학 점수 입력 >> ");
		int math 	= s.nextInt();
		System.out.print("영어 점수 입력 >> ");
		int eng 	= s.nextInt();
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("\n\n<< 점수 출력 >>\n")
					 .append("국어 점수 : ")
					 .append(kor)
					 .append(" 점\n")
					 .append("수학 점수 : ")
					 .append(math)
					 .append(" 점\n")
					 .append("영어 점수 : ")
					 .append(eng)
					 .append(" 점\n")
					 .append("총점 : ")
					 .append(kor + math + eng)
					 .append(" 점\n")
					 .append("평균 : ")
					 .append(String.format("%.1f", (kor + math + eng)/3.0))
					 .append(" 점");
		
		System.out.println(stringBuilder);
	}
}
