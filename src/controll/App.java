package controll;

import java.io.IOException;

public class App {
	
	public static void main(String [] args) throws ClassNotFoundException {
		try {
			new userInputcontroll();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
