package org.dimigo.oop;

public class IdolGroup {
	public static void main(String[] args) {
		String[] idolGroup 	= {
				"빅뱅",
				"2NE1",
				"걸스데이"
		};
		
		String[][] members 	= {
				{"GD", "태양", "대성", "탑", "승리"},
				{"CL", "산다라박", "박봄", "민지"},
				{"유라", "혜리", "소진", "민아"}
		};
		
		int groupCount 	= 0;
		
		for(String group : idolGroup)
		{
			System.out.println("<< " + group + " 멤버 >>");
			for(String member : members[groupCount])
			{
				System.out.println(member);
			}
			groupCount 	++;
			System.out.println();
			System.out.println();
		}
	}
}
