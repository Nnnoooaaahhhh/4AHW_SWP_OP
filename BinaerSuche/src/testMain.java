import java.util.*;

public class testMain {
	
	static int rnd[] = new int[10000];
	static 	int number;

	public static void main (String args[]) {
		testMain a = new testMain();
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		a.sortArray();
		a.ausgabe();
		scan.close();
	}
	
	void sortArray() {
		Random r = new Random();
		for(int i = 0; i < rnd.length; i++) {
			rnd[i] = r.nextInt(rnd.length);
		}
		Arrays.sort(rnd);
}
	
	String sequentilleSuche(int number, int rnd[]) {
		long start = System.nanoTime();
		for(int i = 0; i < rnd.length; i++) {
			if(number == rnd[i]) {
				long end = System.nanoTime();
				long elapsed = end - start;
				return Long.toString(elapsed) + " nanoseconds";
			}
			if(i > rnd[rnd.length-1]) {
				return "unseccesful";
			}
		}	
		return "unseccesful";
	}
	
	String binaerSuche(int number, int rnd[]) {
		int lowest = rnd[0];
		int middle;
		int right = rnd.length-1;
		long start = System.nanoTime();
		for(int i = 0; i < rnd.length; i++) {
			if(lowest>right) {
				return "unseccesful";
			}
			middle = (int) (lowest+right)/2;
			if(rnd[middle]<number) {
				lowest = middle + 1;
			}
			if(rnd[middle]>number) {
				right = middle - 1;
			}
			if(rnd[middle]==number) {
				long end = System.nanoTime();
				long elapsed = end - start;
				return Long.toString(elapsed) + " nanoseconds";
			}
		}
		return "unseccesful";
	}
	
	void ausgabe() {
		System.out.println("Sequentialsearch: " + sequentilleSuche(number, rnd));
		System.out.println("Binarysearch: " + binaerSuche(number, rnd));
	}
}