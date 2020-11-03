
public class testMain {
	public static void main (String atgs[]) {
		System.out.println(fib(10));
	}
	
	static int fibx(int x, int n, int m) {
		if(x <= 0) {
			return m;
		}
		return fibx(x-1, n+m, n);
	}
	
	static int fib(int n) {
		return fibx(n, 1, 0);
	}
}


