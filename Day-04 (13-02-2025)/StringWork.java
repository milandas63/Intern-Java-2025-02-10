package com.stringer;

public class StringWork {

	public static void main(String[] args) {
		Stretcher s = new Stretcher();
		String text = "Odisha";
		System.out.println(s.padL(text, 50, '.'));
		System.out.println(s.padC(text, 50, '.'));
		System.out.println(s.padR(text, 50, '.'));
	}

}
