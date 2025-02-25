package com.io;

import java.io.*;

public class DataInput {
	private BufferedReader br;
	private BufferedWriter bw;
	private boolean more;
	private String name, father, gender, dob, email, mobile;
	private StringBuffer buf;
	
	public DataInput() {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("student.csv")));
			more = true;
			while(more) {
				for(int i=0; i<35; i++) System.out.println();
				
				System.out.println("STUDENT INFORMATION SYSTEM");
				System.out.println("--------------------------");
				System.out.println();
				System.out.print("1. Student's Name: ");
				name = br.readLine();
				System.out.print("2. Father's Name:  ");
				father = br.readLine();
				System.out.print("3. Gender:         ");
				gender = br.readLine();
				System.out.print("4. Date-of-Birth:  ");
				dob = br.readLine();
				System.out.print("5. Email-id:       ");
				email = br.readLine();
				System.out.print("6. Mobile No.:     ");
				mobile = br.readLine();
				
				buf = new StringBuffer();
				buf.append(name+",");
				buf.append(father+",");
				buf.append(gender+",");
				buf.append(dob+",");
				buf.append(email+",");
				buf.append(mobile+"\r\n");
				bw.write(buf.toString());
				
				System.out.println();
				System.out.println();
				System.out.print("More [y/n]: ");
				more = br.readLine().toUpperCase().startsWith("Y");
			}
			br.close();
			bw.close();
		} catch(IOException e) {
		}
	}

	public static void main(String[] args) {
		new DataInput();
	}

}
