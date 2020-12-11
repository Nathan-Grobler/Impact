package numberrangesummarizer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		
		
		SequentialGrouping group = new SequentialGrouping(); //Declare new instance of class SequentialGrouping
		Collection<Integer> list = new ArrayList<Integer>(); //Declare list
		
		try (Scanner myObj = new Scanner(System.in)) {
			System.out.println("Enter comma delimeted list:");//Request User Input

			String input = myObj.nextLine();  // Read user input

			//"1,3,6,7,8,12,13,14,15,21,22,23,24,31" ///Example List
					
			try {			
				list = group.collect(input); //input string into collect function
				System.out.println(group.summarizeCollection(list)); //Collecting<integer> list into summarizeCollection function and display result
			}catch(Exception e) {
				System.out.println("Error: Invalid Input");//Error for invalid input into functions
			}
		}		
	}
}
