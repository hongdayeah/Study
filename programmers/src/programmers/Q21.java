package programmers;

public class Q21 {

	public static void main(String[] args) {
		// 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
		// s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
		
		/*
		 	s		return
		"Zbcdefg"	"gfedcbZ"
		 */
		
		String s = "Zbcdefg";
		char[] str = new char[s.length()];
		String newstr = "";
		char temp = 'a'; //임시 char 변수
		
		//str배열에 s의 문자 각각 넣기
		for(int i=0; i<str.length; i++) {
			str[i] = s.charAt(i);
			//System.out.println(str[i]);
		}//for end
		
		//char배열 내의 문자를 큰 것에서 작은 순으로 정렬
		for(int i=0; i<str.length; i++) {
			for(int j=i; j<str.length; j++) {
				if(str[i] < str[j]) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}//if end
			}//for end
			newstr += str[i];
		}//for end
		
		System.out.println(newstr);
		
	}

}
