import java.util.ArrayList;
import java.util.Random;

public class testMain {
	
	
	int orderedArray[];
	int ReversedArray[];
	static int RandomArray[];
	int tempArray[];
	static int testArray[];
	public static void main(String[] args) {
		testMain a = new testMain();
		a.testEx(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
	}
	
	
	void rndArray(int number) {
		RandomArray = null;
		RandomArray = new int[number];
		Random rnd = new Random();
		for(int i = 0; i < number; i++) {
			RandomArray[i] = rnd.nextInt();		
		}
		
	}
	
	float getMedian(ArrayList <Integer> arrL) {
		if(arrL.size()%2!=0) {
			return arrL.get(arrL.size()/2);
		} 
		else {
			int a = arrL.get(arrL.size()/2);
			int b = arrL.get(arrL.size()/2+1);
			return (a+b)/2;
		}
		
	}
	
	float getAvg(ArrayList <Integer> arrL) {
		int  sum = 0;
		for(int i = 0; i < arrL.size(); i++) {
			sum = sum + arrL.get(i);
		}
		return sum/arrL.size();
	}
	
	@SuppressWarnings("static-access")
	void testEx(int number, int length) {
		testMain a = new testMain();
		long start;
		long end;
		long bub = 0;
		long sel = 0;
		long staSel = 0;
		long ins = 0;
		long quick = 0;
		
		

		stableSelectionSort f = new stableSelectionSort();
		bubbleSort b = new bubbleSort();
		selectionSort e = new selectionSort();
		insertionSort c = new insertionSort();
		quickSort q = new quickSort();
		
		for(int i = 0; i < length; i++) {
			a.rndArray(number);
			
			start = System.nanoTime();
			b.bubEx(number);
			end = System.nanoTime();
			bub = bub + (start-end);
			
			
			start = System.nanoTime();
			c.insertEx(number);
			end = System.nanoTime();
			ins = ins + (start-end);
			
			start = System.nanoTime();
			e.selSortEx(number);
			end = System.nanoTime();
			sel = sel + (start-end);
			
			
			start = System.nanoTime();
			f.selSortStableEx(number);
			end = System.nanoTime();
			staSel = staSel + (start-end);
			
			start = System.nanoTime();
			q.quickSortEx(number);
			end = System.nanoTime();
			quick = quick + (start-end);
		}
		
		
		b.bubS.sort(null);
		b.bubComp.sort(null);
		b.bubSwitchS.sort(null);
		e.selS.sort(null);
		e.selComp.sort(null);
		e.selSwitchS.sort(null);
		f.staSelS.sort(null);
		f.staSelComp.sort(null);
		f.staSelSwitchS.sort(null);
		c.insS.sort(null);
		c.insComp.sort(null);
		c.insSwitchS.sort(null);
		q.quickS.sort(null);
		q.quickComp.sort(null);
		q.quickSwitchS.sort(null);


		
		
		
		System.out.println("Bubblesort average: " + Math.abs(bub/length/1000000) + " Milliseconds in average");
		System.out.println("Average All-Steps " + Math.abs(a.getAvg(b.bubS)) + " Median: " + Math.abs(a.getMedian(b.bubS)));
		System.out.println("Average Comparison Steps: " + Math.abs(a.getAvg(b.bubComp)) + " Median: " + Math.abs(a.getMedian(b.bubComp)));
		System.out.println("Average Switch Steps: " + Math.abs(a.getAvg(b.bubSwitchS)) + " Median: " + Math.abs(a.getMedian(b.bubSwitchS)));
		System.out.println();
		
		System.out.println("Selectionsort average: " + Math.abs(sel/length/1000000) + " Milliseconds in average");
		System.out.println("Average All-Steps " + Math.abs(a.getAvg(e.selS)) + " Median: " + Math.abs(a.getMedian(e.selS)));
		System.out.println("Average Comparison Steps: " + Math.abs(a.getAvg(e.selComp)) + " Median: " + Math.abs(a.getMedian(e.selComp)));
		System.out.println("Average Switch Steps: " + Math.abs(a.getAvg(e.selSwitchS)) + " Median: " + Math.abs(a.getMedian(e.selSwitchS)));
		System.out.println();
		
		System.out.println("Stableselectionsort average: " + Math.abs(staSel/length/1000000) + " Milliseconds in average");
		System.out.println("Average All-Steps " + Math.abs(a.getAvg(f.staSelS)) + " Median: " + Math.abs(a.getMedian(f.staSelS)));
		System.out.println("Average Comparison Steps: " + Math.abs(a.getAvg(f.staSelComp)) + " Median: " + Math.abs(a.getMedian(f.staSelComp)));
		System.out.println("Average Switch Steps: " + Math.abs(a.getAvg(f.staSelSwitchS)) + " Median: " + Math.abs(a.getMedian(f.staSelSwitchS)));
		System.out.println();
		
		System.out.println("Insertionsort average: " + Math.abs(ins/length/1000000) + " Milliseconds in average");
		System.out.println("Average All-Steps " + Math.abs(a.getAvg(c.insS)) + " Median: " + Math.abs(a.getMedian(c.insS)));
		System.out.println("Average Comparison Steps: " + Math.abs(a.getAvg(c.insComp)) + " Median: " + Math.abs(a.getMedian(c.insComp)));
		System.out.println("Average Switch Steps: " + Math.abs(a.getAvg(c.insSwitchS)) + " Median: " + Math.abs(a.getMedian(c.insSwitchS)));
		System.out.println();
		
		System.out.println("Quicksort average: " + Math.abs(quick/length/1000000) + " Milliseconds in average");
		System.out.println("Average All-Steps " + Math.abs(a.getAvg(q.quickS)) + " Median: " + Math.abs(a.getMedian(q.quickS)));
		System.out.println("Average Comparison Steps: " + Math.abs(a.getAvg(q.quickComp)) + " Median: " + Math.abs(a.getMedian(q.quickComp)));
		System.out.println("Average Switch Steps: " + Math.abs(a.getAvg(q.quickSwitchS)) + " Median: " + Math.abs(a.getMedian(q.quickSwitchS)));
		System.out.println();

	}
}
