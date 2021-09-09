package template;

public abstract class Car {
	
	public abstract void drive(); //������ ���� �޸��� ����� �ٸ� �� ������ ���⼭ ���� x
	public abstract void stop();
	
	public abstract void wiper();
	public void washCar() {} // �����ڵ� ���� �����س��� ���� Ŭ�������� �ʿ信 ���� �������ؼ� ����� �� ���� hook method

	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	// template method  
	public final void run() { 
		// �Ϸ��� �ó������� �����ǵǸ� �ȵǱ� ������ final�� ����
		// ���� Ŭ�������� ������ �Ұ�
		startCar();
		drive();
		wiper();
		stop();
		washCar();
		turnOff();
	}
}
