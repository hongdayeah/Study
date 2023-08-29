package programmers;

public class Q07 {

	public static void main(String[] args) {
		// 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
		// 예를들어 n이 118372면 873211을 리턴하면 됩니다.
		
		long n = 118372;
		
		String snum = String.valueOf(n); //string 문자열로 변환
		char[] cnum = snum.toCharArray(); //char배열로 변환
		
		int[] inum = new int[cnum.length]; //int배열 크기 초기화
		
		for(int i=0; i<inum.length; i++) { //int배열에 숫자로 저장
			inum[i] = cnum[i] - '0';
		}
		
		int tmp = 0;
		for(int i=0; i<inum.length-1; i++) { //i번째 숫자를
			for(int j=i+1; j<inum.length; j++) { //j번째 숫자와 비교해서 
				if(inum[i]<inum[j]) { // i번째 숫자가 j번째 숫자보다 작으면
					tmp = inum[i];
					inum[i] = inum[j];
					inum[j] = tmp; //자리 변경
				}
			}	
		}
		String snum2 = "";
		for(int i=0; i<inum.length; i++) { //int배열에 있던 숫자를 문자열로 변환
			snum2 += inum[i];	
		}
		
		long answer = Long.parseLong(snum2); //long형으로 재변환
		
		System.out.println(answer);
	}

}
