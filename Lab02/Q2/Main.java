import java.util.*;

public class Main {

    public static void display(int[][] matrix, int WIDTH, int HEIGHT){
        for(int y = 0 ; y < HEIGHT; y++)
		{
            System.out.println();
			for(int x = 0 ; x < WIDTH ; x++) {
                System.out.printf("%5d|", matrix[y][x]); //width = 5, right aligned, decimal
            }
		}
    }

	public static void main(String[] args) {
		
		
		int WIDTH, HEIGHT;
		int x, y;
        Scanner input = new Scanner(System.in);
		
		System.out.print("Input the width of the multiplication table (2-10): ");
		WIDTH = input.nextInt();
		System.out.print("Input the height of the multiplication table (2-10): ");
		HEIGHT = input.nextInt();

		/* Notes to students:
			1.  We need a Scanner object to get user input (like Lab01-Q1 in Lab01.pdf Page 3):
			- Add the import statement at the beginning: import java.util.*;
			- Declare a scanner object: Scanner [object variable name];
			- Create a scanner object as: new Scanner(System.in);
			- To read an integer, we call the .nextInt() method: [scanner object].nextInt();
			- Close the scanner object: [scanner object].close();

	 		2.  Learn from Q1: System.out.printf("%5d", x); // Show x, "%" means a field,
								// right aligned, width=5, 
								// d means decimal 
		*/ 

        int[][] values = new int[HEIGHT][WIDTH];
		for(y = 1 ; y <= HEIGHT; y++)
			for(x = 1 ; x <= WIDTH; x++)
				values[y-1][x-1] = y*x;

        display(values, WIDTH, HEIGHT);
        input.close();
	}
}

