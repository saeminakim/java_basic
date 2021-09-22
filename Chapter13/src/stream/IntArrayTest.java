package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 5};
		
		IntStream stream = Arrays.stream(arr); // stream ����
		int sum = stream.sum();  
		System.out.println(sum); // 15 ���
		
		// int count = (int)stream.count();
		// System.out.println(count); // ���� �߻�
		// �̹� ��Ʈ���� �����ǰ� �Ҹ�Ǿ� ������� ������ ���� �߻�
		
		int count = (int)Arrays.stream(arr).count();
		System.out.println(count); // 5 ���
		
	}

}
