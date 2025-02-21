package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {
	String inFile = "classes.txt";
	String outFile = "c.txt";

	private InputStream in;
	private OutputStream out;
	
	public CopyFile() {
		try {
			File f = new File(inFile);
			long fileSize = f.length();
			double file5pc = fileSize * .05;

			long count = 0;
			in = new FileInputStream(inFile);
			out = new FileOutputStream(outFile);

			int r;
			while( (r=in.read()) != -1 ) {
				out.write(r);
				count++;
				if(count>=file5pc) {
					System.out.print(".");
					count = 0;
				}
			}
			
			out.close();
			in.close();
		} catch(FileNotFoundException e) {
		} catch(IOException e) {
		} catch(Exception e) {
		}
	}

	public static void main(String[] args) {
		new CopyFile();
	}

}
