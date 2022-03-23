
public class Solution3 {

	public static void main(String[] args) {
		//1.Write a program that declares and initializes a counter to 0. Run a
		//2.forever while loop, increment counter by 1 with every iteration. break
		//3.the loop when counter is 5. continue the loop without printing the
		//4.number when counter is 3. Print the counter for all other values.
		//5.This question involves while loop, break and continue statements

		int counter = 0;//point 1
		while(counter<10) {
			counter++; //incremented by 1 from 0 so first number printing can be 1
			System.out.println(counter);
			counter++;
			if(counter == 5) { //point3
				counter++;
				break;
			}
			if(counter == 3) {//point4
				counter++;
				continue;
			}
			System.out.println(counter++);//point 5
		}}}

//cleaner version learned from Bijay. 

/*
 * int counter=0;

while(counter>=0) {
counter++;
System.out.println(counter);
if (counter==2) {
counter++;
continue;

}
else if(counter==4) {
counter++;
break;
}
}
*/
