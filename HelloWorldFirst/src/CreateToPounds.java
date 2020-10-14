import java.util.Scanner;

public class CreateToPounds {

	public static void main(String[] args) {
		System.out.println("Number of pounds:");
		Scanner scan = new Scanner(System.in);
		double input = scan.nextDouble();
		double result = input * 0.45359237;
		System.out.println("The number of kilograms is:" + result);
		

	}

}
