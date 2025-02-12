package com.algorithm;

public class PrimeNo {
	public static void main(String[] args) {
		int start = 1500;
		int end = 3000;
		boolean yesNo;
		int count = 0;
		
		for(int i=start; i<=end; i++) {
			yesNo = true;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					yesNo = false;
					break;
				}
			}
			if(yesNo) {
				System.out.print(i+"  ");
				count++;
				if(count>9) {
					count = 0;
					System.out.println();
				}
			}
		}
	}
}
