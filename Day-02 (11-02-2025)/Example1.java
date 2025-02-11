package com.array;

public class Example1 {
	
	public Example1() {
		print_days(new String[] {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"});
	}

	public static void main(String[] args) {
		String[] week_days = new String[7];
		new Example1();
	}

    public void print_days(String[] week_days) {
        for(int i=0; i<week_days.length; i++) {
            System.out.println(week_days[i]);
        }
        String[][] members = new String[4][5];
        String[] members_all[] = new String[][] { {"","","","",""},
	                                              {"","","",""},
	                                              {"","",""},
	                                              {"","","","",""}
                                                };

    }
}
