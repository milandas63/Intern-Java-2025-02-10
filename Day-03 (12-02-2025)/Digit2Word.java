package com.array;

public class Digit2Word {
	public static void main(String[] args) {
		String[] numbers = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		String n = "564371";
		char c;
		int each;
		for(int i=0; i<n.length(); i++) {
			c = n.charAt(i);
			//each = Integer.parseInt(String.valueOf(c));
			each = (int)(c-48);
			System.out.print(numbers[each]+" ");
		}
	}
}
