import java.util.Scanner;
import java.lang.Math;

public class Solution5 {

	public static void main(String[] args) {
		//Write a program to ask the user for a decimal number, and print the
		//floor, ceil, round of that number
		
		Scanner userInput = new Scanner(System.in); //created scanner to allow user access to the program
		System.out.println("Enter a decimal number: ");
		float number; //initialized type of number user needs to insert
		number = userInput.nextFloat(); //appropriate way to call for next float/decimal number
		//inserting correct math methods for ceil, floor, and round
		System.out.println("The ceil value of " + number + " is " + Math.ceil(number));
		System.out.println("The floor value of " + number + " is " + Math.floor(number));
		System.out.println(number + "rounded to its nearest integer is " + Math.round(number));
	
userInput.close();
}}
