package com.project.lockedme;

import java.io.File;
import java.util.Scanner;

public class SearchFile extends Path{
	void Search() {
	     File f=new File(path);
         
         System.out.println("enter a file to search");
         Scanner sc=new Scanner(System.in);
         String filenamesearch=sc.next();
         File filename[]=f.listFiles();
         int flag=0; 
         for(File ff:filename) {
	 if(ff.getName().equals(filenamesearch)){
		 flag=1;
		 
		 break;
	 }
	 else {
	 flag=0;
		 
	 }
	 
}
if(flag==1) {
	 System.out.println("file is available");
}
else {
	 System.out.println("file is not available");
}
}
}
