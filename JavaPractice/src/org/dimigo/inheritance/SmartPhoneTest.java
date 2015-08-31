/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *  ㄴSmartPhoneTest
 * </pre>
 * @author : 장태진
 * @version: 1.0
 */
public class SmartPhoneTest {
	public static void main(String[] args) {
		SmartPhone array[] = {
				new IPhone("iPhone 6", "애플", 700000),
				new Galaxy("갤럭시 S6", "삼성", 650000)
		};
		
		for(SmartPhone phone : array)	{
			System.out.println(phone);
			phone.turnOn();
			phone.pay();
			phone.useSpecialFunction();
			phone.turnOff();
			System.out.println("\n\n");
		}
	}
}
