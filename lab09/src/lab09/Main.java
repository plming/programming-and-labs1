package lab09;

public class Main {

	public static void main(String[] args) {

		Taylor m = new Taylor(5);

		System.out.println(m.combination(10, 2));
		System.out.println(m.factorial(5));
		System.out.println(m.power(5, 2));

		System.out.println(m.exponent(1));
		System.out.println(m.exponent(2));
	}

}
