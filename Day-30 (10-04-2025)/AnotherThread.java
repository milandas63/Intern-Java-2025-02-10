package com.thread;

public class AnotherThread extends Thread {
	private String rank[] = {"These","are","text","written","to","test","the","Thread","performance","in","Java","Programming","language"};
	public void run() {
		for(String x:rank) {
			System.out.print(x+" ");
		}
	}
}
