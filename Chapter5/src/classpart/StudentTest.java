package classpart;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "�̼���"); // heap �޸𸮿� studentLee(��������) ����
//		studentLee.studentName = "�̼���";
//		studentLee.studentID = 100;
		studentLee.address = "28 The Broadway London";
		
		Student studentKim = new Student(); 
		studentKim.studentName = "������";
		studentKim.studentID = 101;
		studentKim.address = "28 The Broadway London";
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		
		System.out.println(studentLee); // �ش� ������ ����Ű�� �ִ� heap�޸� �ּ�(������)�� ��µ�
		System.out.println(studentKim);
	}

}
