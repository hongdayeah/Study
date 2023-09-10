package programmers;

public class Q20 {

	public static void main(String[] args) {
		// 두 정수 left와 right가 매개변수로 주어집니다. 
		// left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
		
		/*
		 left	right	result
		  13	 17	 	  43
		  24	 27	  	  52
		 */
		
		int left = 13;
		int right = 17;
		int ans = 0;
		
		/*
		int i=left;
		
		while(i<=right) { //i가 right를 넘으면 무한반복 탈출
			int cnt = 0; // i의 약수의 개수를 셀 변수
			for(int j=1; j<=i; j++) {
				if(i%j == 0) { //i(현재의 left 수)가 j(증가하는 수)로 나누어 떨어지면 그 몫은 약수
					cnt++;
				}//if end
			}//for end
			
			if(cnt%2 == 0) { //현재 left의 약수의 개수가 짝수면
				ans += cnt; // ans변수에 더하기
			}else { //현재 left의 약수의 개수가 홀수면
				ans -= cnt; //ans변수에서 빼기
			}
		}//while end
		*/
		
		//해당 방법이 너~~~~~~~~~~무 오래 걸려서 다른 방법을 생각해봐야겠다.
		//for문으로만 해볼까. . .?
		
		// 심지어 문제도 잘 못 해석했다^^.
		
		for(int i=left; i<=right; i++) { //left부터 right까지 반복
			int cnt = 0; // 현재 left의 약수의 개수를 셀 변수이기 때문에 left가 하나 증가되면 cnt는 매번 초기화시켜야 한다
			for(int j=1; j<=i; j++) { // 현재 left(i)의 약수를 셀 반복문
				if(i%j == 0) { //현재 left를 j로 나눴을 때 나머지가 0이면 j는 현재 left의 약수이므로
					cnt++; //cnt 증가
				}//if end
			}//for end
			if(cnt%2 == 0) { //cnt가 짝수면
				ans += i; // 현재 left를 더하고
			}else { //cnt가 홀수면
				ans -= i; //현재 left를 뺀다.
			}// if end
		}//for end
		
		System.out.println(ans);
		
	}

}
