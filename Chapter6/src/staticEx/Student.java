package staticEx;

public class Student {
	
	private static int serialNum = 10000;
	
	int studentID;
	String studetName;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}

	public static int getSerialNum() {
		int i = 10; //��������
		
		i++;
		System.out.println(i);
		
		// studentName = "ȫ�浿"; // �������, �ν��Ͻ� ����
		
		return serialNum; // static����, Ŭ���� ����
	}

	
}
