package org.dimigo.oop;

public class PiggyBankTest
{
	public static void main(String[] args)
	{
		FamilyMember[] family = {
			new FamilyMember("아빠"),
			new FamilyMember("엄마"),
			new FamilyMember("나"),
			new FamilyMember("남동생")
		};
		
		PiggyBank PBT = new PiggyBank();
		
		FamilyMember.printMemberCnt();
		PBT.putMoney(family[0], 10000);
		PBT.putMoney(family[1], 5000);
		PBT.putMoney(family[2], 2000);
		PBT.putMoney(family[3], 1000);
		PBT.printBalance();
		PBT.putMoney(family[2], 1000);
		PBT.printBalance();
	}
}
