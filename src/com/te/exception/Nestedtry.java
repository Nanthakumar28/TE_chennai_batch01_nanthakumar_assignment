package com.te.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Nestedtry {
	
	public static void main(String[] args) {
		
		File f1 = new File("C:\\Users\\Lenovo\\Desktop");
		
		try {
			FileReader fr = new FileReader(f1);
			try {
				int a = fr.read();
				while(a!=-1)
				{			
				System.out.print((char)a);
				a=fr.read();
				}
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
