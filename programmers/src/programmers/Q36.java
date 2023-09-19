package programmers;

import java.util.Stack;

public class Q36 {
	
	public static String two(int num, int n) { // (2진법해야할 arr[i], n만큼 하기
		Stack<Integer> stack = new Stack<>();
		String snum = "";
		
		for(int i=0; i<n; i++) {
			stack.push(num%2); 
			//System.out.println("num%2 = " + num%2);
			num = num/2;
		}//for end
		
		for(int i=0; i<n; i++) {
			snum += Integer.toString(stack.peek());
			stack.pop();
			//System.out.println("snum = " + snum);
		}
		
		return snum;
	}

	public static void main(String[] args) {
		/*
		네오는 평소 프로도가 비상금을 숨겨놓는 장소를 알려줄 비밀지도를 손에 넣었다. 그런데 이 비밀지도는 숫자로 암호화되어 있어 위치를 확인하기 위해서는 암호를 해독해야 한다. 
		다행히 지도 암호를 해독할 방법을 적어놓은 메모도 함께 발견했다.
		지도는 한 변의 길이가 n인 정사각형 배열 형태로, 각 칸은 "공백"(" ") 또는 "벽"("#") 두 종류로 이루어져 있다.
		전체 지도는 두 장의 지도를 겹쳐서 얻을 수 있다. 각각 "지도 1"과 "지도 2"라고 하자. 지도 1 또는 지도 2 중 어느 하나라도 벽인 부분은 전체 지도에서도 벽이다. 
		지도 1과 지도 2에서 모두 공백인 부분은 전체 지도에서도 공백이다.
		"지도 1"과 "지도 2"는 각각 정수 배열로 암호화되어 있다.
		암호화된 배열은 지도의 각 가로줄에서 벽 부분을 1, 공백 부분을 0으로 부호화했을 때 얻어지는 이진수에 해당하는 값의 배열이다.
		
		
		매개변수								값
		n									5
		arr1						[9, 20, 28, 18, 11]
		arr2						[30, 1, 21, 17, 28]

		출력				["#####","# # #", "### #", "# ##", "#####"]

		매개변수								값
		n									6
		arr1						[46, 33, 33 ,22, 31, 50]
		arr2						[27 ,56, 19, 14, 14, 10]
		출력				["######", "### #", "## ##", " #### ", " #####", "### # "]
		 
		 */
		
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		
		//n크기 배열을 하나 만들어서 거기에 2진수한 숫자들을 넣는다.
		String[] num1 = new String[n];
		String[] num2 = new String[n];
		
		//n자리 수만큼 2진법 수의 문자열로 만들고 그 문자열을 각각 num1, num2 배열에 저장하기
		for(int i=0; i<arr1.length; i++) {
			num1[i] = two(arr1[i], n);
			num2[i] = two(arr2[i], n);
			//System.out.println(num1[i]);
			//System.out.println(num2[i]);
		}
		
		String[] str = new String[n];
		
		//num의[i]번째의 문자열의 j번째 숫자가 하나라도 1이면 1로 바꾼다.
		for(int i=0; i<num1.length; i++) {
			str[i] = "";
			for(int j=0; j<num1[i].length(); j++) {
				if(num1[i].charAt(j) == '1' || num2[i].charAt(j) == '1') {
					str[i] += '#';
				}else {
					str[i] += ' ';
				}
			}
			//System.out.println(str[i]);
		}//for end
		
		
		/*나의 풀이방법*/
		/*
		 먼저 2진법을 한 수를 문자열로 반환하는 함수 two를 만들었다.
		 매개변수 n만큼의 자리수로 2진법 수를 만들어야 해서 매개변수는 변환해야할 10진법수와 주어진 매개변수n 두개를 사용했다.
		 ex. n = 5면 2진법한 수는 01101 등으로 나와야 함.
		 
		 two 함수에서 for문을 돌려 n번만큼 2를 나누어 나머지를 스택에 저장했다. (제일 마지막으로 나온 나머지가 첫번째 문자여야해서 선입선출의 스택을 써야겠다고 생각했다.)
		 stack에 저장한 숫자를 문자열로 변환해서 snum에 저장하여 반환했다.
		 
		 사실 num1, num2, str 배열 세개를 굳이 안만들어도 될텐데 내가 헷갈릴 것 같아서 어쩔 수 없이 3개의 배열을 만들었다.
		 그래서 arr1을 num1배열에, arr2를 num2배열에 각각 2진법변환해서 수를 저장했고 str엔 최종 답을 저장하려 했다.
		 
		 str[i]를 for문 시작할 때 초기화를 해주어야 나중에 str[i]앞에 null이 안붙는다. 주의주의!!!!
		 이중 for문 안에서 해당문자열의 길이만큼 조회하여 num1[i]의 j번째 문자가 1이거나 num2[i]의 j번째 문자가 1이면 (둘 중 하나라도 1이면 성립)
		 정답 배열인 str[i]에 #을 누적하고, 둘다 0이라면 공백을 누적하면 된다.
		 */
		
	}

}
