package classEx;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person person = new Person();
		
		// 1,2번의 경우 이미 컴파일이 된 상태에서만 사용 가능
		// 3번은 메소드가 실행되는 순간 그 이름의 클래스를 메모리에 올림 => 동적 로딩
		
		
		// 1. 이미 생성된 인스턴스에서 getClass() 메소드 사용 (Object에서 제공하는 메소드)
		Class pClass1 = person.getClass();
		
		System.out.println(pClass1.getName()); // classEx.Person
		
		// 2. 클래스에서 직접 가져오는 방법
		Class pClass2 = Person.class;
		
		System.out.println(pClass2.getName()); // classEx.Person
		
		// 3. forName() 메소드 사용
		Class pClass3 = Class.forName("classEx.Person");
		System.out.println(pClass3.getName()); // classEx.Person
		
		System.out.println("========================");
		
		Person p = new Person();
		
		Class pClass = Class.forName("classEx.Person");
		
		Person p2 = (Person) pClass.newInstance(); // 해당 클래스의 default constructor가 호출됨
		System.out.println(p);
		System.out.println(p2);
	}	
}
