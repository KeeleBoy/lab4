package lab4;

/*
 * @Author Kyle Warchuck
 */


import java.util.Scanner;

public class squaresAndCubes {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		boolean goAgain = true;
		
		while (goAgain) {
			
			
			int input1 = 0;
			int cubed1;
			int squared1;
			
			System.out.println("Please enter an intiger: ");
			input1 = scnr.nextInt();
			
			System.out.printf("%-10s %-10s %-10s", "Number", "squared", "cubed");
			System.out.println("");
			System.out.printf("%-10s %-9s %-10s", "======", "======", "======");
			System.out.println("");
			
			for (int i = 1; i <= input1; i++) {
			
			squared1 = (i * i);
			cubed1 = (i * i * i);
			
			System.out.printf("%-10d %-10d %-10d", i, squared1, cubed1);
			System.out.println("");
			
			}
			System.out.println("Would you like to continue? (y/n)");
			goAgain = scnr.next().toLowerCase().startsWith("y");

			
		}
		
		/*
		 * 
		//bonus thing
		System.out.printf("%5s %5s %5s %5s %5s %5s", " ","1","1","2","3","4");
		System.out.println();
		System.out.printf("%5s %5s %5s %5s %5s %5s", " ","=","=","=","=","=");
		System.out.println();
		System.out.printf("%5s %5s %5s %5s %5s %5s", "1","|","1","2","3","4");
		System.out.println();
		System.out.printf("%5s %5s %5s %5s %5s %5s", "2","|","2","4","6","8");
		System.out.println();
		System.out.printf("%5s %5s %5s %5s %5s %5s", "3","|","3","6","9","12");
		System.out.println();
		System.out.printf("%5s %5s %5s %5s %5s %5s", "4","|","4","8","12","16");
		

		*/
		
		scnr.close();

	}

}
