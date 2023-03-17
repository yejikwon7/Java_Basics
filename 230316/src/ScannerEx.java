import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		//EX01
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름, 도시, 나이, 체중을 스페이스바로 분리하여 입력하세요");
		
		String name = scanner.next(); //문자열 읽기
		System.out.print("이름은 " + name + ", ");
		
		String city = scanner.next(); //문자열 읽기
		System.out.print("도시는 " + city + ", ");
		
		int age = scanner.nextInt(); //정수 읽기
		System.out.print("나이는 " + age + "살, ");
		
		double weight = scanner.nextDouble(); //실수 읽기
		System.out.println("체중은 " + weight + "kg, ");
		
		
		//EX02
		System.out.print("typing anything: ");
		 
		while(scanner.hasNext()) //무한반복을 종료하기 위해서 ctrl-z 입력, false
		{
			String tokenT = scanner.next();//스페이스바 기준으로 다 따로 떨어져서 출력됨
			System.out.println(tokenT);
		}
		System.out.println("입력을 종료합니다.");
		scanner.close(); //scanner 닫기
	} //main
}
