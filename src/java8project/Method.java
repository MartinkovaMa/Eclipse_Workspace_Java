package java8project;

public class Method {

	public static void main(String[] args) {
		System.out.print("The two numbers multiplied are: ");
		System.out.println(multiplyTwoNumbers(3, 12));
		System.out.print("The two added numbers are: ");
		System.out.println(addTwoNumbers(15, 28));
	}
public static int multiplyTwoNumbers(int firstNumber,int secondNumber) {
return firstNumber * secondNumber;
}
public static int addTwoNumbers(int numberOne, int numberTwo) {
	return numberOne + numberTwo;
}
}