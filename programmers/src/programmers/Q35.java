package programmers;

public class Q35 {

	public static void main(String[] args) {
		/*
		 	네오와 프로도가 숫자놀이를 하고 있습니다. 네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임입니다.
			다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.

			1478 → "one4seveneight"
			234567 → "23four5six7"
			10203 → "1zerotwozero3"

			이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다. s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.
			참고로 각 숫자에 대응되는 영단어는 다음 표와 같습니다.

			숫자			영단어
			0			zero
			1			one
			2			two
			3			three
			4			four
			5			five
			6			six
			7			seven
			8			eight
			9			nine
			
			
			입출력 예시
					s				result
			"one4seveneight"		1478
			"23four5six7"			234567
			"2three45sixseven"		234567
			"123"					123
		 */
		
		
		String s = "one4seveneight";
		
		//방식 : 문자열배열 str을 만들어서 영문자를 담아놓고 s와 str[i]를 비교하여 존재하면 그 문자를 숫자로 바꿔서 새로운 문자열 num에 저장할 예정
		//str[0] = "zero", str[1] = "one" ... 등 인덱스와 문자열의 숫자가 같음
		String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		
		for(int i=0; i<str.length; i++) {
			if(s.contains(str[i])) {
				s = s.replace(str[i], Integer.toString(i));
			}
		}
		
		//+ 새로운 문자열 num에 저장하려고 했더니 중간에 숫자가 껴있으면 숫자는 건너뛰고 문자만 저장하게 되는 문제가 생겼다.
		// 그래서 그냥 기존 문자열인 s에 str[i]에 해당하는 문자를 찾아서 바꾸는 방법을 해보려고 했다.
		
		//문자열 s를 숫자로 변환
		int num = Integer.parseInt(s);
		
		System.out.println(num);
		
	}

}
