package com.research.java.threads;

public class PingPong extends Thread {
	
	private String word; //what word to print
	private int delay;   //how long to pause

	public PingPong( String whatToSay, int timeDelay){
		this.word = whatToSay;
		this.delay = timeDelay;
	}
	
	public void run(){
		try{
			for(;;){
				System.out.print( word + " ");
				Thread.sleep(delay);
			}
		}catch( InterruptedException e){
			return;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new PingPong("ping", 33).start();
		new PingPong("ping", 100).start();

	}

}
