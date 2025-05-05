package com.collection;

import java.util.Vector;

public class Array2Vector {
	public Array2Vector() {
		System.out.println("CREATE AN ARRAY");
		String[][] students = 
		{
			{"Slno","Name","Gender","Subject"},
			{"1","Milan Das","Male","Java"},
			{"2","Chinmay Rout","Male","Java"},
			{"3","Suraj Samal","Male","Java"},
			{"4","Sonali Das","Female","Java"},
			{"5","Barshita Pattnaik","Female","Java"}
		};

		System.out.println("PRINT FROM ARRAY");
		for(int i=0; i<students.length; i++) {
			String[] row = students[i];
			for(int j=0; j<students[i].length; j++) {
				System.out.print(students[i][j]+", ");
			}
			System.out.println();
		}
		
		System.out.println("STORE INTO VECTOR");
		Vector<Vector<String>> vStudents = new Vector<Vector<String>>();
		Vector<String> vRow;
		for(int i=0; i<students.length; i++) {
			vRow = new Vector<String>();
			for(int j=0; j<students[i].length; j++) {
				vRow.add(students[i][j]);
			}
			vStudents.add(vRow);
		}

		System.out.println("PRINT FROM VECTOR");
		for(int i=0; i<vStudents.size(); i++) {
			vRow = vStudents.get(i);
			for(int j=0; j<vRow.size(); j++) {
				System.out.print(vRow.get(j)+"  ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Array2Vector();
	}

}
