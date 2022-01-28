 package com.project.lockedme;

import java.io.File;
import java.util.Scanner;

public class DeleteFile extends Path{
	void Delete() {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the file to delete");
	 String filename=sc.next();
	 
	 
	 String finalfilename=path+filename;
     File f=new File(finalfilename);

	 	 f.delete();
	 	 System.out.println("file deleted");
	 
}
}
