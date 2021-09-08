package abstractex;

public class ComputerTest {

	public static void main(String[] args) {

		// computer가 추상클래스이기 때문에 아래처럼 인스턴스화 불가
//		Computer c1 = new Computer();		
		Computer c2 = new Desktop();
//		Computer c3 = new Notebook();
		
		Notebook c4 = new MyNotebook();
		
		c2.display();
		c4.display();
		
		
	} 
}
