package abstractex;

public class ComputerTest {

	public static void main(String[] args) {

		// computer�� �߻�Ŭ�����̱� ������ �Ʒ�ó�� �ν��Ͻ�ȭ �Ұ�
//		Computer c1 = new Computer();		
		Computer c2 = new Desktop();
//		Computer c3 = new Notebook();
		
		Notebook c4 = new MyNotebook();
		
		c2.display();
		c4.display();
		
		
	} 
}
