package programmers;

public class Q32 {

	public static void main(String[] args) {
		// 숫자로 이루어진 문자열 t와 p가 주어질 때, t에서 p와 길이가 같은 부분문자열 중에서, 이 부분문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은 것이 나오는 횟수를 return하는 함수 solution을 완성하세요.
		// 예를 들어, t="3141592"이고 p="271" 인 경우, t의 길이가 3인 부분 문자열은 314, 141, 415, 159, 592입니다. 이 문자열이 나타내는 수 중 271보다 작거나 같은 수는 141, 159 2개 입니다.
		
		/*
		 	t				p			result
		"3141592"	  	  "271"			  2
		"500220839878"	  "7"			  8
		"10203"			  "15"			  3
		 
		 */
		
		String t = "500220839878";
		String p = "7";
		int num = p.length(); //p의 자리수만큼 배열 방믈 만들 계획
		long pnum = Long.parseLong(p);
		
		int cnt = 0; //해당되는 문자열의 개수를 저장할 변수
		
		/*
		for(int i=0; i<t.length()-p.length()+1; i++) {
			if(i==t.length()-p.length()+1) {
				if(Integer.parseInt(t.substring(i, t.length())) <= Integer.parseInt(p)) {
					cnt++;
				}
			}else {
				if(Integer.parseInt(t.substring(i, i+(p.length()))) <= Integer.parseInt(p)) {
					cnt++;
				}
			}
		}
		*/
		
		long[] arr = new long[t.length()-p.length()+1]; //t의 숫자를 p의 숫자 자리수만큼 갈라서 나오는 개수만큼 초기화
		
		int i = 0;
		int j = 0;
		//System.out.println(t.substring(j,j+num));
		while(i<arr.length) {
			arr[i] = Long.parseLong(t.substring(j,j+num));
			//System.out.println(arr[i]);
			if(arr[i]<=pnum) {
				cnt++;
			}
			i++;
			j++;
			//System.out.println(arr[i]);
		}
		System.out.println(cnt);
		//System.out.println(num);
	}
	
	//위 방식으로 풀었을 때에도 런타임 에러가 떠서 아래 방식으로 바꿨는데도 불구하고 런타임 에러가 똑같이 떴다.
	//다른 사람의 힌트를 봤는데 타입을 int말고 long으로 바꿔야한다고 해서 필요한 부분을 long타입으로 바꿨더니 모든 테스트케이스가 통과했다.

}
