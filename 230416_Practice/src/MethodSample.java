
public class MethodSample {
	int x, y;
	
	MethodSample() {
		this.x = 1;
		this.y = 2;
	}
	
	int getSum() {
		return this.x + this.y;
	}
	
	int getSum(int a) {
		return a + this.y;
	}
	
	int getSum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodSample ms = new MethodSample();
		
		System.out.println(ms.getSum());
		System.out.println(ms.getSum(5));
		System.out.println(ms.getSum(5, 8));
	}

}
