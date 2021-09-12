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
		Book book = new Book("Do it Java", "������");
		System.out.println(book); 
		// object.Book@7de26db8 ���
		// Object Ŭ������ ��� �ش� Ŭ������ �ּ� ���
		// toString() �޼ҵ带 ��ó�� �������ϸ� 
		// Do it Java, ������ ���
		
		String str = new String("test");
		System.out.println(str); 
		// test ���
		// String Ŭ������ toString �޼ҵ� �����ǵǾ� ���ڿ��� ��µǴ� ��
		
	}

}
