package com.array;

public class BorderAround {

	public static void main(String[] args) {
		String text = "The war of Russia and Ukrain ends";
		String words[] = text.split(" ");
		int size = 0;
		for(String x:words) {
			if(size<x.length()) {
				size = x.length();
			}
		}
		System.out.println(replicate("*", size+4));
		for(String x:words) {
			System.out.println("* " + padR(x,size)+ " *");
		}
		System.out.println(replicate("*", size+4));
	}

	private static String replicate(String data, int length) {
		String value = "";
		for(int i=0; i<length; i++) value = value + "*";
		return value;
	}
	
	private static String padR(String data, int width) {
		String value = data;
		for(int i=value.length(); i<width; i++) {
			value = value + " ";
		}
		return value;
	}

}
