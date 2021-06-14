import java.util.ArrayList;

public class mergeSort {
	
	static int steps = 0;
	static int comp = 0;
	static int switchS = 0;
	static ArrayList<Integer> mergeS = new ArrayList<>();
	static ArrayList<Integer> mergeComp = new ArrayList<>();
	static ArrayList<Integer> mergeSwitchS = new ArrayList<>();

	void mergeSortEx(int number) {
		testMain a = new testMain();
		int RandomArray[] = a.RandomArray.clone();
		sort(RandomArray, 0, RandomArray.length - 1);
	    steps = comp + switchS;
	    mergeS.add(steps);
	    mergeComp.add(comp);
	    mergeSwitchS.add(switchS);
	    steps = 0;
		comp = 0;
		switchS = 0;
	}
	
    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
        	comp++;
            if (L[i] <= R[j]) {
            	switchS++;
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                switchS++;
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;
 
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
	
}
