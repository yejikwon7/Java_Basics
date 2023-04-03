import java.util.Scanner;
public class Book {
	String title, author; // 필드, 멤버 변수 선언
	
	public Book() { // 매개변수 없는 생성자
		title = "제목 없음";
		author = "작자 미상";
	}
	
	public Book(String t) { // 제목 매개변수만 있는 생성자
		this.title = t;
		author = "작자 미상";
	}
	
	public Book(String t, String a) { // 매개변수 2개 있는 생성자
		this.title = t;
		this.author = a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book(); // 매개변수 없는 객체 생성
		System.out.println("책 제목은 " + b1.title + ", 작가는 " + b1.author);
		
		Scanner scan = new Scanner(System.in); // 스캐너 생성
		System.out.print("책 제목을 입력하세요. : ");
		String s = scan.next();
		Book b2 = new Book(s); // 매개변수 하나인 객체 생성
		System.out.println("책 제목은 " + b2.title + ", 작가는 " + b2.author);
		
		System.out.print("책 제목과 작가를 입력하세요. : ");
		s = scan.next();
		String n = scan.next();
		Book b3 = new Book(s, n); // 매개변수 두 개인 객체 생성
		System.out.println("책 제목은 " + b3.title + ", 작가는 " + b3.author);
		
		scan.close();
	}

}
