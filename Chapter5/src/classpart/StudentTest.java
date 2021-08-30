package classpart;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "이순신"); // heap 메모리에 studentLee(참조변수) 생성
//		studentLee.studentName = "이순신";
//		studentLee.studentID = 100;
		studentLee.address = "28 The Broadway London";
		
		Student studentKim = new Student(); 
		studentKim.studentName = "김유신";
		studentKim.studentID = 101;
		studentKim.address = "28 The Broadway London";
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		
		System.out.println(studentLee); // 해당 변수가 가리키고 있는 heap메모리 주소(참조값)가 출력됨
		System.out.println(studentKim);
	}

}
