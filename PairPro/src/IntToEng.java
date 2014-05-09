import java.util.Scanner;

public class IntToEng {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(translateEng(input));
		
	}
	
	static String translateEng(int n) {
		
		String[] e= {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String[] e2 = {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety","hundred"};
		String m = "";
		String l="";
		String o="";
		if(n<=10){
			for(int i=0; i<e.length; i++) {
				if(n==i)
					m=e[i];	
				}
		}
		if(n==20||n==30||n==40||n==50||n==60||n==70||n==80||n==90||n==100) {
			for(int i=0; i<e2.length; i++) {
				if(n/10==i)
					m=e2[i];	
				}
		}
		
		else{
			int j,k;
			j = n/10;
			k = n%10;
			for(int i=0; i<e.length; i++) {
				if(k==i)
					l=e[i];	
				}
			for(int i=0; i<e2.length; i++) {
				if(j==i)
					o=e2[i];	
				}
			
			m=o+l;
		}
		
		return m;
	}
}
