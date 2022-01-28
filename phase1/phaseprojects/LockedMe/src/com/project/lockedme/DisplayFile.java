package com.project.lockedme;

import java.io.File;

public class DisplayFile extends Path{
	void display() {
		
		File f=new File(path);
		File filename[]=f.listFiles();
 for(File ff:filename) {
 System.out.println(ff.getName());

	}
	}
}
