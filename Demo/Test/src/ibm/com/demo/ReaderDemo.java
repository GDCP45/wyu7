package ibm.com.demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class ReaderDemo {
public static void main(String[] args) throws IOException {
	File f = new File("d:/IBM/IO"+ File.separator+"test.txt");
	Reader input = new FileReader(f);
	char[] c = new char[1024];
	int len = input.read(c);
	System.out.println(new String(c,0,len));
	
}
}
