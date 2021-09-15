package classEx;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person person = new Person();
		
		// 1,2���� ��� �̹� �������� �� ���¿����� ��� ����
		// 3���� �޼ҵ尡 ����Ǵ� ���� �� �̸��� Ŭ������ �޸𸮿� �ø� => ���� �ε�
		
		
		// 1. �̹� ������ �ν��Ͻ����� getClass() �޼ҵ� ��� (Object���� �����ϴ� �޼ҵ�)
		Class pClass1 = person.getClass();
		
		System.out.println(pClass1.getName()); // classEx.Person
		
		// 2. Ŭ�������� ���� �������� ���
		Class pClass2 = Person.class;
		
		System.out.println(pClass2.getName()); // classEx.Person
		
		// 3. forName() �޼ҵ� ���
		Class pClass3 = Class.forName("classEx.Person");
		System.out.println(pClass3.getName()); // classEx.Person
		
		System.out.println("========================");
		
		Person p = new Person();
		
		Class pClass = Class.forName("classEx.Person");
		
		Person p2 = (Person) pClass.newInstance(); // �ش� Ŭ������ default constructor�� ȣ���
		System.out.println(p);
		System.out.println(p2);
	}	
}
