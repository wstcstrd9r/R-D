package test;

import java.util.HashSet;
import java.util.Set;

public class Name {
	private String first;
	private String last;
	
	public Name(String first, String last){
		this.first = first;
		this.last = last;
	}
	
	public boolean equals(Name n){
		return n.first.equals(first) && n.last.equals(last);
	}
	public boolean equals(Object o){
		return o instanceof Name && equals((Name) o);
	}
	public int hashCode(){
		return 31 * first.hashCode() + last.hashCode();
	}
	public static void main(String[] args){
		Set<Name> s = new HashSet<Name>();
		s.add(new Name("Donald", "Duck"));
		System.out.println(s.contains(new Name("Donald", "Duck")));
	
	}
}
