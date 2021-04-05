import java.util.ArrayList;

public class insertionSort {
	
	static int steps;
	static int comp;
	static int switchS;
	static ArrayList<Integer> insS = new ArrayList<>();
	static ArrayList<Integer> insComp = new ArrayList<>();
	static ArrayList<Integer> insSwitchS = new ArrayList<>();
	
	@SuppressWarnings("static-access")
	void insertEx(int number) {
		testMain in = new testMain();
		in.rndArray(number);
		//sort(in.orderedArray);
		//sort(in.ReversedArray);
		sort(in.RandomArray);
	}

	void sort(int arr[]) {
		int key;
		int j;
		steps = 0;
		comp = 0;
		switchS = 0;
		
		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] > key) {
				switchS++;
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			comp++;
			arr[j + 1] = key;
		}
		steps = comp + switchS;
		insS.add(steps);
		insComp.add(comp);
		insSwitchS.add(switchS);
	}
}
