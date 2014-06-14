/**
 * 
 */
package com.research.java.thread;

/**
 * @author kirandeep
 *
 */
public class PingPong extends Thread {
	
	private String word;
	private String name;
	private int delay;
	
	public PingPong( String wordToSay, String name, int delayTime){
		this.word = wordToSay;
		this.name = name;
		this.delay = delayTime;
	}
	
	public void run(){
		try{
			for(;;){
				System.out.print(word +  " in " + name + ": ");
				
				Thread.sleep(delay);
			}
		}catch(InterruptedException e){
			return;
		}
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable ping = new PingPong("ping", "thread 33", 33);
		Runnable pong = new PingPong("PONG", "thread 100", 100);
		
		new Thread(ping).start();
		new Thread(pong).start();
	}

}
