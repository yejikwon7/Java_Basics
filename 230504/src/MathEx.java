public class MathEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.PI); // 원주율 상수 출력
		System.out.println(Math.ceil(2.34)); // ceil(올림)
		System.out.println(Math.floor(2.34)); // floor(내림)
		System.out.println(Math.sqrt(9)); // 제곱근, 루트
		System.out.println(Math.exp(2)); // e의 2승
		System.out.println(Math.round(3.14)); // 반올림
		
		// [1, 45] 사이의 정수형 난수 5개 발생
		System.out.print("이번주 행운의 번호는 ");
		for(int i = 0; i < 5; i++)
			System.out.print((int)(Math.random() * 45 + 1) + " ");
		// random은 원하는 범위의 축소와 늘리기가 용이함
	}

}
