
public class OperatorChallenge {
	public static void main (String []args) {
		double operator1 = 20.00d;
		double operator2 = 80.00d;
		double result = (operator1 + operator2) *100.00d;
		result = result % 40.00d;
		boolean isZero = result == 0 ? true: false;
		System.out.println(isZero);
		if (!isZero)
			System.out.println("Got some remainder");
	}
}
