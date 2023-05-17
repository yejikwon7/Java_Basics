class Point {
	private int x, y;
	public void set(int x, int y) {
		this.x = x; this.y = y;
	}
	
	public void showPoint() {
		System.out.println(", " + x + ", " + y);
	}
	
	public Point() {
		this.x = this.y = 0;
	}
	
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	
}


class ColorPoint extends Point {
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
}
public class SuperEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint cp = new ColorPoint(5, 8, "blue");
		cp.showColorPoint();
	}

}
