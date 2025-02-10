package com.forloop;

public class Tables {

	public static void main(String[] args) {
		int start = 2;
		int end = 35;
		
		for(int i=start; i<=end; i++) {
			for(int j=1; j<=10; j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------");
		
		for(int i=1; i<=10; i++) {
			for(int j=start; j<=end; j++) {
				System.out.print(j + " x " + i + " = " + (i*j) + "  ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------");

		for(int i=start; i<=end; i+=6) {
			for(int j=1; j<=10; j++) {
				for(int k=i; k<(i+6); k++) {
					if(k>end) break;
					System.out.print(padL(k,2) + " x " + padL(j,2) + " = " + padL((k*j),3) + "  ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
	
	public static String padL(int n, int w) {
		String buf = ""+n;
		for(int i=buf.length(); i<w; i++) buf = " "+buf;
		return buf;
	}

}
