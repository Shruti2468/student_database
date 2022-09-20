package student_database;

import java.util.InputMismatchException;
import java.util.Scanner;

public class studentdatabaseapp {
	public static void main(String[] args) {
		// ask number of students
		try {
		System.out.println("enter number of students to enroll: ");
		Scanner in = new  Scanner(System.in);
		int numberofstudents=in.nextInt();
		student[] students= new student[numberofstudents];
		
		for(int n=0; n< numberofstudents; n++) {
			students[n]= new student();
			students[n].enroll();
			students[n].paytuition();
			System.out.println(students[n].showinfo());
			
			
		}
		}
		catch (InputMismatchException e) {
			System.out.println("please input valid number");
			
			// TODO: handle exception
		}
	}

}
