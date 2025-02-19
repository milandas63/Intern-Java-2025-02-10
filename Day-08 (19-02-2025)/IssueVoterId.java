package com.exception;

public class IssueVoterId {
	int[] ages = {25,67,87,66,12,52,31,99,11,90,83,-21,55,61,0,35,49,10,91,18,0,-31};

	public IssueVoterId() {
		for(int age:ages) {
			try {
				checkAge(age);
				System.out.println(age + " is a valid age");
			} catch(NegativeAgeException e) {
				System.err.println(age + " " + e.getMessage());
			} catch(ZeroAgeException e) {
				System.err.println(age + " " + e.getMessage());
			} catch(TooYoungAgeException e) {
				System.err.println(age + " " + e.getMessage());
			} catch(TooOldAgeException e) {
				System.err.println(age + " " + e.getMessage());
			} catch(Exception e) {
			}
		}
	}
	
	private void checkAge(int age) throws NegativeAgeException,
										  ZeroAgeException,
										  TooYoungAgeException,
										  TooOldAgeException {
		if(age<0)  throw new NegativeAgeException("age is less than zero");
		if(age==0) throw new ZeroAgeException("age is equals to zero");
		if(age<18) throw new TooYoungAgeException("age is less than 18");
		if(age>90) throw new TooOldAgeException("age is greater than 90");
	}

	public static void main(String[] args) {
		new IssueVoterId();
	}

}
