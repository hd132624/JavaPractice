package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 *  ㄴRunner
 * </pre>
 * @author : 장태진
 * @version: 1.0
 */
public class Runner2 implements Runnable{
	private String name;
	public Runner2()	{}
	public Runner2(String name)	{
		this.name = name;
	}
	
	@Override
	public void run()	{
		int delta = 100;
		try {
			System.out.println(name + " 출발");
			while(delta > 0)	{
				Thread.sleep(1000);
				System.out.println(name + "선수 " + delta + "m 남음!");
				delta -= 10;
			}
			System.out.println(name + " 도착");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
