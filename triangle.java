
public class triangle {

	public static void main(String[] args) {
		int row=0;
		int col=5;
		while(row<6) {
			
			int star=0;
			while (star<=col) {
				System.out.print(" * ");
				star++;
			}
			col--;
				row++;
				System.out.println();
		}

	}

}
