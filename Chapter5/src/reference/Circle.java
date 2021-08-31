package reference;

public class Circle {

	Point point;
	int radius;
	
	public Circle() {
		point = new Point();
		// 클래스 안에서 다른 클래스의 참조 변수형을 가져다 쓰기 위해서
		// 생성자에서 인스턴스화 시켜줌
	}
}
