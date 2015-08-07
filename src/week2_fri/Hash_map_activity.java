package week2_fri;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Hash_map_activity {
	public static void main(String []args){
		Scanner key = new Scanner(System.in);
		HashMap<Integer, String> Line = new HashMap<Integer, String>();
		
		String choice = "y";
		
		System.out.println("Welcome to HashMap Application.");
		int number = 0;
		String response;
		
		while(choice.equalsIgnoreCase("y")){
			System.out.print("Prompt: Enter a number: " );
			try{
				number = key.nextInt();
				System.out.println();
				
				if(!Line.containsKey(number)){
					System.out.print("Prompt: Enter a value: " );
					response = key.next();
					//key.nextLine();
					Line.put(number, response);
				}else{
					System.out.println("You entered " + Line.get(number));
				}
				
			}catch(InputMismatchException e){
				System.out.println("The entered key should be a number. ");
		
			}
			
			System.out.println("Would you like to try again? Y/N");
			choice = key.next();
			
			
		}	
	}
}
