package template;

public abstract class Car {
	
	public abstract void drive(); //차종에 따라 달리는 방법이 다를 수 있으니 여기서 구현 x
	public abstract void stop();
	
	public abstract void wiper();
	public void washCar() {} // 구현코드 없이 선언해놓고 하위 클래스에서 필요에 따라 재정의해서 사용할 수 있음 hook method

	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	// template method  
	public final void run() { 
		// 일련의 시나리오는 재정의되면 안되기 때문에 final로 선언
		// 하위 클래스에서 재정의 불가
		startCar();
		drive();
		wiper();
		stop();
		washCar();
		turnOff();
	}
}
