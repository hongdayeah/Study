package programmers;

public class Q28 {

	public static void main(String[] args) {
		// 자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
		
		/*
		 n		result
		 45	  	  7
		 125     229
		
		 n (10진법)	n (3진법)		앞뒤 반전(3진법)	10진법으로 표현
			45		1200		0021				7
		 
		 */
		
		int n = 45;
		
		String str = ""; //3진법으로 바꾼 수를 문자열로 하나씩 저장하면 앞뒤 반전된 3진법 수를 문자열로 얻을 수 있을 것 같다.
		
		while(n!=0) { //계속 3으로 나눈 n이 0이 되면 무한반복 탈출
			str += n%3;
			n /= 3;
		}//while end
		//System.out.println(str);
		
		//int num = Integer.parseInt(str,3); //str을 3진수로 해석하여 10진수로 변환한다.
		
		//System.out.println(num);
		
		//만약에 내가 저 방법을 몰랐다면 어떻게 풀어야할까?
		//일단 수를 한 자리씩 쪼개서 배열에 넣고 그 문자열을 다시 정수로 바꿔보자
		char[] chnum = new char[str.length()];
		int[] intnum = new int[chnum.length];
		
		for(int i=0; i<chnum.length; i++) {
			chnum[i] = str.charAt(i);
			intnum[i] = chnum[i] - '0';
		}//for end
		
		int sum = 0;
		int j = intnum.length-1;
		//정수 배열에 잘 들어갔으니 이걸 진법 변환을 하면 된다.
		for(int i=0; i<intnum.length; i++) {
			sum += (int) (intnum[i] * Math.pow(3, j));
			j--;
			//System.out.println(sum);
		}//for end
		
		System.out.println(sum);
	}

}
