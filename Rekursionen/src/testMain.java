public class testMain {

	public static void main(String args[]) {
		testMain a = new testMain();
		a.ausgabe();
	}


	int multiplikationRekursiv(int number1, int number2) {
		int number3;
		if (number1 == 0) {
			return (0);
		}
		number1--;
		number3 = multiplikationRekursiv(number1, number2);
		return number2 + number3;
	}
	
	int faktoriellRekursiv(int number) {
		if(number == 0){
			return(1);
		}
		return faktoriellRekursiv(number-1) * number;
	}
	
	int summenfunktionRekursiv(int number) {
		if(number == 0){
			return(0);
		}
		return summenfunktionRekursiv(number-1) + number;
	}
	
	int fibonacciRekursiv(int number1) {
		if(number1==1||number1==2) {
			return 1;
		}
		return fibonacciRekursiv(number1 - 1) + fibonacciRekursiv(number1 - 2); 
	}

	void ausgabe() {
		System.out.println("Multiplikation: " + multiplikationRekursiv(6, 5));
		System.out.println("Faktor: " + faktoriellRekursiv(5));
		System.out.println("Summe:" + summenfunktionRekursiv(7));
		System.out.println("Fibonacci:" + fibonacciRekursiv(8));
	}
}
