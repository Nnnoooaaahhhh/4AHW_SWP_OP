import java.util.ArrayList;

public class stableSelectionSort {
	
	static int steps;
	static int comp;
	static int switchS;
	static ArrayList<Integer> staSelS = new ArrayList<>();
	static ArrayList<Integer> staSelComp = new ArrayList<>();
	static ArrayList<Integer> staSelSwitchS = new ArrayList<>();
	
	@SuppressWarnings("static-access")
	void selSortStableEx(int number) {
		testMain selSta = new testMain();
		selSta.rndArray(number);
		//sort(selSta.orderedArray);
		//sort(selSta.ReversedArray);
		sort(selSta.RandomArray);
	}
	

	void sort(int[] a) 
    { 
		steps = 0;
		comp = 0;
		switchS = 0;
		int n = a.length;
        for (int i = 0; i < n - 1; i++)  
        { 
            int min = i; 
            for (int j = i + 1; j < n; j++) {
            	comp++;
                if (a[min] > a[j]) {
                    min = j; 
                    }
            }
            int key = a[min]; 
            while (min > i)  
            { 
            	switchS++;
                a[min] = a[min - 1]; 
                min--; 
            } 
            a[i] = key; 
        }
        
        steps = comp + switchS;
        staSelS.add(steps);
        staSelComp.add(comp);
        staSelSwitchS.add(switchS);
        
    }
}
