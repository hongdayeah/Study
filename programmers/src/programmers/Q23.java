package programmers;

public class Q23 {

	public static void main(String[] args) {
		// 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
		// 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
		
		/*
		 s			return
		"a234"		false
		"1234"		true
		 */
		
		String s = "a234";
		boolean ans = true;
		
		if(s.length() == 4 || s.length() ==6) {
			for(int i=0; i<s.length(); i++) {
				if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) { // 해당 문자가 알파벳이면
					ans = false;
				}//if end
			}//for end
		}else{
			ans = false;
		}//if end
		
		
		System.out.println(ans);
	}

}
