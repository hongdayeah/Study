package programmers;

public class Q12 {

	public static void main(String[] args) {
		//array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
		//divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
		
		int[] arr = {2,36,1,3};
		int divisor = 1;
		int n = 0; //arr배열 내에서 divisor로 나뉘는 수의 개수
		int[] answer;
		
		//answer배열의 크기 결정
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%divisor == 0) { //arr[i]가 divisor로 나누어 떨어지는 값일 때
				n++; // answer배열의 크기를 결정
			}
		}
		
		if(n==0) { //arr배열에서 divisor로 나누어떨어지는 수가 없으면 n은 초기값 0 그대로이다.
			answer = new int[1];
			answer[0] = -1;
		}else {
			answer = new int[n];
			int i=0;
			int j=0;
			while(i<n) {
				if(arr[j]%divisor == 0) {
					answer[i] = arr[j];
					j++;
					i++;
				}else {
					j++;
				}
			}
			
			int temp = 0;
			for(int x=0; x<n-1; x++) {
				for(int y=x+1; y<n; y++) {
					if(answer[x] > answer[y]) {
						temp = answer[x];
						answer[x] = answer[y];
						answer[y] = temp;
					}
				}
			}
		}
		
		System.out.println(answer[0]);
	}//main end

}
