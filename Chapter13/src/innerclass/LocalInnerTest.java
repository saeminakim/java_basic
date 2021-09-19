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
		
		// 아래 MyRunnable 클래스를 익명으로 바꿔서 사용
//		class MyRunnable implements Runnable {
//
//			@Override
//			public void run() {
//				// localNum += 100; 
//				// run() 메소드가 호출될 때쯤에는 getRunnable()의 지역변수 localNum이 메모리에서 사라질 수 있기 때문에 에러 발생
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
