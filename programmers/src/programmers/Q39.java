package programmers;

import java.util.Arrays;

public class Q39 {

	public static void main(String[] args) {
		// 문자열 s가 주어졌을 때, s의 각 위치마다 자신보다 앞에 나왔으면서, 자신과 가장 가까운 곳에 있는 같은 글자가 어디 있는지 알고 싶습니다.
		// 예를 들어, s="banana"라고 할 때,  각 글자들을 왼쪽부터 오른쪽으로 읽어 나가면서 다음과 같이 진행할 수 있습니다.

		/*
		  b는 처음 나왔기 때문에 자신의 앞에 같은 글자가 없습니다. 이는 -1로 표현합니다. a는 처음 나왔기 때문에 자신의 앞에 같은 글자가
		  없습니다. 이는 -1로 표현합니다. n은 처음 나왔기 때문에 자신의 앞에 같은 글자가 없습니다. 이는 -1로 표현합니다. a는 자신보다 두
		  칸 앞에 a가 있습니다. 이는 2로 표현합니다. n도 자신보다 두 칸 앞에 n이 있습니다. 이는 2로 표현합니다. a는 자신보다 두 칸,
		  네 칸 앞에 a가 있습니다. 이 중 가까운 것은 두 칸 앞이고, 이는 2로 표현합니다. 따라서 최종 결과물은 [-1, -1, -1, 2,
		  2, 2]가 됩니다.
		  
		  문자열 s이 주어질 때, 위와 같이 정의된 연산을 수행하는 함수 solution을 완성해주세요.
		  
		  s					result
		"banana"	[-1, -1, -1, 2, 2, 2]
		"foobar"	[-1, -1, 1, -1, -1, -1]
		  
		 */
		
		String s = "foobar";
		char[] chs = new char[s.length()]; //s를 한 글자씩 쪼개서 넣을 문자형 배열
		int[] arr = new int[s.length()]; //s의 글자 개수만큼 숫자 입력
		
		for(int i=0; i<s.length(); i++) {
			chs[i] = s.charAt(i);
			//System.out.println(chs[i]);
		}
		
		for(int i=0; i<chs.length; i++) { ///쪼개서 넣은 문자 배열 끝까지 조회
			if(i==0) { //맨 앞글자면 -1
				arr[i] = -1;
			}else { //맨 앞 글자가 아니면
				for(int j=0; j<i; j++) { //맨 첫번째 문자부터 해당 글자 전까지 조회해서
					if(j==i-1) { //j가 끝까지 돌았는데도
						if(arr[i]==0) { //arr[i]가 0이면
							arr[i] = -1; //arr[i] 는 -1이다. (똑같은 문자를 못 찾았으니까)
						}
					}
					if(chs[j] == chs[i]) { //j번째 문자가 i번째 문자와 같으면
						arr[i] = i - j ; //arr[i]에 i - j (해당 위치) 저장
					}
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
