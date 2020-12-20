
public class insertionSort {
	
	void insertEx(int number) {
		testMain in = new testMain();
		in.getArrays(number);
		sort(in.orderedArray);
		sort(in.ReversedArray);
		sort(in.RandomArray);
	}

	void sort(int arr[]) {
		long start;
		long end;
		int key;
		int j;
		start = System.nanoTime();
		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		end = System.nanoTime();
		System.out.println("Time: " + (end-start) + " Nanoseconds");
	}
}
