import java.util.Random;

public class testMain {
	
	
	int orderedArray[];
	int ReversedArray[];
	int RandomArray[];
	int tempArray[];

	public static void main(String[] args) {
		testMain a = new testMain();
		a.testEx(10000);
	}
	
	void getArrays(int number) {
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
	}
	
	void testEx(int number) {
		System.out.println("Ordered/Reversed/Random");
		bubbleSort b = new bubbleSort();
		System.out.println("Bubblesort: ");
		b.bubEx(number);
		System.out.println();
		
		insertionSort c = new insertionSort();
		System.out.println("Insertionsort: ");
		c.insertEx(number);
		System.out.println();
		
		binaryInsertionSort d = new binaryInsertionSort();
		System.out.println("Binary-Insertionort: ");
		d.binInEx(number);
	}
}
