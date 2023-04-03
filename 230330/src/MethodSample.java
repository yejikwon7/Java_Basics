
public class MethodSample {
	int x;
	int y;
	
	MethodSample() {
		this.x = 1;
		this.y = 2;
	}
	
	int getSum() {
		return this.x + this.y;
	}
	
	int getSum(int a) {
		return this.x + a;
	}
	
	int getSum(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodSample ms = new MethodSample();
		
		System.out.println("getSum() 호출");
		System.out.println(ms.getSum());
		
		System.out.println("getSum(int a) 호출");
		System.out.println(ms.getSum(10));
		
		System.out.println("getSum(int a, int b) 호출");
		System.out.println(ms.getSum(10, 7));
	}

}
