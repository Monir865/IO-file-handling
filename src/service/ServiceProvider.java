package service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import resources.Student;

public class ServiceProvider {
	String file_name = "new_record";
	File file = new File(file_name+".txt");

	
	public ServiceProvider() {
		if(file.exists()) {
			System.out.println("File already exists");
		}else {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("Failed to Create new file!");
			}
		}
	}
	
	public void addRecord(List<Student> list) throws IOException {
		FileOutputStream fos = new FileOutputStream(file);
		try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(list);
		}catch(Exception e) {
			System.out.println("Record are Saved Successfully!");
		}
		
	}
	

	public void showRecord(List<Student> list) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(file);
		try (ObjectInputStream ois = new ObjectInputStream(fis)) {
			//List<Student> st = (List<Student>) ois.readObject();
			Student st = (Student) ois.readObject();
			
			
			
			
		}
		
	}
	
	
	
}
