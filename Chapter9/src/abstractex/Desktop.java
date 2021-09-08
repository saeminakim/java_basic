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
	
	// 상위 클래스의 메소드를 오버라이딩 할 수도 있음
//		public void turnOff() {
//			System.out.println("전원을 끕니다");
//		}

}
