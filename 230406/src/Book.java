import java.util.Scanner;

class BookArray {
	String title, author;
	
	public BookArray(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

public class Book {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookArray [] book = new BookArray[2];
		
		System.out.println("책 제목과 저자를 입력하세요");
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < book.length; i++) {
			System.out.print("제목 : ");
			String title = scan.nextLine();
			System.out.print("저자 : ");
			String author = scan.nextLine();
			book[i] = new BookArray(title, author);
		}
		
		for(int i = 0; i < book.length; i++) {
			System.out.print("(" + book[i].title + ", " + book[i].author + ") \n");
		}
		scan.close();
	}

}
