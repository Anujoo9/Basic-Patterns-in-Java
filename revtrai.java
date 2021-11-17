
public class revtrai {

	public static void main(String[] args) {
		int row=0;
		int star =4;
	
		while (row<=4){
			int dash = 0;
			
			while (dash<=row) {
			System.out.print("     ");
			dash++;}
			
			
			int x=0;
			while(x<=star) {
				System.out.print("   *");
				x++;}
			star--;
			row++;
			System.out.println();
			
		}
		}

	}


