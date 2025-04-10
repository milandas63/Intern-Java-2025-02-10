package com.thread;

public class Example2 implements Runnable {
	private String color[] = {"Red","Green","Blue","Purple","Black","Yellow","White","Magenta","Cyan","Brown","Pink","Orange","Gray","Transperant"};
	private String num[] = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen"};

	public Example2() {
		Thread t = new Thread(this);
		t.start();
		
		for(String x:color) {
			System.out.print(x+" ");
		}
	}

	public static void main(String[] args) {
		new Example2();
	}

	@Override
	public void run() {
		for(String x:num) {
			System.out.print(x+" ");
		}
	}

}
