package abstractex;

public class Desktop extends Computer {

	@Override
	public void display() {
		System.out.println("Desktop display()");
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing()");
	}
	
	// ���� Ŭ������ �޼ҵ带 �������̵� �� ���� ����
//		public void turnOff() {
//			System.out.println("������ ���ϴ�");
//		}

}
