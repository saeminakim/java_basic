package classpart;

public class Student {
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}
	
	/*
	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.studentName = "�̼���";
		studentLee.address = "����� �����";
		
		studentLee.showStudentInfo();
	}
	*/
}
