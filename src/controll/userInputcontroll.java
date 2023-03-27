package controll;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import resources.Student;
import service.ServiceProvider;

public class userInputcontroll {
	Scanner scan = new Scanner(System.in);
	ServiceProvider sp = new ServiceProvider();
	List<Student> list = new ArrayList<>();
	int n;

	public userInputcontroll() throws IOException, ClassNotFoundException {
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
				
				Student student = new Student(id,name,address,gmail,age);
				list.add(student);
				sp.addRecord(list);
				break;
				
			case 2:
				sp.showRecord(list);
				
		}
		
	}
	
	
	
}
