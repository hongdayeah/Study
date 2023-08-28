package Chapter3;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		//p35. 숫자의 합 구하기
		//N개의 숫자가 공백없이 써 있다. 이 숫자를 모두 합해 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //숫자 입력
		String sNum = sc.next(); //공백없이 숫자 입력
		char[] cNum = sNum.toCharArray(); //입력 값을 String형 변수인 sNum에 저장한 후 char[]형 변수로 변환
		
		int sum = 0;
		
		for(int i=0; i<cNum.length; i++) {
			sum += cNum[i] - '0'; //int형 변수인 sum에 cNum의 숫자를 한자리씩 떼고 숫자로 변환하여 누적해서 더하기
		}
		
		System.out.println(sum);
		
		//문제는 간단하지만 내가 Scanner 객체 사용에 매우 익숙하지 않기 때문에 풀이의 도움을 받았다.

	}

}
