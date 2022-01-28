package com.project.lockedme;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CreateFile extends Path{
		void create() throws IOException {
		ArrayList<String> al=new ArrayList<>();
		System.out.println("enter the file name to create");
	  	  /*while(true) {*/
  	 
  	    Scanner sc = new Scanner(System.in);
		String filename=sc.next();
		 String finalfilename=path+filename;
		 File f=new File(finalfilename);
		 boolean result=f.createNewFile();
		 if(result==false) {
			 System.out.println("file is not created");
		 }
		 else {
			 al.add(filename);
			 System.out.println("file is created at : "+path);
		 }
	
  	 
  	 System.out.println(al);
 	}

}

