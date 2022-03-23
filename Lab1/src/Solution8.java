import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Solution8 {

	public static void main(String[] args) throws IOException {
	
		String line;  
        int count = 0;  
          
        //Opens a file in read mode  
        FileReader file = new FileReader("C:\\Users\\ShaneCupid\\OneDrive - Xpanxion\\Desktop\\Lab Homework\\the_prince_quotes.txt");
        BufferedReader br = new BufferedReader(file);  
              
        //Gets each line till end of file is reached  
        while((line = br.readLine()) != null) {  
            //Splits each line into words  
            String words[] = line.split(" ");  
            //Counts each word  
            count = count + words.length;  
        }  
          
        System.out.println("Number of words present in given file: " + count);  
        br.close();  
    }  
}  