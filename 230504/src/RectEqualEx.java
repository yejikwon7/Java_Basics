class Rect {
	private int width, height;
	public Rect(int a, int b) {
		this.width = a; this.height = b;
	}
	
	public boolean equals(Object obj) {
		Rect r = (Rect)obj;
		if(width == r.width && height == r.height)
			return true;
		else
			return false;
	}
}

public class RectEqualEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect a = new Rect(2, 8);
		Rect b = new Rect(4, 4);
		Rect c = new Rect(2, 7);
		
		if(a == b)
			System.out.println("a == b");
		if(a.equals(b))
			System.out.println("a is equal to b");
		if(a.equals(c))
			System.out.println("a is equal to c");
	}
}
