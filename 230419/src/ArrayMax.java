import java.util.Scanner;

public class ArrayMax {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int [] intArray = new int[5];
		int max = 0;
		
		System.out.print("양수 5개를 입력하세요 : ");
		
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = scan.nextInt();
			if(intArray[i] > max)
				max = intArray[i];
		}
		
		System.out.println("가장 큰 수는 " + max + "입니다.");
		
		scan.close();
	}

}
