package com.stringer;

public class Stretcher {
	public String stretch(String data, int width, char side, char padChar) {
		StringBuffer buf = new StringBuffer(data);
		for(int i=buf.length(); i<width; i++) {
			switch(side) {
			case 'L': buf.insert(0, padChar); break;
			case 'R': buf.append(padChar);    break;
			case 'C': if(i%2==0) {
						 buf.insert(0, padChar);
					  } else {
						 buf.append(padChar);
					  }
			          break;
			}
		}
		return buf.toString();
	}
	
	public String stretch(String data, int width, char side) {
		return stretch(data, width, side, ' ');
	}
	//////////////////////////////////////////////////////
	public String padL(String data, int width) {
		return stretch(data, width, 'L', ' ');
	}

	public String padL(String data, int width, char padChar) {
		return stretch(data, width, 'L', padChar);
	}
	//////////////////////////////////////////////////////
	public String padR(String data, int width) {
		return stretch(data, width, 'R', ' ');
	}
	public String padR(String data, int width, char padChar) {
		return stretch(data, width, 'R', padChar);
	}
	//////////////////////////////////////////////////////
	public String padC(String data, int width) {
		return stretch(data, width, 'C', ' ');
	}
	public String padC(String data, int width, char padChar) {
		return stretch(data, width, 'C', padChar);
	}
}
