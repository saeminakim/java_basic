package abstractex;

public abstract class Computer {

	// �� �޼ҵ���� ��� �����Ǿ�� ���� Ȯ������ ���� �� �߻�޼ҵ� ���
	// �޼ҵ��� ������ ����Ŭ������ ���ӽ�Ŵ
	public abstract void display();
	public abstract void typing();
	
	
	// �޼ҵ��� ���� ���� � ������ �ϴ� �޼ҵ����� ������ �� ����
	// �׷��� ��Ӱ� �Բ� ���
	// public abstract int add(int x, int y);

	
	// �߻� Ŭ������ �Ϲ� �޼ҵ� ���� �� ����
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
