package arraylist;

public class StudentTest {

	public static void main(String[] args) {

		Student lee = new Student(1001, "Lee");
		lee.addSubject("국어", 100);
		lee.addSubject("수학", 90);
		
		lee.showStudentInfo();
		
		System.out.println("==========");
		
		Student kim = new Student(1002, "Kim");
		kim.addSubject("국어", 100);
		kim.addSubject("수학", 90);
		kim.addSubject("영어", 80);
		
		kim.showStudentInfo();
	}

}
