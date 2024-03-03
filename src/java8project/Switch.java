package java8project;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		Scanner martina = new Scanner(System.in);
		int age;
		System.out.println("What is our age? ");
		age = martina.nextInt();
		
		switch(age) {
		case 17:
			System.out.println("Sorry, you are not allowed to eneter. Come again next year!");
			break;
		case 18:
			System.out.println("Welcome. Come in !");
			break;
		case 19:
			System.out.println("Welcome, old guy!");
			break;
		}

	}

}
