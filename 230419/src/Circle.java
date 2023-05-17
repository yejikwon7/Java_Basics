
public class Circle {
	int radius;
	String name;
	
	public double getArea() {
		return radius * radius * 3.14;
	}
	
	public Circle() {
		this.radius = 1;
		this.name = "이약";
	}
	
	public Circle(int radius, String name) {
		this.radius = radius;
		this.name = name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		Circle circle = new Circle(8, "자바피자");
		
		c.radius = 5;
		System.out.println(c.name + "의 넓이는 " + c.getArea() + "입니다.");
		System.out.println(circle.name + "의 넓이는 " + circle.getArea() + "입니다.");
	}

}
