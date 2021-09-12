package object;

class Student {
	int studentID;
	String studentName;
	
	Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(studentID == std.studentID) 
				return true;
			else 
				return false;
		}
		return false;
	}	
	
	public int hashCode() {
		return studentID;
	}
	
}

public class EqualsTest {

	public static void main(String[] args) {
		String str1 = new String("test");
		String str2 = new String("test");
		
		System.out.println(str1.hashCode()); 
		System.out.println(str2.hashCode());
		// 두 개 결과가 같음 hashCode()가 재정의 되어있기 때문
		// 이 때 실제 메모리 주소를 알고 싶다면 System.identityHashCode 사용
		
		System.out.println("=========================");
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		
		System.out.println("=========================");
		
		System.out.println(str1 == str2); // false 두 변수의 주소가 다르기 때문
		System.out.println(str1.equals(str2)); // true 두 변수에 담긴 문자열이 같기 때문
		
		System.out.println("=========================");
		
		Student std1 = new Student(10001, "Thomas");
		Student std2 = new Student(10001, "Thomas");
		
		System.out.println(std1 == std2); // false
		System.out.println(std1.equals(std2)); // false
		// 위처럼 equals()를 재정의하면 true
		
		System.out.println("=========================");
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
	}

}
