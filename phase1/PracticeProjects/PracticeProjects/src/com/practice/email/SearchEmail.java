package com.practice.email;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchEmail {
	   public static void main(String[] args){
		   String mail;
	    	  Scanner sc=new Scanner(System.in);
	    	  System.out.println("enter the mail to search");
	    	  mail=sc.next();
	      ArrayList <String> al = new ArrayList<String>();
	      //Instantiating an ArrayList object
	      al.add("karthik@abc.com");
	      al.add("vibha@abc.com");
	      al.add("lexi@abc.com");
	      al.add("freya@abc.com");
	      al.add("rosa@abc.com");
	      al.add("mendy@abc.com");
	      al.add("rory@abc.com");
	      
	      
	      for (String m: al){
	    	//  System.out.println("hi");
	    	  //System.out.println(al);
	    	  boolean result=m.equals(mail);
	         if (result=false){
	               System.out.println(m+" does not exists");
	               
	         }
	         else {
	        	 System.out.println(" mail exist");
	        	 break;
	         }
	        	 
	      }
	   }
	}
