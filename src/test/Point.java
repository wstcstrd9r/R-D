package test;

class Point {
	protected final int x;
	protected  final int y;
	private final String name;
	Point(int x, int y){
		this.x = x;
		this.y = y;
		name = makeName();
	}

	protected String makeName(){
		return "[" + x + ", " + y + "]";
	}
	public final String toString(){
		return name;
	}

}
