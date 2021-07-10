package com;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

// How to Write Data in Multiple file at time

public class Wfile {
	public static void main(String[] args) throws IOException {

		/*
		 * File fi = new File("./myfiles/"); File[] files = fi.listFiles();
		 * 
		 * for (File file : files) { BufferedReader bf = new BufferedReader(new
		 * InputStreamReader(System.in));
		 * 
		 * try (FileWriter f = new FileWriter(file)) { String data = bf.readLine();
		 * f.write(data); } catch (Exception e) { e.printStackTrace(); } }
		 */

		// How To Read Multiple file Data

		/*
		 * File fi = new File("./myfiles/"); File[] files = fi.listFiles();
		 * 
		 * for (File file : files) { try (FileReader f = new FileReader(file);
		 * BufferedReader bf = new BufferedReader(f)) { String data = bf.readLine();
		 * System.out.println(data); } catch (Exception e) { e.printStackTrace(); } }
		 */

	
	
	//Q. w.a.p read multiple images from directory and create new directory and write there ?
		
		File fi = new File("./myImages/");
		File[] files = fi.listFiles();

		for (File file : files) {
             
			try (FileInputStream read=new FileInputStream(file);FileOutputStream out=new FileOutputStream("")) {
			read.read();
			out.write(null);	
			
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
	
	}
}
