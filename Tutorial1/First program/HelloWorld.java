import java.util.Scanner;

public class HelloWorld{
    public static void main (String[] args){
    	String question ="What is 2+2?";
    	String choiceOne = "4";
    	String choiceTwo = "2";
    	String choiceThree = "7";
    	String correctAnswer = choiceOne;
    	System.out.println(question);
    	System.out.println(choiceOne);
    	System.out.println(choiceTwo);
    	System.out.println(choiceThree);
    	Scanner input = new Scanner(System.in);
    	Short inputFromUser = input.nextShort();
    	if(inputFromUser.toString().equals(correctAnswer)) {
    		System.out.println("Correct!");
    	}
    	else
    	{
    		System.out.println("Incorrect! the correct answer is: " + correctAnswer);
    	}
    	
    }
    
}