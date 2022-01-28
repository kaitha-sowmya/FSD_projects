package com.practice.files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
      public static void main(String[] args) {
try {
FileWriter writer = new FileWriter("D://filepath//testFile3.txt", true);
writer.write("   I am sowmya ");
writer.write(" writing to this file ");
writer.write(" Good Bye! ");
writer.close();
} 
catch (IOException e) {
e.printStackTrace();
}
}
}