import java.util.ArrayList;

public class quickSort {
	
	static int steps = 0;
	static int comp = 0;
	static int switchS = 0;
	static ArrayList<Integer> quickS = new ArrayList<>();
	static ArrayList<Integer> quickComp = new ArrayList<>();
	static ArrayList<Integer> quickSwitchS = new ArrayList<>();

	@SuppressWarnings("static-access")
	void quickSortEx(int number) {
		testMain a = new testMain();
		int RandomArray[] = a.RandomArray.clone();
		quickSortX(RandomArray, 0, RandomArray.length-1);
	    steps = comp + switchS;
	    quickS.add(steps);
	    quickComp.add(comp);
	    quickSwitchS.add(switchS);
	    steps = 0;
		comp = 0;
		switchS = 0;
	}
	
	
	static void swap(int[] arr, int i, int j)
	{
	    int temp = arr[i];
	    switchS++;
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	 
	static int partition(int[] arr, int low, int high)
	{
	     
	    int pivot = arr[high];
	     
	    int i = (low - 1);
	 
	    for(int j = low; j <= high - 1; j++)
	    {
	    	comp++;
	         
	        if (arr[j] < pivot)
	        {
	        	
	            i++;
	            swap(arr, i, j);
	        }
	    }
	    swap(arr, i + 1, high);
	    return (i + 1);
	}
	 
	static void quickSortX(int[] arr, int low, int high)
	{
	    if (low < high)
	    {
	         
	        int pi = partition(arr, low, high);
	 
	        quickSortX(arr, low, pi - 1);
	        quickSortX(arr, pi + 1, high);
	    }
	    

	}
	
}
