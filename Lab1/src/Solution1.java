public class Solution1 {
	//Write a program to reverse the order of words in a sentence
	static String wordReverse(String array) {
		{
			int r = array.length()-1;
			int start, end = r +1;
			String result = "";
			while(r>=0) {
				if(array.charAt(r)== ' ') {
					start = r + 1;
					while(start != end)
						result += array.charAt(start++);
					result += ' ';
					end = r;
				}
				r--;
			}
			start = 0;
			while(start!=end)
				result += array.charAt(start++);
			return result;
		}}
	public static void main(String[] args) {
		//24-32 is one way
		//3-21 & 34-35 is another way
		String a[]= "Hello World".split("");
		String ans = "";
		for(int i = a.length-1; i>=0; i--) {
			ans +=a[i]+ " ";
		}
		System.out.println("Regualar String : Hello World");
		System.out.println("Reversed String :" + ans);

		String str = "Shane Cupid you are the chosen one";
		System.out.println("How yoda will tell ya :  "+  wordReverse(str));
	}

}
