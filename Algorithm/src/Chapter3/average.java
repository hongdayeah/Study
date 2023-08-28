package Chapter3;

import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		//p38. 평균 구하기
		/* 최대값 : M
		   모든 점수를 점수/M*100으로 고침
		   ex. M = 70
		   수학점수 = 50 --> 50/70*100 = 71.43점
		   시험 과목 개수 : N
		*/
		
		Scanner sc = new Scanner(System.in);
		//과목 개수 입력받기
		int N = sc.nextInt(); 
		//점수 배열의 크기를 N으로 초기화하기
		int[] score = new int[N];
		
		//score 배열에 점수 순서대로 입력하기
		for(int i=0; i<N; i++) {
			score[i] = sc.nextInt();
		}
		
		double sum = 0;
		double avg = 0;
		
		//최대값 찾고 합산하기
		int max = score[0];
		for(int i=0; i<N; i++) {
			if(max<score[i]) {
				max = score[i];
			}
			sum += score[i];
		}
		avg = sum/max*100/N;
		
		System.out.println(avg);
	}

}
