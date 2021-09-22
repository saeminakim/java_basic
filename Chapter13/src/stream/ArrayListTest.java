package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {

	public static void main(String[] args) {

		List<String> sList = new ArrayList<String>();
		sList.add("Thomas");
		sList.add("James");
		sList.add("Edward");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.println(s)); // stream과 lambda식 이용
		// 이후 stream은 소모되기 때문에 다시 생성해야 함
					
		// for문 이용
//		for(String s : sList) {
//			System.out.println(s);
//		}
		
		sList.stream().sorted().forEach(s -> System.out.println(s));
	}

}
