package loopexample;

public class ForExample {

	public static void main(String[] args) {

		/*
		int num;
		int sum;
		
		for(num = 1, sum = 0; num <= 10; num++) {
			sum += num;			
		}
		System.out.println(sum);
		*/
		
		/* for문을 이용한 구구단
		int dan;
		int times;
		
		for(dan = 2; dan <= 9; dan++) {
			for(times = 1; times <=9; times++) {
				System.out.println(dan + " x " + times + " = " + dan * times);
			}
			System.out.println();
		} */
		
		/* while문을 이용한 구구단
		int dan = 2;
		int times = 1;
		
		while(dan <= 9) {
			times = 1;
			while(times <=9) {
				System.out.println(dan + " x " + times + " = " + dan * times);
				times++;
			}
			dan++;
			System.out.println();
		} */
		
		/* // while문을 이용한 구구단 짝수만 출력
		int dan = 2;
		int times = 1;
		
		while(dan <= 9) {
			if(dan % 2 !=0) {
				dan++;
				continue;
			}
			times = 1;
			while(times <=9) {
				System.out.println(dan + " x " + times + " = " + dan * times);
				times++;
			}
			dan++;
			System.out.println();
		} */
		
		int dan = 2;
		int times = 1;
		
		while(dan <= 9) {
	
			times = 1;
			while(times <=9) {
				if(times > dan) break;
				System.out.println(dan + " x " + times + " = " + dan * times);
				times++;
			}
			dan++;
			System.out.println();
		}
	}

}
