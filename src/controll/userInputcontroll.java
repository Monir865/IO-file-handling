package controll;

import java.io.IOException;
import java.util.Scanner;
import service.ServiceProvider;

public class userInputcontroll {
	Scanner scan = new Scanner(System.in);
	ServiceProvider sp = new ServiceProvider();
	int n;

	public userInputcontroll() throws IOException, ClassNotFoundException {
		
		while(true) {	
			System.out.println("1. Add data.\n2. Show Data.\n3. Exit\n\n");
			
			System.out.println("Please Select Your service...");
			n = scan.nextInt();
				
				switch(n) {
					case 1: 
						System.out.print("\nEnter Student Id : ");
						int id = scan.nextInt();
						scan.nextLine();
						
						System.out.print("\nEnter Student name : ");
						String name = scan.nextLine();
						
						System.out.print("\nEnter Student address : ");
						String address = scan.nextLine();
						
						System.out.print("\nEnter Student gmail : ");
						String gmail = scan.nextLine();
						
						System.out.print("\nEnter Student age : ");
						int age = scan.nextInt();

						sp.addRecord(id, name, address, gmail, age);
						break;
						
					case 2:
						sp.showRecord();
						break;
					case 3: System.exit(0);
							break;
					
					default: System.out.println("Invalid input!");
						
				}
		}//end while case
		
	}
	
	
	
}
