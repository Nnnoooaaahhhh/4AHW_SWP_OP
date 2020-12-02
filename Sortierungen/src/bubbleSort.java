import java.util.Random;

public class bubbleSort {
	
	void bubSort(int number){
		long start;
		long end;
		int numbers[] = new int[number];
		Random rnd = new Random();
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = rnd.nextInt(number);
		}
		
		int temp;
		int steps = 0;
		start = System.nanoTime();
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers.length-i-1; j++) {
				if(numbers[j+1] < numbers[j]) {
					temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
					steps++;
				}
			}
		}
		end = System.nanoTime();
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
			}
		System.out.println("Time: " + (end-start) + " Nanoseconds in " + steps + " steps");
	}

}
