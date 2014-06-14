package test;

public class Null {
	public static void greet(){
		System.out.println("Hello World!");
	}
	public static void main(String[] args){
		((Null) null).greet();
		Null.greet();
	}

}
