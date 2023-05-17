import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[] = new int[5];
		int number = 0;
		
		System.out.println("정수 5개를 띄어쓰기 기준으로 입력하세요. : ");
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = scan.nextInt();
			if(intArray[i] > number) {
				number = intArray[i];
			}
		}
		
		System.out.println("입력한 수 중 가장 큰 수는 " + number + "입니다.");
		scan.close();
	}

}
