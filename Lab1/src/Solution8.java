import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Solution8 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader read = null;



		try {
		read = new BufferedReader(new FileReader("C:\\Users\\ShaneCupid\\OneDrive - Xpanxion\\Desktop\\Lab Homework\\the_prince_quotes.txt"));



		HashMap<String, Integer> count = new HashMap<String, Integer>();
		// ArrayList<String>file=new ArrayList<String>();
		String lineReader;
		while ((lineReader = read.readLine()) != null) {
		lineReader.toLowerCase();
		System.out.println(lineReader);

		if (lineReader != null) {
		String[] file = lineReader.split(" ");
		// count.put(lineReader, null);
		for (String word : file) {
		// count.put(lineReader, null);
		Integer num = count.get(word);

		if (num == null) {
		count.put(word, 1);
		} else {
		count.put(word, num + 1);
		}

		}

		}

		}
		System.out.println(count);
		} catch (FileNotFoundException e) {
		System.out.println(e.getMessage());
		} catch (IOException e) {
		System.out.println("No problem");
		} finally {
		if (read != null) {
		// read.close();
		}
		}
		}
		}
     
     

     