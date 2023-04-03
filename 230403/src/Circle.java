import java.util.Scanner;
public class Circle {
	int radius;
	String name; // 필드, 멤버 변수 선언
	
	public Circle() { // 생성자 메소드 선언
	}
	
	public double getArea() {
		return radius * radius * 3.14; // 넓이 구하기
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza = new Circle(); // 객체 생성
		Scanner scan = new Scanner(System.in);
		System.out.println("피자 반지름과 피자의 이름을 띄어쓰기를 기준으로 입력해 주세요.");
		
		pizza.radius = scan.nextInt(); // 스캐너로 입력받은 값 변수에 넣기
		pizza.name = scan.next();
		
		double area = pizza.getArea();
		System.out.println(pizza.name + " 피자의 면적은 " + area);
		
		scan.close(); // 스캐너 닫기
	}

}
