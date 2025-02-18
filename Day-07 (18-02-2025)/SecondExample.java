package com.exception;

public class SecondExample {
	public static void main(String[] args) {
		int n = 369;
		int d = 0;
		String text = "Hello World";
		int index = 25;
		String[] colors = {"Red","Green","Blue","White","Black"};
		int pos = 11;
		String number = "45O6";
		
		for(int i=0; i<3; i++) {
			try {
				//Class.forName("");
				
				double r = n/d;
				System.out.println(r);
				
				char c = text.charAt(index);
				System.out.println(c);
				
				String color = colors[pos];
				System.out.println(color);
				
				int num = Integer.parseInt(number);
				System.out.println(num);
			} catch(ClassCastException e) {
				System.out.println("Class Cast Exception: "+e);
			} catch(ArithmeticException e) {
				System.out.println("Arithmetic Exception: "+e);
				d=3; i--; 
			} catch(NullPointerException e) {
				System.out.println("Null Pointer Exception: "+e);
			} catch(StringIndexOutOfBoundsException e) {
				System.out.println("String Index Out Of Bounds Exception: "+e);
				index = 9; i--;
			} catch(NumberFormatException e) {
				System.out.println("Number Format Exception: "+e);
				number = "4506"; i--;
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Array Index Out Of Bounds Exception: "+e);
				pos = 3; i--;
			} catch(SeriousException e) {
			}
			System.out.println("-----------------------------------------------------");
		}
	}
}
