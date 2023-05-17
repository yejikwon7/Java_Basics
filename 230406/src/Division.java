import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("나눠질 수를 입력하세요 : ");
			int a = scan.nextInt();
			System.out.print("나누는 수를 입력하세요 : ");
			int b = scan.nextInt();
			
			try {
				System.out.println(a + "를 " + b + "로 나누면 몫은 " + a / b + "입니다.");
				break;
			}
			
			catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다!");
			}
		}
		scan.close();
	}

}
