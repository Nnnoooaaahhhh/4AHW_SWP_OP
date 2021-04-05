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
	
	/*void getArrays(int number) {
		orderedArray = new int[number];
		ReversedArray = new int[number];
		RandomArray = new int[number];
		tempArray = new int[number];
		Random rnd = new Random(number);
		
		for(int i = 0; i < orderedArray.length; i++) {
			orderedArray[i] = i;
			tempArray[i] = i;
		}
		
		int index;
		int temp;
		for(int i = 0; i < RandomArray.length; i++) {
			index = rnd.nextInt(tempArray.length-i);
			RandomArray[i] = tempArray[index];
			temp = tempArray[tempArray.length-i-1];
			tempArray[tempArray.length-i-1] = tempArray[index];
			tempArray[index] = temp;
		}
		
		int counter = 0;
		for(int i = ReversedArray.length-1; i >= 0 ; i--) {
			ReversedArray[counter] = i;
			counter++;
		}
	}*/
	
	
	void rndArray(int number) {
		RandomArray = null;
		RandomArray = new int[number];
		Random rnd = new Random();
		for(int i = 0; i < number; i++) {
			RandomArray[i] = rnd.nextInt();
			
		}
		
	}
	
	@SuppressWarnings("static-access")
	void testEx(int number, int length) {
		long start;
		long end;
		long bub = 0;
		long sel = 0;
		long staSel = 0;
		long ins = 0;
		int medianIndex;
		int bubMed = 0;
		int selMed = 0;
		int staSelMed = 0;
		int insMed = 0;
		

		stableSelectionSort f = new stableSelectionSort();
		bubbleSort b = new bubbleSort();
		selectionSort e = new selectionSort();

		insertionSort c = new insertionSort();
		for(int i = 0; i < length; i++) {
			start = System.nanoTime();
			b.bubEx(number);
			end = System.nanoTime();
			bub = bub + (start-end);
			
			
			start = System.nanoTime();
			c.insertEx(number);
			end = System.nanoTime();
			ins = ins + (start-end);
			
			/*
			binaryInsertionSort d = new binaryInsertionSort();
			
			d.binInEx(number);
			
			System.out.println();*/
			
			
			start = System.nanoTime();
			e.selSortEx(number);
			end = System.nanoTime();
			sel = sel + (start-end);
			
			
			start = System.nanoTime();
			f.selSortStableEx(number);
			end = System.nanoTime();
			staSel = staSel + (start-end);
		}
		
		
		b.bubS.sort(null);
		e.selS.sort(null);
		f.staSelS.sort(null);

		
		//All steps average
		int sumb = 0;
		int sumSel = 0;
		int sumStaSel = 0;
		int sumIns = 0;
		
		for(int i = 0; i < length; i++) {
			sumb = sumb + b.bubS.get(i);
			sumSel = sumSel + e.selS.get(i);
			sumStaSel = sumStaSel + f.staSelS.get(i);
			sumIns = sumIns + c.insS.get(i);
		}
		b.steps = sumb/length;
		c.steps = sumIns/length;
		e.steps = sumSel/length;
		f.steps = sumStaSel/length;
		

		//Comparison Average
		sumb = 0;
		sumSel = 0;
		sumStaSel = 0;
		sumIns = 0;
		int bubCompAvg;
		int insCompAvg;
		int selCompAvg;
		int staSelCompAvg;
		
		for(int i = 0; i < length; i++) {
			sumb = sumb + b.bubComp.get(i);
			sumSel = sumSel + e.selComp.get(i);
			sumStaSel = sumStaSel + f.staSelComp.get(i);
			sumIns = sumIns + c.insComp.get(i);
		}
		bubCompAvg = sumb/length;
		insCompAvg = sumIns/length;
		selCompAvg = sumSel/length;
		staSelCompAvg = sumStaSel/length;
		
		
		//Switch Average
		sumb = 0;
		sumSel = 0;
		sumStaSel = 0;
		sumIns = 0;
		int bubSwitchAvg;
		int insSwitchAvg;
		int selSwitchAvg;
		int staSelSwitchAvg;
		
		
		for(int i = 0; i < length; i++) {
			sumb = sumb + b.bubSwitchS.get(i);
			sumSel = sumSel + e.selSwitchS.get(i);
			sumStaSel = sumStaSel + f.staSelSwitchS.get(i);
			sumIns = sumIns + c.insSwitchS.get(i);
		}
		bubSwitchAvg = sumb/length;
		insSwitchAvg = sumIns/length;
		selSwitchAvg = sumSel/length;
		staSelSwitchAvg = sumStaSel/length;
		
		
		int selCompMed;
		int selSwitchMed;
		int bubCompMed;
		int bubSwitchMed;
		int staSelCompMed;
		int staSelSwitchMed;
		int insCompMed;
		int insSwitchMed;
		
		if(length%2 == 0) {
			bubMed = (b.bubS.get(length/2)+b.bubS.get(length/2-1))/2;
			selMed = (e.selS.get(length/2)+e.selS.get(length/2-1))/2;
			staSelMed = (f.staSelS.get(length/2)+f.staSelS.get(length/2-1))/2;
			insMed = (c.insS.get(length/2)+c.insS.get(length/2-1))/2;
			bubCompMed = (b.bubComp.get(length/2)+b.bubComp.get(length/2-1))/2;
			bubSwitchMed = (b.bubSwitchS.get(length/2)+b.bubSwitchS.get(length/2-1))/2;
			selCompMed = (e.selComp.get(length/2)+e.selComp.get(length/2-1))/2;
			selSwitchMed = (e.selSwitchS.get(length/2)+e.selSwitchS.get(length/2-1))/2;
			staSelCompMed = (f.staSelComp.get(length/2)+f.staSelComp.get(length/2-1))/2;
			staSelSwitchMed = (f.staSelSwitchS.get(length/2)+f.staSelSwitchS.get(length/2-1))/2;
			insCompMed = (c.insComp.get(length/2)+c.insComp.get(length/2-1))/2;
			insSwitchMed = (c.insSwitchS.get(length/2)+c.insSwitchS.get(length/2-1))/2;
			
			
		}
		else {
			medianIndex = length/2;
			bubMed = b.bubS.get(medianIndex);
			selMed = e.selS.get(medianIndex);
			staSelMed = f.staSelS.get(medianIndex);
			insMed = c.insS.get(medianIndex);
			bubCompMed = b.bubComp.get(medianIndex);
			bubSwitchMed = b.bubSwitchS.get(medianIndex);
			selCompMed = e.selComp.get(medianIndex);
			selSwitchMed = e.selSwitchS.get(medianIndex);
			staSelCompMed = f.staSelComp.get(medianIndex);
			staSelSwitchMed = f.staSelSwitchS.get(medianIndex);
			insCompMed = c.insComp.get(medianIndex);
			insSwitchMed = c.insSwitchS.get(medianIndex);
		}
		
		
		
		System.out.println("Bubblesort average: " + Math.abs(bub/length/1000) + " Milliseconds in average");
		System.out.println("Average All-Steps " + b.steps + " Median: " + bubMed);
		System.out.println("Average Comparison Steps: " + Math.abs(bubCompAvg) + " Median: " + bubCompMed);
		System.out.println("Average Switch Steps: " + Math.abs(bubSwitchAvg) + " Median: " + bubSwitchMed);
		System.out.println();
		
		System.out.println("Selectionsort average: " + Math.abs(sel/length/1000) + " Milliseconds in average");
		System.out.println("Average All-Steps " + e.steps + " Median: " + selMed);
		System.out.println("Average Comparison Steps: " + Math.abs(selCompAvg) + " Median: " + selCompMed);
		System.out.println("Average Switch Steps: " + Math.abs(selSwitchAvg) + " Median: " + selSwitchMed);
		System.out.println();
		
		System.out.println("Stableselectionsort average: " + Math.abs(staSel/length/1000) + " Milliseconds in average");
		System.out.println("Average All-Steps " + f.steps + " Median: " + staSelMed);
		System.out.println("Average Comparison Steps: " + Math.abs(staSelCompAvg) + " Median: " + staSelCompMed);
		System.out.println("Average Switch Steps: " + Math.abs(staSelSwitchAvg) + " Median: " + staSelSwitchMed);
		System.out.println();
		
		System.out.println("Insertionsort average: " + Math.abs(ins/length/1000) + " Milliseconds in average");
		System.out.println("Average All-Steps " + c.steps + " Median: " + insMed);
		System.out.println("Average Comparison Steps: " + Math.abs(insCompAvg) + " Median: " + insCompMed);
		System.out.println("Average Switch Steps: " + Math.abs(insSwitchAvg) + " Median: " + insSwitchMed);
		System.out.println();

	}
}
