import java.util.Scanner;

public class ControlStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//예제1
		System.out.println("예제 1");
		final int PAY_PER_HOUR = 10000; //시급 변수 선언
		
		Scanner testScanner = new Scanner(System.in); //근무시간 입력 받기
		System.out.print("근무시간을 입력하세요. ");
		
		int businessHours = testScanner.nextInt(); //근무시간 읽기
		double wage; //임금 변수 선언
		
		//임금 계산
		if (businessHours > 8)
		{
			wage = businessHours * PAY_PER_HOUR * 1.5;
		}
		else
		{
			wage = businessHours * PAY_PER_HOUR; //8시간 이하일 때
		}
		
		System.out.println("시급은 " + wage + "원 입니다.");
		
		
		//예제2
		System.out.println("\n예제 2");
		double incomeTax = 0; //소득세 변수 선언
		
		System.out.print("과세 금액을 입력하세요. ");
		int taxation = testScanner.nextInt(); //과세 금액 입력 받기
		
		//소득세 계산
		if(taxation <= 10000000)
		{
			incomeTax = taxation * 0.09;
		}
		
		else if(taxation <= 40000000)
		{
			incomeTax = taxation * 0.18;
		}
		
		else if(taxation <= 80000000)
		{
			incomeTax = taxation * 0.27;
		}
		
		else if(taxation > 80000000)
		{
			incomeTax = taxation * 0.36;
		}
		
		System.out.println("소득세는 " + incomeTax + "원 입니다.");
		
		
		//예제3
		System.out.println("\n예제 3");
		String grade = null; //학점 변수 선언
		
		System.out.print("점수를 입력하세요. ");
		int score = testScanner.nextInt(); //점수 입력 받기
		
		//학점 계산
		if(score >= 95)
		{
			grade = "A+";
		}
		
		else if(score >= 90)
		{
			grade = "A";
		}
		
		else if(score >= 85) 
		{
			grade = "B+";
		}
		
		else if(score >= 80) 
		{
			grade = "B";
		}
		
		else if(score >= 75) 
		{
			grade = "C+";
		}
		
		else if(score >= 70) 
		{
			grade = "C";
		}
		
		else if(score < 70) 
		{
			grade = "D or F";
		}
		System.out.println("학점은 " + grade + "입니다.");
		
		
		//예제4
		System.out.println("\n예제 4");
		int sum = 0; //합계 변수 선언
		int number = 0;
		
		System.out.print("숫자를 입력하세요. ");
		int inputN = testScanner.nextInt(); //정수 입력 받기
		
		do
		{
			number++; //1부터 시작
			sum += number;
		}while(number < inputN); //입력받은 수까지 더하기
		System.out.println("1부터 입력하신 수 " + inputN + "까지의 합은 " + sum + "입니다."); //결과값 출력
		
		
		//예제5
		System.out.println("\n예제 5");		
		
		System.out.print("구구단을 출력하는 계산기입니다. 원하는 단을 입력하세요. ");
		int num = testScanner.nextInt(); //단 입력 받기
		
		int i = 0;
		while(i++ < 9) 
		{
			System.out.println(num + " * " + i + " = " + (num *i));
		}
	}
}
