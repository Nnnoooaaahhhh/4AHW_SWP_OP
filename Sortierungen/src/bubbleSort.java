
import java.util.ArrayList;

public class bubbleSort {
	
	static int steps;
	static int comp;
	static int switchS;
	
	static ArrayList<Integer> bubS = new ArrayList<>();
	static ArrayList<Integer> bubComp = new ArrayList<>();
	static ArrayList<Integer> bubSwitchS = new ArrayList<>();
	
	@SuppressWarnings("static-access")
	void bubEx(int number) {
		testMain a = new testMain();
		a.rndArray(number);
		//bubSort(a.orderedArray);
		//bubSort(a.ReversedArray);
		bubSort(a.RandomArray);
		
	}
	
	void bubSort(int arr[]){
		int temp;
		steps = 0;
		comp = 0;
		switchS = 0;

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length-i-1; j++) {
				comp++;
				if(arr[j+1] < arr[j]) {
					switchS++;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		steps = comp + switchS;
		bubS.add(steps);
		bubComp.add(comp);
		bubSwitchS.add(switchS);
	}

}
