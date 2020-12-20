

public class bubbleSort {
	
	void bubEx(int number) {
		testMain a = new testMain();
		a.getArrays(number);
		bubSort(a.orderedArray);
		bubSort(a.ReversedArray);
		bubSort(a.RandomArray);
	}
	
	void bubSort(int arr[]){
		long start;
		long end;
		int temp;

		start = System.nanoTime();
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length-i-1; j++) {
				if(arr[j+1] < arr[j]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		end = System.nanoTime();
		System.out.println("Time: " + (end-start) + " Nanoseconds");
	}

}
