package com.algorithm;

public class Occurances {

	public static void main(String[] args) {
		String text = "Students Allowed";
		int count[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		char each;
		int n;
		for(int i=0; i<text.length(); i++) {
			each = text.charAt(i);
			if(each>=65 && each<=90) {
				n = each-65;
				count[n]++;
			} else if(each>=97 && each<=122) {
				n = each-97;
				count[n]++;
			}
		}
		
		for(int i=0; i<count.length; i++) {
			if(count[i]>0) {
				System.out.println((char)(i+65) + " = " + count[i]);
			}
		}
	}

}
