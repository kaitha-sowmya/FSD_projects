package com.project.lockedme;

import java.io.IOException;
import java.util.Scanner;
public class Welcome {
	public static void main(String[] args) throws IOException {
		Path p=new Path();
		Scanner sc=new Scanner(System.in);
		Path.path();
		System.out.println("Welcome to LOCKEDME application developed by Kaitha sowmya");
	    System.out.println("select an option from");
	    System.out.println("1.display files in ascending order 2.file operations 3.close the application");
	    menu:
	    while(true) {
	      	 System.out.println("enter your choice 1 2 3 ");
	      	 
	      	 int choice=sc.nextInt();
	      	 switch(choice) {
	      	 case 1:AscendingOrder a=new AscendingOrder();
	      	 a.Asce();
	      	 break;
	      	 case 2:
	      		 while(true) {System.out.println("select an operation to perform");
	      	 System.out.println("1.create 2.delete 3.search 4.display 5.exit");
	      	 int option=sc.nextInt();
	      	 switch(option) {
	      	 case 1:CreateFile c=new CreateFile();
	      	 c.create();
	      	 break;
	      	 case 2:
	      		 DeleteFile d=new DeleteFile();
	      		 d.Delete();
	      		 break;
	      	 case 3:
	      		 SearchFile s=new SearchFile();
	      		 s.Search();
	      		 break;
	      	 case 4:
	      		 DisplayFile di=new DisplayFile();
	      		 di.display();
	      		 break;
	      	 case 5:
	      		 System.out.println("file operations closed");
	      		 continue menu;
	      		 
	         default:System.out.println("choose a valid operation");
	             break;
	      	 }	 	      	 
	      		 }
	      		 
	      	 case 3:
	      		 System.out.println("application is closed.Thankyou");
	      		 System.exit(0);
	      		 break;
	      	default:System.out.println("choose a valid option");	 
	      	     break;
	      	 }
	}


}
}