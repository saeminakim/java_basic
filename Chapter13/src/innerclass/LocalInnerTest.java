package innerclass;

class Outer {
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("runnable");
		}
	};
	
	public Runnable getRunnable() {
		int localNum = 100;
		
		// �Ʒ� MyRunnable Ŭ������ �͸����� �ٲ㼭 ���
//		class MyRunnable implements Runnable {
//
//			@Override
//			public void run() {
//				// localNum += 100; 
//				// run() �޼ҵ尡 ȣ��� ���뿡�� getRunnable()�� �������� localNum�� �޸𸮿��� ����� �� �ֱ� ������ ���� �߻�
//				
//				System.out.println(outNum);
//				System.out.println(sNum);
//				System.out.println(localNum);
//			}			
//		}
//		
//		return new MyRunnable();
		
		return new Runnable() {

			@Override
			public void run() {
				
				outNum += 10;
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);				
			}			
		};		
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.getRunnable().run();
		
		outer.runnable.run();
	}

}
