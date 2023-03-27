package service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.ListIterator;

import resources.Student;

public class ServiceProvider {
	private String file_name = "new_record.txt";
	private File file = new File(file_name);
	private ArrayList<Student> list = new ArrayList<>();
	private ListIterator<Student> it = null;
	private FileOutputStream fos = null;
	private FileInputStream fis = null;
	private ObjectOutputStream oos = null;
	private ObjectInputStream ois = null;
	

	
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
	
	public void addRecord(Student student) throws IOException {
		list.add(student);
		fos = new FileOutputStream(file_name,true);
		oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		fos.close();
		oos.close();	
	}
	
	public ArrayList<Student> readFile() throws IOException, ClassNotFoundException {
		fis = new FileInputStream(file_name);
		ois = new ObjectInputStream(fis);
		list = (ArrayList<Student>)ois.readObject();
		ois.close();
		return list;
	}
	
	public void showRecord() throws IOException, ClassNotFoundException {
		list = readFile();
		it = list.listIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	
	
	
}
