package programmers;

public class Q05 {

	public static void main(String[] args) {
		// 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
		
		long n = 12345;
		
		String snum = String.valueOf(n); //문자열로 변환
		char[] cnum = snum.toCharArray(); //문자열을 문자배열로 변환해서 한개씩 넣음
		
		char tmp;
		
		for(int i=0; i<cnum.length/2; i++) { //순서 바꿔서 넣기
			tmp = cnum[i];
			cnum[i] = cnum[cnum.length-1-i];
			cnum[cnum.length-1-i] = tmp;
		}
		
		int[] answer = new int[cnum.length];
		
		
		for(int i=0; i<cnum.length; i++) {
			answer[i] = cnum[i] - '0'; //int형으로 변환
		}
	}

}
