package com.io;

import java.io.File;

public class FileTree {
	private int level;
	private File rootFile;
	
	public FileTree(String rootDir) {
		rootFile = new File(rootDir);
		System.out.println(rootFile.getAbsolutePath());
		printTree(rootFile);
	}

	private void printTree(File f) {
		File[] files = f.listFiles();
		for(int i=0; i<files.length; i++) {
			if(files[i].isDirectory()) {
				System.out.println(replicate("|  ",level)+"+- "+files[i].getName());
				level++;
				printTree(files[i]);
				level--;
			} else {
				System.out.println(replicate("|  ",level)+"|- "+files[i].getName());
			}
		}
	}

	private String replicate(String sign, int times) {
		StringBuffer buf = new StringBuffer();
		for(int i=0; i<times; i++) {
			buf.append(sign);
		}
		return buf.toString();
	}
	
	public static void main(String[] args) {
		//new FileTree("D:\\IIG\\Books");
		new FileTree("D:\\eCAS");
	}

}
