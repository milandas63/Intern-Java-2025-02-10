package com.gui;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
	private Class obj;
	private String help;
	private StringBuffer buf;

	public Reflection(String cName) {
		try {
			buf = new StringBuffer();
			obj = Class.forName(cName);
			Field[] f = obj.getDeclaredFields();
			Constructor[] c = obj.getDeclaredConstructors();
			Method[] m = obj.getDeclaredMethods();

			// Print heading
			buf.append(cName+"\r\n");
			for(int i=0; i<cName.length(); i++) buf.append("-");
			buf.append("\r\n");

			// Print field list
			if(f.length>0) {
				buf.append("FIELDS:\r\n");
				for(int i=0; i<f.length; i++) {
					buf.append((i+1)+": "+remove(f[i].toString())+"\r\n");
				}
			}

			// Print Constructors list
			if(c.length>0) {
				buf.append("CONSTRUCTOR:\r\n");
				for(int i=0; i<c.length; i++) {
					buf.append((i+1)+": "+remove(c[i].toString())+"\r\n");
				}
			}

			// Print Methods list
			if(m.length>0) {
				buf.append("METHODS:\r\n");
				for(int i=0; i<m.length; i++) {
					buf.append((i+1)+": "+remove(m[i].toString())+"\r\n");
				}
			}
			buf.append("\r\n\r\n");
			help = buf.toString();
		} catch(ClassNotFoundException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
	}

	public String getHelpText() {
		return help;
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
}
