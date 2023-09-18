package programmers;

public class Q34 {

	public static void main(String[] args) {
		// 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 
		// 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다. 
		// 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
		
		/*
		 s			n			result
		"AB"		1			"BC"
		"z"			1			"a"
		"a B z"		4			"e F d"
		 */
		
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int n = 25;
		String str = ""; //바꾼 문자열을 저장할 문자열
		
		int i = 0;
		char temp = 'a';
		
		while(i < s.length()) { //i가 s.length가 되면 반복문 탈출
			if(s.charAt(i)>='a' && s.charAt(i)<'z') { //현재 문자가 소문자면 (대신 z는 포함하면 안됨)
				temp = (char)(s.charAt(i) + n); //temp에 먼저 그 문자에 n만큼 더한 문자를 저장해두고 
				if(temp > 'z') { //그 문자가 z를 초과하면 이상한 문자가 나오니까 다시 a로 돌아가서 연산할 수 있게
					temp = (char)(96 + (temp - 'z')); //a-1에 현재 temp값에 'z'만큼 뺀 값을 더해서 문자로 바꾸기
				}
				str += temp; //최종 문자를 문자열에 저장
			}else if(s.charAt(i)>='A' && s.charAt(i)<'Z') {
				temp = (char)(s.charAt(i) + n);
				if(temp > 'Z') {
					temp = (char)(64 + (temp - 'Z'));
				}
				str += temp;
			}else if(s.charAt(i) == 'z') { //소문자 z와 동일하면
				temp = (char)(96 + n); //a-1에 n만큼 더하고
				if(temp > 'z') { //그게 z를 초과하면
					temp = (char)(96 + (temp - 'z')); //다시 a-1로 돌아가서 연산을 해야한다
				}
				str += temp;
			}else if(s.charAt(i) == 'Z') {
				temp = (char)(64 + n);
				if(temp > 'Z') {
					temp = (char)(64 + (temp - 'Z'));
				}
				str += temp;
			}else if(s.charAt(i) == ' ') { //공백이면
				str += ' '; //그냥 공백 저장
			}
			i++;
		}
		
		System.out.println(str);
		
		//분명히 좀 더 쉽게 할 수 있는 방법이 있을텐데 고민해봐야겠다.
	}

}
