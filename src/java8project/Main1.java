package java8project;
import java.util.Scanner;
public class Main1 {

	public static void main(String[] args) {
	var jana = new Scanner(System.in);
double firstNumber,secondNumber,answer;
System.out.println("Enter first number: ");
firstNumber =  jana.nextDouble();
System.out.println("Enter second number : ");
secondNumber = jana.nextDouble();
answer = firstNumber + secondNumber;
System.out.println("The answer is: " + answer);
	}

}
