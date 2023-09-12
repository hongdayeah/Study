package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class Q29 {

	public static void main(String[] args) {
		// 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 
		// 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
		
		/*
		 		s				return
		"try hello world"	"TrY HeLlO WoRlD"
		 */
		
		String s = "try hello world";
		String str = "";
		
		int cnt = 1;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == ' ') {
				cnt++;
			}//if end
		}//for end
		
		String[] strarr = new String[cnt];
		//System.out.println(s.indexOf(" "));
		
		int j = 0;
		int idx = s.indexOf(" ");
		//System.out.println(idx);
		
		for(int i=0; i<strarr.length; i++) {
			if(idx == -1) {
				strarr[i] = s.substring(j, s.length());
				//System.out.println(strarr[i]);
			}else {
				strarr[i] = s.substring(j,idx);
				j = idx + 1;
				idx = s.indexOf(" ", idx+1);
				//System.out.println(j);
				//System.out.println(idx);
				//System.out.println(strarr[i]);
			}
			//System.out.println(strarr[i]);
		}
		
		for(int x=0; x<strarr.length; x++) {
			for(int y=0; y<strarr[x].length(); y++) {
				if(y%2 == 0) {
					str += (char)(strarr[x].charAt(y) - 32);
					//System.out.println(str);
				}else {
					str += (char)(strarr[x].charAt(y));
				}
			}
			if(x < strarr.length-1) {
				str += " ";
			}
		}
		
		System.out.println(str);
		
		//입출력 예시는 통과하는데 제출하니까 모든 테스트케이스를 통과하지 못했다.ㅠㅠ
		//다른 예시에는 해당하지 않나보다.. 내일 다른 문자열로 다시 도전해봐야겠다.
	}

}
