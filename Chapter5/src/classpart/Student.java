package classpart;

public class Student {
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student() {}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
	}
	// 생성자 오버로딩 : 매개변수가 다른 생성자가 있는 경우
	
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		this.studentName = name;
	}
	
}
