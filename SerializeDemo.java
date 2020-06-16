package org.jayesh.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeDemo{
	
	public static void main(String[] args)
	{
		
		Student s = new Student(10,"Jayesh","Patil",56);
		System.out.println("Object Before Serialization");
		System.out.println("Roll \t FName \t LName \t Contact");
		System.out.println(s.getRoll()+"\t"+s.getFname()+"\t"+s.getLname()+"\t"+s.getContact());
		
		//Serialization
		
		try {
			FileOutputStream fos = new FileOutputStream("student.txt");
			ObjectOutputStream out = new ObjectOutputStream(fos);
			out.writeObject(s);
			System.out.println("\n Serialization completed \n");
			out.close();
			fos.close();
			
		} catch (IOException e) {
			// TODO: handle exception
		}
		
		try {
			FileInputStream fis = new FileInputStream("student.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student s1 = (Student)ois.readObject();
			fis.close();
			ois.close();
			System.out.println("Object After Deserialization");
			System.out.println("Roll \t FName \t LName \t Contact");
			System.out.println(s.getRoll()+"\t"+s.getFname()+"\t"+s.getLname()+"\t"+s.getContact());
			
			
		}
		catch(IOException e)
		{
			
		}
		catch(ClassNotFoundException e)
		{
			
		}
		
		
	}

	
}
