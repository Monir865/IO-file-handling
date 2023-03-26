package controll;

import service.ServiceProvider;

public class App {
	public static void main(String [] args) {
		
		System.out.println("Hello GIT ");
		ServiceProvider sp = new ServiceProvider("info.txt");
		sp.show();
		
	}
}
