package programmers;

import java.util.Arrays;

public class Q24 {

	public static void main(String[] args) {
		// 행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다. 
		// 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
		
		/*
		 	arr1			arr2		return
		[[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
		[[1],[2]]		[[3],[4]]		[[4],[6]]
		 
		 */
		
		//{{1,0}, {2,0}}  은 크기가 2*2인 2차원 배열. 각 요소는 0 또는 1의 값을 가진다. 2개의 행과 2개의 열을 가진다.
		//{{1}, {2}}	은 크기가 2*1인 2차원 배열. 각 행마다 1개의 요소가 있고 1 또는 2의 값을 가짐. 2개의 행과 1개의 열을 가지고 있다.
		
		int[][] arr1 = {{1}, {2}}; 
		int[][] arr2 = {{3}, {4}};
		int[][] ans = new int[arr1.length][arr1[0].length];
		
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				ans[i][j] += arr1[i][j];
			}//for end
		}//for end
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				ans[i][j] += arr2[i][j];
			}
		}
		
		
		System.out.println(Arrays.deepToString(ans));
	}

}
