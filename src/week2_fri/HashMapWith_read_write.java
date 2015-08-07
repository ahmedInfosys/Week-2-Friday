package week2_fri;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;


public class HashMapWith_read_write {
	public static void main(String []args) throws IOException {
		Scanner key = new Scanner(System.in);
		HashMap<Integer, String> Line = new HashMap<Integer, String>();

		
		String filename = (System.getProperty("user.dir") + File.separatorChar + "my_hash_map.txt");
		
		PrintWriter writer = null;
		BufferedReader reader = null;
		try {
			writer = new PrintWriter (new File(filename));
			
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		 

		String choice = "y";
		
		System.out.println("Welcome to HashMap Application.");
		int number = 0;
		String response;
		
		while(choice.equalsIgnoreCase("y")){
			System.out.print("Prompt: Enter a number: " );
			try{
				number = key.nextInt();
				System.out.println();
				//writer.println(number);
				
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
		
		//Writing to file my_hash_map.txt from Line Hash map.
		for(int KEY:Line.keySet()){
			writer.println(KEY + "\t" + Line.get(KEY));
		}
		writer.close();
		
		//Reading from file my_hash_map.txt
		reader = new BufferedReader(new FileReader(filename));
		String LINE = reader.readLine();
		
		while(LINE != null){
			System.out.println(LINE);
			LINE = reader.readLine();
		}
		
		reader.close();
		
	}
		
		

}

