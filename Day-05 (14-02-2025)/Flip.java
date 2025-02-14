package com.algorithm;

public class Flip {

	public static void main(String[] args) {
		String text = "Quick Brown Fox Jumps Over The Lazy Dog";
		StringBuffer buffer = new StringBuffer();
		char each;
		for(int i=0; i<text.length(); i++) {
			each = text.charAt(i);
			if(each>=65 && each<=90) {
				each = (char)(each+32);
			} else if(each>=97 && each<=122) {
				each = (char)(each-32);
			}
			buffer.append(each);
		}
		System.out.println(buffer);
	}

}
