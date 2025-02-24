package com.io;

import java.io.File;
import java.io.IOException;

public class FileClass {

	public static void main(String[] args) throws IOException {
        File f = new File("readme.txt");
        System.out.println("exists: " + f.exists());
        System.out.println("getAbsoluteFile: " + f.getAbsoluteFile());
        System.out.println("getAbsolutePath: " + f.getAbsolutePath());
        System.out.println("getCanonicalFile: " + f.getCanonicalFile());
        System.out.println("getCanonicalPath: " + f.getCanonicalPath());
	}

}