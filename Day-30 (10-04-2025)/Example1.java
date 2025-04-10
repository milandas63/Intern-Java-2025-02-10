package com.thread;

public class Example1 extends Thread {
	private String color[] = {"Red","Green","Blue","Purple","Black","Yellow","White","Magenta","Cyan","Brown","Pink","Orange","Gray","Transperant"};
	private String num[] = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen"};

	public Example1() {
		this.start();
		for(String x:color) {
			System.out.print(x+" ");
		}
	}
	
	@Override
	public void run() {
		Thread t = new AnotherThread();
		t.start();

		for(String x:num) {
			System.out.print(x+" ");
		}
	}

	public static void main(String[] args) {
		new Example1();
	}
}
