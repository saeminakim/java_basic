package innerclass;

class OutClass {
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() { // 아웃 클래스의 생성자에서 이너 클래스를 생성해서 사용
		inClass = new InClass();
	}
	
	private class InClass { // 인스턴스 이너 클래스
		int inNum = 200;
		// static int sInNum = 100;
		// 강의에서는 이너 클래스에서 static 변수 사용할 수 없다고 하고 에러 발생했는데 나는 에러가 안난다..?
		
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
//			num += 10;  // static 클래스이기 때문에 외부 변수 사용 불가
			sNum += 10;
			
			System.out.println(sNum);
			System.out.println(iNum);
			System.out.println(sInNum);
		}
		
		static void sTest() {
			System.out.println(sNum);
			// System.out.println(iNum); // 호출 불가
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
