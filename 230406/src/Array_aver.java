import java.util.Scanner;

public class Array_aver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[] = new int[5];
		double sum = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print(intArray.length + "개의 정수를 띄어쓰기 기준으로 입력하세요 : ");
		
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = scan.nextInt();
		}
		
		for(int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}
		sum = (double)sum / intArray.length;
		
		System.out.println("입력하신 정수 " + intArray.length + "개의 평균은 " + sum + "입니다.");
		scan.close();
	}

}
