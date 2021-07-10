package com;

import java.io.*;
import java.util.Scanner;

public class ConsoleRead {
	public static void main(String[] args) throws IOException {

		try(BufferedReader bf=new BufferedReader(new FileReader("pravin.txt"));
				FileWriter ff=new FileWriter("soheel.txt")) {
			
			String msg=null;
			
			while((msg=bf.readLine())!=null) {
				ff.write(msg+"\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
