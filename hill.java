
public class hill {

	public static void main(String[] args) {
			int row=0;
			int dash=5;
			while(row<=5) {
			
			int dash2=1;
			 while(dash2<=dash) {
				System.out.print("  ");
				dash2++;}
			
			int star=0;
			while(star<=row) {
				System.out.print(" *");
				star++;
			}
			int star2=0;
			while(star2<=row-1) {
				System.out.print(" *");
				star2++;
			}	
			row++;
			dash--;
			System.out.println();
	}	
			}  	}
