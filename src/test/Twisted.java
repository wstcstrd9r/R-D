package test;

public class Twisted {
	private final String name;
	Twisted(String name){
		System.out.println("in const " + name);
		this.name = name;
	}
	private String name(){
		return name;
		
	}
	private void reproduce(){
		System.out.println("in rep b4 new Twis reproduce in main");
		new Twisted("reproduce"){
			void printName(){
				System.out.println(name());
			}
		
	}.printName();
	}

	public static void main(String[] args){
		System.out.println("before reproduce in main");
		new Twisted("main").reproduce();
		System.out.println("after reproduce in main");
	}
}
