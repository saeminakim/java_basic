package interfaceex;

public class MyClass implements MyInterface {

	@Override
	public void x() {
		System.out.println("x()");
	}

	@Override
	public void y() {
		System.out.println("y()");
	}

	@Override
	public void myMethod() {
		System.out.println("myMethod()");
	}
	
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		
		// myClass 타입으로 생성되었더라도 xClass에 대입되어 xClass 타입 메소드만 사용 가능
		X xClass = myClass;
		xClass.x();
	}

}
