
public class MethodSample {
	int x = 5, y = 8;
	
	int getSum() {
		return x + y;
	}
	
	int getSum(int a) {
		return a + y;
	}
	
	int getSum(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodSample ms = new MethodSample();
		
		System.out.println(ms.getSum());
		System.out.println(ms.getSum(8));
		System.out.println(ms.getSum(58, 17));
	}

}
