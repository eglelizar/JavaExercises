package Arrays;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//AutoBoxing and unboxing
		ArrayList <Double> example =  new ArrayList<Double>();
		for (double i=0; i<10.0; i+=0.5) {
			example.add(Double.valueOf(i));
		}		
		for(int i=0; i<example.size(); i++) {
			double value= example.get(i).doubleValue();
			System.out.println("The value of this double is "+ value);
		}
	}

}
