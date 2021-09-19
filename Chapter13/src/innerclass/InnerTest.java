package innerclass;

class OutClass {
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() { // �ƿ� Ŭ������ �����ڿ��� �̳� Ŭ������ �����ؼ� ���
		inClass = new InClass();
	}
	
	private class InClass { // �ν��Ͻ� �̳� Ŭ����
		int inNum = 200;
		// static int sInNum = 100;
		// ���ǿ����� �̳� Ŭ�������� static ���� ����� �� ���ٰ� �ϰ� ���� �߻��ߴµ� ���� ������ �ȳ���..?
		
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}		
	}
	
	public void usingInTest() {
		inClass.inTest();
	}
	
	static class InStaticClass {
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
//			num += 10;  // static Ŭ�����̱� ������ �ܺ� ���� ��� �Ұ�
			sNum += 10;
			
			System.out.println(sNum);
			System.out.println(iNum);
			System.out.println(sInNum);
		}
		
		static void sTest() {
			System.out.println(sNum);
			// System.out.println(iNum); // ȣ�� �Ұ�
			System.out.println(sInNum);
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {

		OutClass outClass = new OutClass();
		outClass.usingInTest();
//			outClass.inClass.inTest();
//			
//			OutClass.InClass inClass = outClass.new InClass();
//			inClass.inTest();
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
		OutClass.InStaticClass.sTest();
	}

}
