
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
	        int insertedPosition = findPosition(arr, 0, i - 1, key);
	        for (int j = i - 1; j >= insertedPosition; j--) {
	        	arr[j + 1] = arr[j];
	        }
	        arr[insertedPosition] = key;
	    }
        end = System.nanoTime();
        System.out.println("Time: " + (end-start) + " Nanoseconds");
	}

	public int findPosition(int[] arr, int start, int end, int key) {
	    while (start <= end) {
	        int mid = start + (end - start) / 2;

	        if (key < arr[mid]) {
	            end = mid - 1;
	        } else {
	            start = mid + 1;
	        }
	    }
	    return start;
	}
}
