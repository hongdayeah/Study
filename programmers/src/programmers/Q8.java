package programmers;

public class Q8 {

	public static void main(String[] args) {
		// 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 
		//자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
		
		boolean answer = true;
		
		int x = 18;
		int sum = 0;
		
		String snum = String.valueOf(x); //int 변수를 문자로 변환
		char[] cnum = snum.toCharArray(); //문자열을 문자 배열로 변환
		
		int[] inum = new int[cnum.length];
		
		for(int i=0; i<inum.length; i++) {
			inum[i] = cnum[i] - '0'; //문자배열을 정수배열로 변환
			sum += inum[i]; //sum 변수에 누적 합
		}
		if(x%sum==0) { //자릿수의 합으로 나눴을 때 나머지가 0 이면 하샤드 수
			answer = true;
		}else {
			answer = false;
		}
		
		System.out.println(answer);
	}

}
