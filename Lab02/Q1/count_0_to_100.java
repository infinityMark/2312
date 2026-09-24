public static void count_0_to_100(int[][] A)
{
	int count = 0;
		
	for(int y = 0; y < HEIGHT; y++)
	{
		for (int x = 0; x < WIDTH; x++)
			if(0 <= A[y][x] <= 100)		
	            count++;	 
	}
		
    System.out.print("The count is: " count);
}