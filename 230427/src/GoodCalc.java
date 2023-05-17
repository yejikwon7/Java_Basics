abstract class Calculator {
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
}

public class GoodCalc extends Calculator {
	@Override
	public int add(int a, int b) { // 추상 메소드 구현
		return a + b;
	} 
	
	@Override
	public int subtract(int a, int b) { // 추상 메소드 구현 
		int total = a - b;
		if (total < 0) {
			total = Math.abs(total);
		}
		return total;
	} 
	
	@Override
	public double average(int[] a) { // 추상 메소드 구현 
		double sum = 0;
		for (int i = 0; i <a.length; i++)
			sum += a[i];
		return sum / a.length;
	}
	
	public static void main(String [] args) {
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(152,386));
		System.out.println(c.subtract(152,386));
		System.out.println(c.average(new int [] {152,386,412 }));
	}

}
