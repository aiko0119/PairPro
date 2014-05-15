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
		String[] e3 = {"","hundred","two hundreds","three hundreds","four hundreds","five hundreds"};
		String m = "";
		String l="";
		String o="";
		String z="";
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
		
		if(n<100){
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
		
		if(n==200||n==300||n==400||n==500)	{
			for(int i=0; i<e3.length; i++) {
				if(n/100==i)
					m=e3[i];	
		}
		
		
	}
		else {
			int j,k,y,k2;
			j = n/100;
			k2 = n%100;
			k = k2/10;
			y = k2%10;
			
			for(int i=0; i<e.length; i++) {
				if(y==i)
					l=e[i];	
				}
			for(int i=0; i<e2.length; i++) {
				if(k==i)
					o=e2[i];	
				}
			for(int i=0; i<e3.length; i++) {
				if(j==i)
					z=e3[i];
					
			}
			m=z+o+l;
			
		}
		return m;
	}
}
