import java.util.*;

public class testMain {
	
	static int rnd[] = new int[10000];

	public static void main (String args[]) {
		testMain a = new testMain();
		int number;
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		a.sortArray();
		a.sequentilleSuche(number);
		a.binaerSuche(number);
		scan.close();
	}
	
	void sortArray() {
		Random r = new Random();
		for(int i = 0; i < rnd.length; i++) {
			rnd[i] = r.nextInt(rnd.length);
		}
		Arrays.sort(rnd);
		for(int i = 0; i < rnd.length; i++) {
			System.out.println(rnd[i]);
		}
}
	
	void sequentilleSuche(int number) {
		long start = System.nanoTime();
		for(int i = 0; i < rnd.length; i++) {
			if(number == rnd[i]) {
				System.out.println("Sequential search successful");
				long end = System.nanoTime();
				long elapsed = end - start;
				System.out.println("Time:" + elapsed + " nanoseconds");
				break;
			}
		}	
	}
	
	void binaerSuche(int number) {
		int lowest = rnd[0];
		int middle;
		int right = rnd.length-1;
		long start = System.nanoTime();
		for(int i = 0; i < rnd.length; i++) {
			if(lowest>right) {
				System.out.println("Unsuccessful");
				break;
			}
			middle = (int) (lowest+right)/2;
			if(rnd[middle]<number) {
				lowest = middle + 1;
			}
			if(rnd[middle]>number) {
				right = middle - 1;
			}
			if(rnd[middle]==number) {
				System.out.println("Binary search successful");
				long end = System.nanoTime();
				long elapsed = end - start;
				System.out.println("Time:" + elapsed + " nanoseconds");
				break;
			}
		}
	}
}