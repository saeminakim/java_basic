package thisExample;

class Person {
	
	String name;
	int age;
	
	public Person() {
		this("이름없음", 1);
		// 데이터 타입이 맞으면 그에 맞는 생성자가 호출됨
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person returnSelf() {
		return this;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {

		Person p1 = new Person();
		System.out.println(p1.name);
		
		System.out.println(p1.returnSelf());
	}

}
