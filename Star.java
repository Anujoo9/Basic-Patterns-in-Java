import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		
		System.out.print("Input number of pattern rows ");
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		
		int i = 0;
		while(i<=n) {
			int j=0;
			while(j<=i) {
			             System.out.print("*");
			            
			            j++;
			            }
			System.out.print("\n");
	    	i++;
		}
	}

}
