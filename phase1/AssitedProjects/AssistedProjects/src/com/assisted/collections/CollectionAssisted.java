package com.assisted.collections;
import java.util.*;
public class CollectionAssisted {






	public static void main(String[] args) {
		//creating arraylist
		System.out.println("ArrayList");
		ArrayList<String> colors=new ArrayList<String>();   
	      colors.add("black");//
	      colors.add("pink");    	   
	      System.out.println(colors);  
		
		//creating vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<String> vec = new Vector<String>();
	      
	      Vector<Integer> vec2 = new Vector<Integer>();
	      vec.addElement("15"); 
	      vec2.addElement(30); 
	      System.out.println(vec);
	      System.out.println(vec2);
	      
		//creating linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Alex");  
	      names.add("John");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next()); 
	       
	       //creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(101);  
	       set.add(103);  
	       set.add(102);
	       set.add(104);
	       System.out.println(set);
	       
	       //creating linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(11);  
	       set2.add(13);  
	       set2.add(12);
	       set2.add(14);	       
	       System.out.println(set2);
	      	} 
	      }  
}


