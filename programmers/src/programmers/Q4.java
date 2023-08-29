package programmers;

public class Q4 {

	public static void main(String[] args) {
		// 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
		String answer = "";
		int num = 10;
        
        if(num%2==0){
            answer = "Even";
        }else{
            answer = "Odd";
        }
        System.out.println(answer);
	}

}
