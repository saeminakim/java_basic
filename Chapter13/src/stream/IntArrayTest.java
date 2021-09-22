package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 5};
		
		IntStream stream = Arrays.stream(arr); // stream 생성
		int sum = stream.sum();  
		System.out.println(sum); // 15 출력
		
		// int count = (int)stream.count();
		// System.out.println(count); // 에러 발생
		// 이미 스트림이 생성되고 소모되어 사라졌기 때문에 에러 발생
		
		int count = (int)Arrays.stream(arr).count();
		System.out.println(count); // 5 출력
		
	}

}
