
public class Sum3And5Challenge {

	public static void main(String[] args) {
		long allNumbers = 0;
		int numberOfFound =0;
		for (int i=1; i<=1000; i++) {
			if(i%3 == 0 && i%5==0) {
				allNumbers+=i;
				System.out.println(i);
				numberOfFound++;
			}
			if (numberOfFound ==5)
				break;
		}
		System.out.println("The sum is " + allNumbers);

	}

}
