package arraylist;

public class StudentTest {

	public static void main(String[] args) {

		Student lee = new Student(1001, "Lee");
		lee.addSubject("����", 100);
		lee.addSubject("����", 90);
		
		lee.showStudentInfo();
		
		System.out.println("==========");
		
		Student kim = new Student(1002, "Kim");
		kim.addSubject("����", 100);
		kim.addSubject("����", 90);
		kim.addSubject("����", 80);
		
		kim.showStudentInfo();
	}

}
