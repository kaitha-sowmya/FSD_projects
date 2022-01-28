package com.practice.files;

import java.io.FileWriter;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException; 
import java.io.PrintWriter;

import java.io.BufferedWriter; import java.io.FileWriter; import java.io.IOException; import java.io.PrintWriter;

public class AppendFile {
public static void main( String[] args ) {

	try {
		FileWriter f = new FileWriter("D://filepath//testFile3.txt", true); 
		BufferedWriter b = new BufferedWriter(f);
		PrintWriter p = new PrintWriter(b);
		
		p.println("appending text into file");
        p.println("Welcome ");
        p.println("Thankyou!!");
        p.close();
        
	}
	catch (IOException e) {
		e.printStackTrace();
		}
}
}
	

				