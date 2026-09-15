import java.io.*; //For file I/O
import java.util.*;

public class Table2dMxSumRowCol 
{

	//(1) Add the instance field, nums, for the 2D array here
	// (Answer is in Given_Code.txt!!)
	private int[][] nums;
	
	//Constructor
	public Table2dMxSumRowCol(String filepathname) throws FileNotFoundException //learn exceptions later
	{
		//Part I. Create the 2D array
		// (2) nums = ____________ 
		// (Answer is in Given_Code.txt!!)
		nums = new int[10][10]; 
		
		//Part II. Perform file reading and insert values into the 2D array
		Scanner inFile;
		inFile = new Scanner(new File(filepathname)); //(3) construct the scanner object for file reading
		while (inFile.hasNext()) //replace the blank with: inFile.hasNext()
		{
			int row, col, value;
			row = inFile.nextInt();
			col = inFile.nextInt();
			value = inFile.nextInt();
			nums[row][col] = value; //Note: should be [row][col], do not change the order
		}
		inFile.close();
	}
	
	//
	//Other methods 
	//  (See Given_Code.txt!!)
	//
	public void print() {

		/* For each row, we print the columns in that row.

		   Note: row and column are easily mixed up.
			To avoid careless mistake, readability is important.
			Use meaningful variable names like row,col or r,c, or y,x etc. 
			Do not use i,j. 
		*/

		for (int row=0; row<10; row++) 
		{
			for (int col=0; col<10; col++)
			{
				System.out.print("\t"+nums[row][col]); //separated by tabs
			}
			System.out.println();
		}
	}

	public String converter(int max, ArrayList<Integer> arrayList, string title){
		String combine = "";
		int size = arrayList.size();
		if (size == 1){
			return String.format("%s (%s ");
		}
		for (int i = 0; i < arrayList.size(); i++) {
			
		}
		// return ;
	}

	public int getRowSumMax(){
		//Your task: implement this method
		int result = 0, temp;
		ArrayList<Integer> rows = new ArrayList<>();
		for (int row=0; row<10; row++) 
		{
			temp = 0;
			for (int col=0; col<10; col++)
			{
				temp = temp + nums[row][col];
			}
			if (result < temp){
				rows.clear();
				result = temp;
				rows.add(row);
			} else if (result == temp) {
				rows.add(row);
			}
		}
		return result; //This is temporary!!  You may finish this method in next step.
	}

	public int getColSumMax(){
		//Your task: implement this method
		int result = 0, temp;
		ArrayList<Integer> columns = new ArrayList<>();
		for (int row=0; row<10; row++) 
		{
			temp = 0;
			for (int col=0; col<10; col++)
			{
				temp = temp + nums[col][row];
			}
			if (result < temp){
				columns.clear();
				result = temp;
				columns.add(row);
			} else if (result == temp) {
				columns.add(row);
			}
		}
		return result; //This is temporary!!  You may finish this method in next step.
	}
}
