package programmers;

import java.util.Scanner;

public class Q25 {

	public static void main(String[] args) {
		//이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
		// 별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.
		
		/*
		 예시
		 입력

		 5 3
		 출력

		 *****
		 *****
		 *****
		 
		 */
		
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); //가로의 길이 n이 될 변수
		int b = sc.nextInt(); //세로의 길이 m이 될 변수
		
		for(int i=0; i<b; i++) { //세로 줄 
			for(int j=0; j<a; j++) { //가로 줄 
				System.out.print("*");
			}//for end
			System.out.println();
		}//for end

	}

}
