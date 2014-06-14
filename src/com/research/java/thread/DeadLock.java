package com.research.java.thread;

public class DeadLock {
	
	private DeadLock partner;
	private String name;
	
	public DeadLock(String name){
		this.name = name;
	}
	
	public synchronized void hug(){
		System.out.println(Thread.currentThread().getName() + " in " + name +
					".hugBack()");
		partner.hugBack();
	}
	
	private synchronized void hugBack(){
		System.out.println(Thread.currentThread().getName() + " in " + name +
		".hugBack()");
		this.hugBack();
	}

	public void becomeFriend(DeadLock partner){
		this.partner = partner;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final DeadLock jareth = new DeadLock("jareth");
		final DeadLock cory = new DeadLock("cory");
		
		jareth.becomeFriend(cory);
		cory.becomeFriend(jareth);
		
		new Thread( new Runnable(){
			public void run(){jareth.hug();}}, "Thread1").start();
		
		new Thread( new Runnable(){
			public void run(){cory.hug();}}, "Thread2").start();
	
	}

	


				

}
