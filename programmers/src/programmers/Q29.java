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
		
		String s = "DFSFA EFDAdd";
		String str = ""; //정답 문자열을 저장할 문자열
		
		int cnt = 1; //문자열 내 공백의 개수를 저장할 변수. 1로 초기화한 이유는 이 cnt를 문자열배열의 방 크기로 쓰기 위해서이다.(공백이 2개면 문자열은 3개로 쪼개지기 때문)
		
		for(int i=0; i<s.length(); i++) { //입력받은 문자열의 길이만큼 
			if(s.charAt(i) == ' ') { //현재 문자가 ' '이면
				cnt++; //cnt 증가
			}//if end
		}//for end
		
		String[] strarr = new String[cnt]; //문자열 배열의 방 크기를 cnt로 초기화
		//System.out.println(s.indexOf(" "));
		
		int j = 0; //쪼개진 문자열 배열 안에 각각 들어있는 문자의 길이만큼 조회할 변수 j
		int idx = s.indexOf(" "); //s문자열의 " "위치의 인덱스 숫자를 반환, 찾지 못하면 -1을 반환한다.
		//System.out.println(idx);
		
		
		//문자열배열에 " "을 기준으로 쪼개서 문자열을 각각 방에 넣을 것이다
		for(int i=0; i<strarr.length; i++) { //문자열배열 strarr크기만큼 반복
			if(idx == -1) { //idx가 -1이라는 뜻은 " "을 찾지 못했다는 뜻 (문자열의 끝에 해당)
				strarr[i] = s.substring(j, s.length()); //strarr[i]에 s의 j번째 ~ s의 문자끝까지 추출해서 저장
				//System.out.println(strarr[i]);
			}else { //idx가 -1이 아니라 어떠한 값을 반환한다면 해당 문자열사이에 " "가 있다는 뜻
				strarr[i] = s.substring(j,idx); //strarr[i]에 s의 j번째 ~ 해당 공백 앞까지 잘라서 저장
				j = idx + 1; //j의 값을 " " 다음 칸의 숫자로 바꿔준다. (다음 문자열부터 다음 공백까지의 첫 글자가 되어줄 j)
				idx = s.indexOf(" ", idx+1); //idx의 값을 idx+1의 위치부터 " "을 찾아서 그에 해당하는 값으로 바꿔준다. (현재 idx위치보다 다음위치에 있는 " "을 찾아야하니까)
				//System.out.println(j);
				//System.out.println(idx);
				//System.out.println(strarr[i]);
			}//if end
			//System.out.println(strarr[i]);
		}//for end
		
		for(int x=0; x<strarr.length; x++) { //문자열 배열 strarr크기만큼 반복
			for(int y=0; y<strarr[x].length(); y++) { //strarr[x]번째 방에 있는 문자열 자체의 길이를 조회
				if(y%2 == 0) { //strarr[x]번째에 있는 문자열 길이의 현재 위치가 짝수면
					if(strarr[x].charAt(y)>='a' && strarr[x].charAt(y)<='z') { //해당 문자가 소문자면
						str += (char)(strarr[x].charAt(y) - 32); //대문자로 바꿔주고
					}else {//해당 문자가 대문자면
						str += (char)(strarr[x].charAt(y)); //그대로 저장
					}
					//System.out.println(str);
				}else { //strarr[x]번째에 있는 문자열 길이의 현재 위치가 홀수면
					if(strarr[x].charAt(y)>='A' && strarr[x].charAt(y)<='Z') { //해당 문자가 대문자면
						str += (char)(strarr[x].charAt(y)+32); //소문자로 바꿔주고
					}else { //해당 문자가 소문자면
						str += (char)(strarr[x].charAt(y)); //그대로 저장
					}//if end
				}//if end
			}//for end
			if(x < strarr.length-1) { //현재 조회중인 방의 위치가 제일 끝이 아니면
				str += " "; //전부 조회했을때 마지막에 " "를 붙여주기 (제일 끝엔 붙일 필요가 없으니까 그냥 탈출)
			}//if end
		}//for end
		
		System.out.println(str);
		
		//09.12
		//입출력 예시는 통과하는데 제출하니까 모든 테스트케이스를 통과하지 못했다.ㅠㅠ
		//다른 예시에는 해당하지 않나보다.. 내일 다른 문자열로 다시 도전해봐야겠다.
		
		//09.13
		//다른 문자열로 시도했더니 공백이 2개인 것도 잘 통과가 되는데 대문자만 있거나 소문자만 있는 문자열에 대한 조건을 생각하지 않아서 에러가 난거였다!
		//for문안에 소문자/대문자조건을 걸었더니 테스트케이스를 전부 통과했다.
	}

}
