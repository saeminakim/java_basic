package array;

public class TwoDimensionArray {

	public static void main(String[] args) {

//		int [][] arr = new int[2][3];
//		
//		System.out.println(arr.length);  // 2
//		System.out.println(arr[0].length); // 3
//		System.out.println(arr[1].length); // 3
		
		int[][] arr = {{1, 2, 3}, {4, 5, 6}}; // 2행 3열의 2차원 배열 생성
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);  // 0,0부터 시작해서 0,2까지, 1,0부터 1,2까지 출력
			}
		}
		
	}

}
