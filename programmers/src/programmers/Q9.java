package programmers;

public class Q9 {

	public static void main(String[] args) {
		//두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
		//예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

		long answer = 0;
		
		int a = 3;
		int b = 5;
		int max = Math.max(a, b); //두 수를 비교해서 큰 값을 max 변수에 저장
		int min = Math.min(a, b); //두 수를 비교해서 작은 값을 min 변수에 저장
		long sum = 0;
		
		for(int i=min; i<=max; i++) {
			sum += i;//min부터 max까지 누적 합
		}
		
		System.out.println(sum);
	}

}
