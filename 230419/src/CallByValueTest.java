
public class CallByValueTest {
	void swap(int a, int b) {
		int tmp = 0;
		tmp = a;
		a = b;
		b = tmp;
		
		System.out.println("in swap : " + a + ", " + b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByValueTest cbvt = new CallByValueTest();
		
		int x = 3, y = 5;
		System.out.println("in main :" + x + ", " + y);
		cbvt.swap(x, y);
		System.out.println("after swap : " + x + ", " + y);
	}

}
