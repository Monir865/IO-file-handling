package service;


public class ServiceProvider {
	String file_name = "";
	
	
	public ServiceProvider(String file_name) {
		this.file_name = file_name;
	}
	
	public void show() {
		System.out.println(file_name);
	}
	
	
	
}
