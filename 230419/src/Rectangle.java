import java.util.Scanner;
public class Rectangle {
	int width, height;
	
	public int getArea() {
		return width * height;
	}
	
	public Rectangle() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("사각형의 너비와 높이를 입력하세요. : ");
		
		r.width = scan.nextInt();
		r.height = scan.nextInt();
		
		System.out.println("사각형의 넓이는 " + r.getArea() + "입니다.");
		
		scan.close();
	}

}
