import java.util.Scanner;
public class Star2 {

	public static void main(String[] args) {
		System.out.print("Input number of pattern rows ");
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();		
		int row =1;
		int dash=n-1;
		while(row<=n) {
			int star =1;
			while(star<=row) {
					System.out.print(" *");
					
					     
					star++;}
			int x=1;
			 
					 while(x<=dash) {
						
						  System.out.print(" -");
					     	  x++;

								 }
					 dash--;
						row++;
						System.out.print("\n");
			}
				
		
		}
		
		}
