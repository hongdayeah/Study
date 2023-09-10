package programmers;

public class Q17 {

	public static void main(String[] args) {
		// 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
		
		/*
		   s		return
		"abcde"		 "c"
		"qwer"		 "we"
		 */
		
		String s = "qwer";
		String anstr = "";
		
		if(s.length()%2 != 0) { // s의 길이가 홀수면 가운데 한 글자만 반환
			anstr += s.charAt(s.length()/2);
		}else{ // s의 길이가 짝수면 가운데 두 글자 반환
			for(int i=s.length()/2 - 1; i<=s.length()/2; i++) {
				anstr += s.charAt(i);
			}//for end
		}//if end
		
		System.out.println(anstr);

	}

}
