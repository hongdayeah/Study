package programmers;

public class Q26 {
	
	public static int Euc(int a, int b) {
		if(b == 0) { //a%b의 나머지가 0이면 나누어 떨어지는 수이기 때문에 a가 최대공약수이다.
			return a;
		}
		
		return Euc(b, a%b); //재귀함수
		
	}//Euc() end
	public static void main(String[] args) {
		// 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 
		// 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 
		// 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
		
		/*
		 n	m	return
		3	12	[3, 12]
		2	5	[1, 10] 
		  
		 */
		
		
		int n = 3;
		int m = 12;
		
		int gcd = Euc(n,m); //최대공약수
		int lcm = n * m / gcd; //최소공배수
		int[] ans = {gcd, lcm}; //ans[0] : 최대공약수, ans[1] : 최소공배수
		
		System.out.println(ans[0]);
		System.out.println(ans[1]);
		
	}

}
