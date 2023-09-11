package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Q27 {

	public static void main(String[] args) {
		// 배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 
		// 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 
		// 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,
		// arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
		// arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
		// 배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.
		
		/*
		 arr			answer
		[1,1,3,3,0,1,1]	[1,3,0,1]
		[4,4,4,3,3]		[4,3]
		 
		 */
		
		int[] arr = {1, 1, 3, 3, 0, 1, 1};
		
		//스택을 사용해서 풀기 위해 구글에서 자바 스택 구현 방법을 검색하고 스택의 메소드들을 학습한 후 문제를 풀었다.
		
		Stack<Integer> stack = new Stack<>(); //int타입의 Stack 선언
		
		for(int i=0; i<arr.length; i++) { //arr배열 끝까지 조회
			if((stack.size() == 0) || (arr[i] != stack.peek())) { //스택의 현재 사이즈가 0이면 아무 값도 없기 때문에 arr[i] 값을 스택에 넣을 수 있고 || arr[i]값이 스택의 마지막값을 조회했을 때 같지 않으면 스택에 들어갈 수 있다.
				stack.push(arr[i]); //push
			}//if end
		}//for end
		
		//스택에 있는 값 꺼내서 int[] 배열에 넣기.
		//스택은 마지막 값부터 순서대로 꺼낼 수 있기 때문에 거꾸로 반복문을 구현해야 한다.
		int[] ans = new int [stack.size()]; //최종 배열은 스택 사이즈의 크기로 할당한다.
		for(int i=ans.length-1; i>=0; i--) {
			ans[i] = stack.pop();
		}//for end
		
		System.out.println(Arrays.toString(ans));
	}

}
