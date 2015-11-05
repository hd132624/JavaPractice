package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 *  ㄴRace
 * </pre>
 * @author : 장태진
 * @version: 1.0
 */
public class Race {
	public static void main(String[] args) {
		System.out.println("Main Thread Start");
		Thread r1 = new Runner("못생긴 정성운");
		Thread r2 = new Runner("귀요미 장태진");
		r1.setPriority(Thread.MIN_PRIORITY);
		r2.setPriority(Thread.MAX_PRIORITY);
		r1.start();
		r2.start();
		System.out.println("Main Thread End");
	}
}
	