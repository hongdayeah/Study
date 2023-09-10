package programmers;

public class Q18 {

	public static void main(String[] args) {
		// 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 
		// 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
		
		/*
		 n	return
		 3	"수박수"
		 4	"수박수박"
		 */
		
		int n = 3;
		String str = "";
		
		int i = 0;
		
		do {
			if(str.length()%2 == 0) { //str의 길이가 현재 짝수면 
				str += "수";
				i++;
			}else { //str의 길이가 현재 짝수면 끝이 '수'로 되어 있으니 '박' 차례가 되어야 한다.
				str += "박"; 
				i++;
			}
					
		}while(i<n); //i가 n보다 작으면 무한 반복
		
		System.out.println(str);

	}

}
