package com.reflectoin;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
	private Class obj;

	public Reflection() {
		try {
			String cName = "java.lang.String";

			obj = Class.forName(cName);
			Field[] f = obj.getDeclaredFields();
			Constructor[] c = obj.getDeclaredConstructors();
			Method[] m = obj.getDeclaredMethods();

			// Print heading
			System.out.println(cName);
			for(int i=0; i<cName.length(); i++) System.out.print("-");
			System.out.println();

			// Print field list
			if(f.length>0) {
				System.out.println("FIELDS:");
				for(int i=0; i<f.length; i++) {
					//System.out.println((i+1)+": "+f[i]);
					System.out.println((i+1)+": "+remove(f[i].toString()));
				}
			}

			// Print Constructors list
			if(c.length>0) {
				System.out.println("CONSTRUCTOR:");
				for(int i=0; i<c.length; i++) {
					//System.out.println((i+1)+": "+c[i]);
					System.out.println((i+1)+": "+remove(c[i].toString()));
				}
			}

			// Print Methods list
			if(m.length>0) {
				System.out.println("METHODS:");
				for(int i=0; i<m.length; i++) {
					//System.out.println((i+1)+": "+m[i]);
					System.out.println((i+1)+": "+remove(m[i].toString()));
				}
			}
		} catch(ClassNotFoundException e) {
		} catch(Exception e) {
		}
	}

	private String remove(String line) {
		StringBuffer buf = new StringBuffer();
		boolean yn = true;
		char each;
		
		for(int i=line.length()-1; i>=0; i--) {
			each = line.charAt(i);
			switch(each) {
			case '.': yn = false; break;
			case ' ': yn = true; break;
			case ',': yn = true; break;
			case ')': yn = true; break;
			case '(': yn = true; break;
			case ']': yn = true; break;
			case '[': yn = true; break;
			}
			
			if(yn) {
				buf.insert(0,each);
			}
		}
		return buf.toString();
	}
	
	public static void main(String[] args) {
		new Reflection();
	}

}
