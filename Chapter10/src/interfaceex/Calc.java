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
}
