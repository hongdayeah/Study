package programmers;

import java.util.Arrays;

public class Q30 {

	public static void main(String[] args) {
		// S사에서는 각 부서에 필요한 물품을 지원해 주기 위해 부서별로 물품을 구매하는데 필요한 금액을 조사했습니다. 그러나, 전체 예산이 정해져 있기 때문에 모든 부서의 물품을 구매해 줄 수는 없습니다. 
		// 그래서 최대한 많은 부서의 물품을 구매해 줄 수 있도록 하려고 합니다.
		// 물품을 구매해 줄 때는 각 부서가 신청한 금액만큼을 모두 지원해 줘야 합니다. 예를 들어 1,000원을 신청한 부서에는 정확히 1,000원을 지원해야 하며, 1,000원보다 적은 금액을 지원해 줄 수는 없습니다.
		// 부서별로 신청한 금액이 들어있는 배열 d와 예산 budget이 매개변수로 주어질 때, 최대 몇 개의 부서에 물품을 지원할 수 있는지 return 하도록 solution 함수를 완성해주세요.
		
		/*
		 	d			budget	result
		[1,3,2,5,4]		  9		  3
		[2,2,3,3]		  10	  4 
		 
		 */
				
		int[] d = {1, 3, 2, 5, 4};
		int budget = 9;
		int total = 0; //지원해 줄수 있는 부서의 최대 수를 저장할 변수
		
		/*
		int i = 0; //d를 조회할 변수
		while(budget>=d[i]) {//d[i]보다 작아지면 탈출 
			budget = budget - d[i];
			total++;
			i++;
			if(i==d.length) {
				break;
			}
		}//while end
		*/
		
		//정렬을 하지 않고 그냥 원래의 배열 순서대로 budget을 할당했더니 테스트케이스가 절반정도 통과하지 않았다.
		//도저히 이유를 모르겠어서 다른 사람의 풀이를 봤는데 (코드말고) 지원을 해줄 수 있는 부서의 개수가 정렬을 하고 안하고의 차이가 있다고 한다.
		//Arrays.sort를 검색하고 다시 풀어보았다.
		Arrays.sort(d);
		int i = 0; //d를 조회할 변수
		while(budget>=d[i]) {//d[i]보다 작아지면 탈출 
			budget = budget - d[i];
			total++;
			i++;
			if(i==d.length) {
				break;
			}
		}//while end
		
		
		System.out.println(total);		
		
	}

}
