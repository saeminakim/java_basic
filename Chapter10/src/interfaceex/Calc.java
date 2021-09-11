package interfaceex;

public interface Calc {
	// interface�� ����� �߻�޼ҵ�� �����
	
	// Ű���� ���� ���� �ʾƵ� public static final�� ����
	double PI = 3.14;
	int ERROR = -999999999;
	
	// interface�� �ڵ����� public abstract�� �����ϵ�

	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	// interface���� ������ ����Ʈ �޼ҵ�
	// default Ű���带 �ݵ�� ����� ��
	default void desciption() { 
		System.out.println("���� ���⸦ �����մϴ�.");
	}
	
	
	// ���� �޼ҵ� ����
	// �ٸ� Ŭ�������� Calc.total()�� ȣ��
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		return total;
	}
}
