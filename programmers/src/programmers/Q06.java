package programmers;

public class Q06 {

	public static void main(String[] args) {
		// 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
		
		int[] arr = {1,2,3,4};
		
        double sum = 0.0;
        double avg = 0.0;
        
        for(int i=0; i<arr.length; i++){
        	sum += arr[i];
        }
        avg = sum/arr.length;
        
        System.out.println(avg);
	}

}
