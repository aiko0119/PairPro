import java.util.Scanner;

public class IntToEng {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(translateEng(input));
		
	}
	
	static String translateEng(int n) {
		
		String[] e= {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String[] e2 = {"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety","hundred"};
		String m = "";
		for(int i=0; i<e.length; i++) {
			if(n==i)
			m=e[i];	
				
		}
		
		
		return m;
	}
}
