package programmers;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long n = 118372;
		
		String snum = String.valueOf(n);
		char[] cnum = snum.toCharArray();
		
		int[] inum = new int[cnum.length];
		
		for(int i=0; i<inum.length; i++) {
			inum[i] = cnum[i] - '0';
		}
		
		int tmp = 0;
		for(int i=0; i<inum.length-1; i++) {
			for(int j=i+1; j<inum.length; j++) {
				if(inum[i]<inum[j]) {
					tmp = inum[i];
					inum[i] = inum[j];
					inum[j] = tmp;
				}
			}	
		}
		String snum2 = "";
		for(int i=0; i<inum.length; i++) {
			snum2 += inum[i];	
		}
		
		long answer = Long.parseLong(snum2);
		
		System.out.println(answer);
	}

}
