package com.org.learn;
import java.io.*;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try{    
			 FileInputStream fin=new FileInputStream("D:\\Hello.txt");     
             System.out.println("success...");    
            }catch(FileNotFoundException e){System.out.println(e);}  

	}

}
