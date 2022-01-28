package com.project.lockedme;

import java.io.File;
import java.util.Arrays;

public class AscendingOrder extends Path{
    void Asce() {
	File f = new File(path);
	
	if(f.isDirectory()){
		File filename[]=f.listFiles(); 
		
		 
			 Arrays.sort(filename); 
			System.out.println("Sorting by filename in ascending order");
			for(File ff:filename){
				System.out.println(ff);
	}
	
	}
	else{
		System.out.println(f.getAbsolutePath() + " is not a directory");
	}
    }
}	
	
	
