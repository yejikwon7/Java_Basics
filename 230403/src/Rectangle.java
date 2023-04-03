import java.util.Scanner;
public class Rectangle {
	int width, height; // 필드, 멤버 변수 선언
	
	public Rectangle() { // 생성자 메소드 선언
		
	}
	
	public int getArea() {
		return width * height;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("사각형의 너비와 높이를 띄어쓰기 기준으로 입력해 주세요. : ");
		rect.width = scan.nextInt();
		rect.height = scan.nextInt();
		
		System.out.println("사각형의 넓이는 " + rect.getArea() + "입니다.");
		scan.close();
	}

}
