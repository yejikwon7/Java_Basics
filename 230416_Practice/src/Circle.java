class ExCircle {
	int radius;
	String name;
	
	public ExCircle() {
		
	}
	
	public double getArea(int radius) {
		this.radius = radius;
		return 3.14 * radius * radius;
	}
}

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExCircle c = new ExCircle();
		c.name = "pizza";
		System.out.println(c.name + "의 넓이는 " + c.getArea(5) + "입니다.");
	}

}
