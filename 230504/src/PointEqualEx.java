class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		if(x == p.x && y == p.y)
			return true;
		else
			return false;
	}
}

public class PointEqualEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point a = new Point(2, 3);
		Point b = new Point(2, 3); // 메소드 값은 같으나 저장 위치 다름
		Point c = new Point(3, 4);
		
		if(a == b) // objects의 equal
			System.out.println("a == b");
		if(a.equals(b)) // 내용을 봄
			System.out.println("a is equal to b");
		if(a.equals(c))
			System.out.println("a is equal to c");
	}
}

