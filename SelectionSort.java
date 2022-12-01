public class SelectionSort 
{
	private int temp;
	/** Creates a new instance of SelectionSort */
	public SelectionSort() 
	{
		
	}
	
	/* A simple SelectionSort algorithm
	 * pre-condition: items are completely unsorted
	 * post-condition: items are completely sorted
	 * inputs: int array of size n (unsorted)
	 * outputs: int array of size n (sorted)
	 * special conditions: none
	 */
	public int[] basicSelectionSort(int[] x) 
	{
		for (int i = 0; i <= x.length-1; ++i) 
		{
			for (int j= i+1; j <= x.length-1; ++j) 
			{
				if (x[i] > x[j]) 
				{
					temp = x[i];
					x[i] = x[j];
					temp = x[j];
				}
			} // end of inner for loop
		} // end of outer for loop
		
		return x;
	} // end of basicSelectionSort method
}