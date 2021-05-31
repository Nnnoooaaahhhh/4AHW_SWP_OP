import java.util.ArrayList;

public class selectionSort {
	
	static int steps;
	static int comp;
	static int switchS;
	static ArrayList<Integer> selS = new ArrayList<>();
	static ArrayList<Integer> selComp = new ArrayList<>();
	static ArrayList<Integer> selSwitchS = new ArrayList<>();
	
	
	@SuppressWarnings("static-access")
	void selSortEx(int number) {
		testMain a = new testMain();
		int RandomArray[] = a.RandomArray.clone();
		sort(RandomArray);
	}
	

	 void sort(int arr[]) 
	    { 
		 
	        int n = arr.length; 
	    	steps = 0;
			comp = 0;
			switchS = 0;
	  
	       
	        for (int i = 0; i < n-1; i++) 
	        { 
	            
	            int min_idx = i; 
	            for (int j = i+1; j < n; j++) { 
	                if (arr[j] < arr[min_idx]) {
	                    min_idx = j; 
	                    switchS++;
	                    }
	                
	                comp++;
	            }
	           
	            int temp = arr[min_idx]; 
	            arr[min_idx] = arr[i]; 
	            arr[i] = temp; 
	            
	            
	        } 
	        steps = comp + switchS;
	        selS.add(steps);
	        selComp.add(comp);
	        selSwitchS.add(switchS);
			
	    } 
	
}
