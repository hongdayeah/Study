package programmers;

public class Q15 {

	public static void main(String[] args) {
		// 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. 
		// numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.

		/*
		    numbers		   result
		[1,2,3,4,6,7,8,0]	14
		[5,8,4,0,6,7,9]	    6
		  
		 */
		
		int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
		int sum = 0; //없는 숫자끼리의 합을 저장할 변수
		
		//0~9까지의 합은 45이므로 45에서 현재 배열값을 모두 빼면 result값이 나온다
		for(int i=0; i<numbers.length; i++) {
			sum += numbers[i];
		}//for() end
		
		int result = 45 - sum;
		
		System.out.println(result);
		
		
	}

}
