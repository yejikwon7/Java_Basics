
public class CallByValueTest {
	void swap(int a, int b) {
		int tmp = 0;
		tmp = a;
		a = b;
		b = tmp;
		System.out.println("in swap()");
		System.out.println("a = " + a + ", b = " + b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3, y = 5;
		CallByValueTest cbvt = new CallByValueTest();
		
		System.out.println("in main() : before swap");
		System.out.println("x = " + x + ", y = " + y);
		cbvt.swap(x, y); // swap 호출
		System.out.println("in main() : after swap");
		System.out.println("x = " + x + ", y = " + y);
	}

}
