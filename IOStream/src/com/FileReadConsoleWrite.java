package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadConsoleWrite {
public static void main(String[] args) throws IOException  {

	BufferedReader in = new BufferedReader(new FileReader("C:/Users/amarw_000/Desktop/ReactExamples/CrudReact.txt"));
	while(in.readLine()!=null) {
	String msg=	in.readLine();
	System.out.println(msg);
	}
	in.close();
	
}
}
