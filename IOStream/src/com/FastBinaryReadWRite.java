package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FastBinaryReadWRite {
	public static void main(String[] args) {
		
		try (FileInputStream in=new FileInputStream("C:/Users/amarw_000/Downloads/Wallpaper/brain.jpg");
				FileOutputStream out=new FileOutputStream("mybrain.jpg")){
			
			byte[] image= new byte[in.available()];
			in.read(image);
			out.write(image);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
