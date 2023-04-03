import java.util.Scanner;
public class Circles {
	int radius;
	String name;
	
	public Circles () { // 매개변수가 없는 생성자
		radius = 1;
		name = "";
	}
	
	public Circles(int radius, String name) { // 매개 변수 있는 생성자
		this.radius = radius;
		this.name = name;
	}
	
	public double getArea() {
		return radius * radius * 3.14;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circles pizza = new Circles(); // 매개 변수 없는 객체 생성
		pizza.name = "자바 피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area + "입니다.");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("도넛의 반지름과 이름을 입력해 주세요.");
		int r = scan.nextInt();
		String n = scan.next();
		Circles donut = new Circles(r, n); // 매개 변수 있는 객체 생성
		area = donut.getArea();
		System.out.println(donut.name + " 도넛의 면적은 " + area + "입니다.");
		
		scan.close();
		
	}

}
