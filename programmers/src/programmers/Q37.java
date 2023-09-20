package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class Q37 {

	public static void main(String[] args) {
		// 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 
		// 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
		
		/*
		 		strings				n				return
			["sun", "bed", "car"]	1		["car", "bed", "sun"]
			["abce", "abcd", "cdx"]	2		["abcd", "abce", "cdx"]
		 
		 */
		
		
		String[] strings = {"abc", "ab"};
		int n = 1;
		
		/*
		for(int i=0; i<strings.length-1; i++) {
			for(int j=i+1; j<strings.length; j++) {
				if(strings[i].charAt(n) > strings[j].charAt(n)) {
					temp = strings[i];
					strings[i] = strings[j];
					strings[j] = temp;
				}else if(strings[i].charAt(n) == strings[j].charAt(n)) {
					if(strings[i].length() <= strings[j].length()) {
						for(int k=0; k<strings[i].length(); k++) {
							if(strings[i].charAt(k) > strings[j].charAt(k)) {
								temp = strings[i];
								strings[i] = strings[j];
								strings[j] = temp;
							}
						}
					}else {
						for(int k=0; k<strings[j].length(); k++) {
							if(strings[i].charAt(k) > strings[j].charAt(k)) {
								temp = strings[i];
								strings[i] = strings[j];
								strings[j] = temp;
							}
						}
					}
					
				}
			}
		}
		*/
		
		/*발상의 전환이 필요하다. 비교해야할 n번째의 문자를 문자열 제일 앞에 붙이고 비교한 후, 해당 문자열이 동일하면 그다음 문자부터 차례대로 비교할 수 있으니 여러개의 for문과 if문이 필요하지 않다.
		  그리고 sort도 적극적으로 사용해야 한다.*/
		
		String[] answer = {};
		ArrayList<String> arr = new ArrayList<>(); //일단 arr에 n+문자열 한 문자를 넣을 계획이다
		
		for(int i=0; i<strings.length; i++) {
			arr.add(strings[i].charAt(n) + strings[i]); //arr Arraylist에 string[i]번째 문자 앞에 n번째문자를 붙인 새로운 문자열을 순서대로 추가한다.
		}
		
		Collections.sort(arr); //arraylist인 arr을 정렬한다.
		answer = new String[strings.length];//정답 배열의 크기를 선언한다.
		
		for(int i=0; i<answer.length; i++) {
			answer[i] = arr.get(i).substring(1, arr.get(i).length()); //정답배열에 arr의 i번째 문자열을 가져오되, 맨 앞에 n번째 문자가 붙어있으니까 1번째 자리부터 해당문자열의 끝까지를 추출해서 가져온다. 
		}
	}

}
