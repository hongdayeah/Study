package programmers;

public class Q16 {

	public static void main(String[] args) {
		// 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 
		// 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
		
		/*
		 	arr		return
		[4,3,2,1]	[4,3,2]
		[10]		[-1]
		 
		 */
		
		int[] arr = {4, 3, 2, 1};
		int num = arr.length-1;
		int[] ans = {};
		int min = arr[0]; //arr배열에서의 첫번째 값을 min에 저장
		
		if(num < 1) { //입력받은 배열의 크기가 1이면 -1한 크기는 0이 되어버리므로 배열 크기가 1인 새로운 배열에 -1을 리턴해야 한다.
			ans = new int[1];
			ans[0] = -1;
		}else {
			ans = new int[num];
			for(int i=1; i<arr.length; i++) { //배열을 순회해서 가장 작은 값을 찾아 새로운 배열에선 빼버릴 계획
				//min을 arr[0]으로 저장해두었으니 두번째 수부터 비교해도 된다
				if(min > arr[i]) {
					min = arr[i]; //min보다 작으면 그 수를 min에 대입
				}
			}//for end
		}//if end
		
		int i = 0; //ans배열을 순회할 변수
		int j = 0; //arr배열을 순회할 변수
		
		while(i<num) { //i가 num까지만 무한반복
			if(arr[j] != min) { //arr[j]가 최소값이 아니면
				ans[i] = arr[j]; //ans[i]에 arr[j] 대입
				i++; //다음 순회
				j++; //다음 순회
			}else {
				j++; //최소값이면 ans배열에 저장하면 안되니까 arr배열의 다음 값 순회하고 ans는 그대로
			}
		}//while end
		
	}
}
