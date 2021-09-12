package object;

class Book {
	String title;
	String author;
	
	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return title +", "+ author;
	}
		
}

public class ToStringEx {

	public static void main(String[] args) {
		Book book = new Book("Do it Java", "박은종");
		System.out.println(book); 
		// object.Book@7de26db8 출력
		// Object 클래스의 경우 해당 클래스의 주소 출력
		// toString() 메소드를 위처럼 재정의하면 
		// Do it Java, 박은종 출력
		
		String str = new String("test");
		System.out.println(str); 
		// test 출력
		// String 클래스는 toString 메소드 재정의되어 문자열이 출력되는 것
		
	}

}
