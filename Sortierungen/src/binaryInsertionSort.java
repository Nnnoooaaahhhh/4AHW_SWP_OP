
public class binaryInsertionSort {
	
	void binInEx(int number) {
		testMain binIn= new testMain();
		binIn.getArrays(number);
		binaryInsertionSortx(binIn.orderedArray);
		binaryInsertionSortx(binIn.ReversedArray);
		binaryInsertionSortx(binIn.RandomArray);
	}

	public void binaryInsertionSortx(int arr[]) {
		long start;
		long end;

		start = System.nanoTime();
	    for (int i = 1; i < arr.length; i++) {
	        int key = arr[i];
	        int insertedPosition = binaerSuche(key, arr, i);
	        for (int j = i - 1; j >= insertedPosition; j--) {
	        	arr[j + 1] = arr[j];
	        }
	        arr[insertedPosition] = key;
	    }
        end = System.nanoTime();
        System.out.println("Time: " + (end-start) + " Nanoseconds");
	}
	
	int binaerSuche(int number, int rnd[], int rightx) {
		int lowest = rnd[0];
		int middle;
		int right = rightx;
		for(int i = 0; i < rnd.length; i++) {
			if(lowest>right) {
			}
			middle = (int) (lowest+right)/2;
			if(rnd[middle]<number) {
				lowest = middle + 1;
			}
			if(rnd[middle]>number) {
				right = middle - 1;
			}
			if(rnd[middle]==number) {
				return middle;
			}
		}
		return 0;
	}
}
