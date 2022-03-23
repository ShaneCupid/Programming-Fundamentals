import java.util.Scanner;

public class Solution7 {

	public static void main(String[] args) {
		try {
			Scanner userInput = new Scanner(System.in);
			int number1;
			int number2;

			System.out.println("Insert two integers");
			number1 = userInput.nextInt();
			System.out.println("First number is : " + number1);
			number2 = userInput.nextInt();
			System.out.println("Second number is : " + number2);

			System.out.println("When we divide both numbers we get : " + number1/number2);
		}
		catch(ArithmeticException c) {
			c.printStackTrace();
			System.out.println(c + ":" + " You cannot divide by 0 ");
		}}}