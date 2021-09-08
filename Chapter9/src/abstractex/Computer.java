package abstractex;

public abstract class Computer {

	// 이 메소드들이 어떻게 구현되어야 할지 확실하지 않을 때 추상메소드 사용
	// 메소드의 구현을 하위클래스에 위임시킴
	public abstract void display();
	public abstract void typing();
	
	
	// 메소드의 선언만 봐도 어떤 역할을 하는 메소드인지 짐작할 수 있음
	// 그래서 상속과 함께 사용
	// public abstract int add(int x, int y);

	
	// 추상 클래스도 일반 메소드 가질 수 있음
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
