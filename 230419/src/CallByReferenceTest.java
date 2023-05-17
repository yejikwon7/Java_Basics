
public class CallByReferenceTest {
	int x, y;
	
	CallByReferenceTest(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	void swap(CallByReferenceTest test) {
		int tmp = 0;
		tmp = test.x;
		test.x = test.y;
		test.y = tmp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByReferenceTest cbrt = new CallByReferenceTest(3, 5);
		
		System.out.println("in main : " + cbrt.x + ", " + cbrt.y);
		cbrt.swap(cbrt);
		System.out.println("after : " + cbrt.x + ", " + cbrt.y);
	}

}
