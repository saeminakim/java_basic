package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		
		boolean b1 = set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		
		System.out.println(set);
		
		boolean b2 = set.add("aaa");
		System.out.println("b1 : " + b1 + ", b2 : " + b2);
		System.out.println(set); // �ߺ��� ������ �ʱ� ������ aaa�� �� ���� ����
		
	}

}
