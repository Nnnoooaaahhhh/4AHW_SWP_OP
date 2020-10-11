public class testMain {

	public static void main(String args[]) {
		testMain a = new testMain();
		a.ausgabe();
	}

	int iterativ(int number1, int number2) {
		int result = 0;
		for (int i = 0; i < number2; i++) {
			result = result + number1;
		}
		return result;
	}

	int rekursiv(int number1, int number2) {
		int number3;
		int number4;
		if (number1 == 0) {
			return (0);
		}
		number1--;
		number3 = rekursiv(number1, number2);
		number4 = number2 + number3;
		return number4;
	}

	void ausgabe() {
		System.out.println("Iterativ: " + iterativ(8, 9));
		System.out.println("Rekursiv: " + rekursiv(13, 5));
	}
}
