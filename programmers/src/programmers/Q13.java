package programmers;

public class Q13 {

	public static void main(String[] args) {
		// 어떤 정수들이 있습니다. 이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와 이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다. 
		// 실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.
		
		/*
		 absolutes	     signs			  result
		[4,7,12]	[true,false,true]		9
		[1,2,3]		[false,false,true]		0
		  
		 */
		
		int[] absolutes = {4, 7, 12};
		boolean[] signs = {true, false, true};
		//signs[i]가 false면 absoultes[i]는 음수
		int sum = 0; //누적 합 시킬 변수
		
		for(int i=0; i<absolutes.length; i++) {
			if(signs[i] == true) { //양수로 더해야 할 때
				sum += absolutes[i]; //그냥 더하고
			}else { //음수면
				sum -= absolutes[i]; //그만큼 빼주어야 한다
			}
		}//for() end
		
		System.out.println(sum);



	}

}
