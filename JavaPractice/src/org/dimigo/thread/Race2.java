package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 *  ㄴRace
 * </pre>
 * @author : 장태진
 * @version: 1.0
 */
public class Race2 {
	public static void main(String[] args) {
		System.out.println("Main Thread Start");
		Thread r1 = new Thread(new Runner2("정성운"));
		Thread r2 = new Thread(new Runner2("장태진"));
		r1.setPriority(Thread.MIN_PRIORITY);
		r2.setPriority(Thread.MAX_PRIORITY);
		r1.start();
		r2.start();
		System.out.println("Main Thread End");
	}
}
	