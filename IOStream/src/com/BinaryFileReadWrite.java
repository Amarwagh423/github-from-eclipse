package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BinaryFileReadWrite {
public static void main(String[] args) {
	
	try (FileInputStream in=new FileInputStream("C:/Users/amarw_000/Downloads/Wallpaper/brain.jpg");
			FileOutputStream out=new FileOutputStream("mybrain.jpg")){
		
		int i;
		while((i=in.read()) !=-1) {
			out.write(i);
		}
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	
}
}
