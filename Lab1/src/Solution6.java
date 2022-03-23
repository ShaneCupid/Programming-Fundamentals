import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Solution6 {

	public static void main(String[] args) {
		//Write a program to ask the user for states they have visited in the US.
		//Ignore case by converting their input to lower case. Ignore duplicate
		//inputs. Order of input doesn't matter. The program runs forever until
		//the user types "done". When the user types "done", display the
		//unique list of states back to the user
		System.out.println("Enter the states you have visited one at a time.");
		Scanner userInput = new Scanner(System.in);//created scanner to allow user access to the program
		String state;//initializing String state variable
		String hello = "DONE";
		ArrayList <String> anything = new ArrayList<String>();//created arrayList

		do {
			System.out.println("State name : ");
			state = userInput.next();//appropriate way to call for next String/state name
			anything.add(state);
			if(state.equalsIgnoreCase(hello)) {
				System.out.println("Thank you : ");
				break;
			}
		}
		while (state != "done");
		HashSet<String> merica = new HashSet<String>(anything);
		System.out.println(merica);
	}}
//forever loop
//HashSet<String> states = new HashSet<String>(states)
