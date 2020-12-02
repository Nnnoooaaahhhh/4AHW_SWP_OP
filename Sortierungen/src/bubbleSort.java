import java.util.Random;

public class bubbleSort {
	
	void bubSort(int number){
		long start;
		long end;
		int index;
		int temp;
		int steps = 0;
		int orderedNumbers[] = new int[number];
		int endArr[] = new int[number];
		Random rnd = new Random();
		
		
		for(int i = 0; i < orderedNumbers.length; i++) {
			orderedNumbers[i] = i;
		}
		
		for(int i = 0; i < endArr.length; i++) {
			index = rnd.nextInt(orderedNumbers.length-i);
			endArr[i] = orderedNumbers[index];
			temp = orderedNumbers[orderedNumbers.length-i-1];
			orderedNumbers[orderedNumbers.length-i-1] = orderedNumbers[index];
			orderedNumbers[index] = temp;
			
			
			
		}
		
		start = System.nanoTime();
		for(int i = 0; i < endArr.length; i++) {
			for(int j = 0; j < endArr.length-i-1; j++) {
				if(endArr[j+1] < endArr[j]) {
					temp = endArr[j];
					endArr[j] = endArr[j+1];
					endArr[j+1] = temp;
					steps++;
				}
			}
		}
		end = System.nanoTime();
		for(int i = 0; i < endArr.length; i++) {
			System.out.println(endArr[i]);
			}
		System.out.println("Time: " + (end-start) + " Nanoseconds in " + steps + " steps");
	}

}
