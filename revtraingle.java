
public class revtraingle {

	public static void main(String[] args) {
		int row=0;
		int col=4;
		while(row<=5) {
			
			
			int dash =0;
			while(dash<=col) {
				System.out.print("   ");//doubt why pattern changes when we play with spaces ???????!!!!
				dash++;
			}
			col--;
			int star=1;
			while(star<=row) {
			System.out.print("  *");
			star++;
			}
			System.out.println();
			row++;
		
			
	}

}}