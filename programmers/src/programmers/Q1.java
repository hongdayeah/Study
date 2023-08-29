package programmers;

public class Q1 {

	public static void main(String[] args) {
		//LEVEL 1. 자릿수 더하기
		
		int n = 123; //매개변수로 입력받은 자릿수 n
		
		String snum = Integer.toString(n); //문자열로 변환
		char[] cnum = snum.toCharArray(); //문자배열에 각각 저장
		
		int sum = 0;
		
		for(int i=0; i<cnum.length; i++) {
			sum += cnum[i] -'0';
		}
		
		System.out.println(sum);
	}

}
