package collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

	@Override
	public int compare(String str1, String str2) {

		return str1.compareTo(str2) * -1;
	}

}

public class ComparatorTest {

	public static void main(String[] args) {

		// TreeSet<String> tree = new TreeSet<String>(); // 이렇게 생성하면 오름차순 정렬
		TreeSet<String> tree = new TreeSet<String>(new MyCompare()); // 이렇게 생성하면 위에 선언한 방법대로 내림차순 정렬됨

		tree.add("aaa");
		tree.add("ccc");
		tree.add("bbb");

		System.out.println(tree);
	}

}
