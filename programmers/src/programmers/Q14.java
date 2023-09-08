package programmers;

public class Q14 {

	public static void main(String[] args) {
		// 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
		// 전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.

		/*
		 phone_number		return
		"01033334444"	"*******4444"
		"027778888"		"*****8888" 
		 */
		
		String phone_number = "01033334444";
		String hidden_number = "";
		
		for(int i=0; i<phone_number.length(); i++) { //맨 뒤 4자리는 보여주고 나머지는 전부 *로 바꾸기
			if(i<phone_number.length()-4) { //phone_number의 길이에서 -4한 숫자보다 적은 위치의 숫자면
				hidden_number += "*"; // "*"로 바꾸고
			}else { //아니면
				hidden_number += phone_number.charAt(i); //phone_number 그대로 보여주기
			}
		}//for() end
		
		System.out.println(hidden_number);
	}

}
