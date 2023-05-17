
public class Book {
	String title, author;
	
	public Book() {
		this.title = "제목없음";
		this.author = "작자미상";
	}
	
	public Book(String t) {
		this.title = t;
		this.author = "작자미상";
	}
	
	public Book(String t, String a) {
		this.title = t;
		this.author = a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book();
		Book b2 = new Book("천 개의 파랑");
		Book b3 = new Book("아가미", "구병모");
		
		System.out.println(b1.title + " " + b1.author);
		System.out.println(b2.title + " " + b2.author);
		System.out.println(b3.title + " " + b3.author);
	}

}
