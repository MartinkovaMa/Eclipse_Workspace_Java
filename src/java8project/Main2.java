package java8project;
import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
		Scanner victor = new Scanner(System.in);
		String firstName,secondName;
		System.out.println("What is your first name?");
		firstName = victor.nextLine();
		System.out.println("What is your second name?");
secondName = victor.nextLine();
System.out.println("Welcome to my course, " + firstName + " " + secondName + "!");
	}

}
