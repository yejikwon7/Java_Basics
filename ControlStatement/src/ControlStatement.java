import java.util.Scanner;
import java.util.Random;

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
		int gugudan = testScanner.nextInt(); //단 입력 받기
		
		int num = 0;
		while(num++ < 9) 
		{
			System.out.println(gugudan + " * " + num + " = " + (gugudan * num));
		}
		
		
		//예제6
		System.out.println("\n예제 6");
		
		System.out.print("구구단을 출력하시겠습니까? ");
		String gugudan1 = testScanner.next();
		
		for(int i = 2; i <= 9; i++)
		{
			for(int j = 1; j <= 9; j++)
			{
				System.out.print(i + " * " + j + " = " + (i * j) + "\t"); //구구단 하나의 단 출력
			}
			System.out.print("\n"); //하나의 단 끝나면 줄바꿈
		}
		
		
		//예제7
		System.out.println("\n예제 7");
		
		System.out.print("사각형을 출력하시겠습니까? ");
		String star = testScanner.next();
		
		for(int star1 = 0; star1 < 5; star1++)
		{
			for(int star2 = 0; star2 < 20; star2++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//예제8
		System.out.println("\n예제 8");
		
		Random random = new Random();
		int answer = random.nextInt(100); //100이내의 정수에서 랜덤한 수 고르기
		System.out.println("정답 미리보기 : " + answer);
		
		int repeat_count = 0;
		int input_number; //입력받는 변수 선언
		System.out.println("1부터 100까지의 숫자 중 하나를 골라 정답을 맞혀보세요.");
		
		do {
			System.out.print("정답 : ");
			input_number = testScanner.nextInt(); //입력받은 변수 출력
			repeat_count++; //반복 횟수 증가
			if (input_number < answer)
			{
				System.out.println("입력한 수가 작습니다.");
			}
			if (input_number > answer)
			{
				System.out.println("입력한 수가 큽니다.");
			}
		}while (answer != input_number);
		System.out.println("정답입니다! 반복한 횟수는 " + repeat_count + "번 입니다."); //몇 번 반복했는지 출력
		
		
		//예제9
		System.out.println("\n예제 9");
		
		int student = 0;
		int student_grade; //학생들의 점수 입력 받을 변수 선언
		int total_grade = 0; //총점 변수 선언
		System.out.println("학생들의 점수를 입력해주세요.");
		
		do{
			System.out.print("점수 : ");
			student_grade = testScanner.nextInt(); //학생 점수 입력 받기
			
			if (student_grade >= 0) //입력받은 값이 양수일 때만 실행
			{
				student++;
				total_grade += student_grade; //총점에 더하기
			}
		}while(student_grade >= 0);
		System.out.println("학생들의 평균은 " + (total_grade / student) + "점 입니다."); //입력값 음수일 경우 평균값 출력하기
		
		
		//예제10
		System.out.println("\n예제 10");
		
		int sum_number = 0; //총합 변수
		
		for(int i = 1; i <= 100; i++)
		{
			if (i % 2 != 0) continue; // 나머지가 0이 아닐 경우 건너뛰기
			sum_number += i;
		}
		System.out.println("1부터 100까지 짝수의 합은 " + sum_number + "입니다.");
	}
}
