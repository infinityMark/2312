import java.util.*;

public class Main {

    public static String header(int WIDTH, char left, char right){
        String header = String.valueOf(left);
        header += "-".repeat(WIDTH * 6 + 1);
        header += String.valueOf(right);
        return header;
    }

    public static String leftColumn(int element) {
        return String.format("|    %d|", element);
    }

    public static void display(int[][] matrix, int WIDTH, int HEIGHT){
        System.out.println(header(WIDTH, '/', '\\'));
        for(int y = 0 ; y < HEIGHT; y++)
		{
			for(int x = 0 ; x < WIDTH ; x++) {
                if (x == 0) {
                    System.out.print(leftColumn(matrix[y][x]));
                    continue;
                }
                System.out.printf("%6d", matrix[y][x]); //width = 5, right aligned, decimal
            }
            System.out.printf(" |\n");
            if (y == 0) 
                System.out.println(header(WIDTH, '|', '|'));
		}
        System.out.println(header(WIDTH, '\\', '/'));
    }

	public static void main(String[] args) {
		
		
		int WIDTH, HEIGHT;
		int x, y;
        Scanner input = new Scanner(System.in);
		
		System.out.print("Input the width of the multiplication table (2-10): ");
		WIDTH = input.nextInt();
		System.out.print("Input the height of the multiplication table (2-10): ");
		HEIGHT = input.nextInt();

        int[][] values = new int[HEIGHT][WIDTH];
		for(y = 1 ; y <= HEIGHT; y++)
			for(x = 1 ; x <= WIDTH; x++)
				values[y-1][x-1] = y*x;

        System.out.println();
        display(values, WIDTH, HEIGHT);
        input.close();
	}
}

