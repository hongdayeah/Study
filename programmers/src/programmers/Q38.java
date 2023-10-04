package programmers;

import java.util.Arrays;

public class Q38 {

	public static void main(String[] args) {
		// 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
		// 예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
		// array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
		// 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
		// 2에서 나온 배열의 3번째 숫자는 5입니다.
		// 배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, 
		// commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
		
		/*
		 		array					commands						return
		[1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]		[5, 6, 3]
		 
		 */
		
		
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] ans = new int[commands.length]; //commands의 길이만큼 배열의 크기가 정해진다.
		
		//commands의 0번째 요소는 i, 1번째 요소는 j, 2번째 요소는 k이다.
		//array에서 0번째는 없고 1부터 시작한다. 고로 i-1, j-1, k-1로 생각하면 된다.
		
		//1. array에서 i-1번째부터 j-1번째까지 잘라서 새로운 배열에 넣기
		for(int x=0; x<commands.length; x++) {

			int i = commands[x][0];
			int j = commands[x][1];
			int k = commands[x][2];
			
			int[] newarr = new int[j-i+1]; //commands의 x번째 배열에서의 정렬 전 배열의 크기는 j-i+1이다.
			
			for(int o=0; o<newarr.length; o++) { //o를 0부터 newarr 끝까지 반복
				for(int a=i-1; a<j; a++) { //i-1부터 (0이 없으니까) j-1까지
					newarr[o] = array[a]; //newarr[o]번째에 array[a]번째 수를 넣는다.
					//System.out.print(newarr[o] + " ");
					o++;
				}
				//System.out.println();
			}
			
			//2. 새로운 배열 정렬하기
			Arrays.sort(newarr);
			//System.out.println(Arrays.toString(newarr));
			
			//3. 정렬된 배열에서 k-1번째 수를 정답 배열의 x번째에 저장(0번째가 없어서 k-1이 k번째가 된다)
			ans[x] = newarr[k-1];
			
			//System.out.println(ans[x]);

		}
		
		//System.out.println(Arrays.toString(ans));
	}

}
