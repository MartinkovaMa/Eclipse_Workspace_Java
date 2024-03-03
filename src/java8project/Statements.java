package java8project;
import java.util.Scanner;
public class Statements {

	public static void main(String[] args) {
		Scanner martina = new Scanner(System.in);
int age;
System.out.println("What is our age? ");
age = martina.nextInt();

if (age<18);{
System.out.println("Sorry, you are not allowed to eneter!");
	}
while(age>=18) {
	System.out.println("Ok, you are allowe to enter to the bar!");
}
}
}
// there is problem with using of else if, it shows an error, but it´s mistake
// I have used recommended while for correction, but it caused loop