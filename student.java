package student_database;

import java.util.InputMismatchException;
import java.util.Scanner;

public class student {
	private String firstname;
	private String lastname;
	private int yearofstudy;
	private String courses;
	private String studentid;
	private int tuitionbalance=0;
	private int coursecost=500;
	private static int id = 1000;
	
	//contrustor to prompt user input
    public student() {
    	Scanner in = new Scanner(System.in);
    	
    	System.out.println("enter first name: ");
    	this.firstname=in.nextLine();
    	
    	System.out.println("enter last name: ");
    	this.lastname=in.nextLine();
    	
    	
    	System.out.println(" 1-1st year\n 2-2nd year\n 3-3rd year\n 4-4th year\n");
    	this.yearofstudy=in.nextInt();
    	
    	    	 setstudentid();

    }
    
 //student id 
    private void setstudentid() {
    	
    	studentid=yearofstudy+""+id;
    	id ++;
    	
    }
     
   String[]  allcourses={"science","math","english","social "};

    //enroll in course 
    public void enroll() {
    	System.out.println("courses offered are:");
		for(String i : allcourses) {
			System.out.println(i);
		}
		System.out.println("enter courses");
    	// use a loop 
    	do {  
    	
    	Scanner in = new Scanner(System.in);
    	String course =in.nextLine();
    
    	if (!course.equals("q")) {
    		if(course.equals("math")||course.equals("science")||course.equals("social")||course.equals("english")) {
    		
    		System.out.println("enter course to enroll (Q to exit)");   
    		
    		courses= "\n"+course;

    			
    		tuitionbalance=tuitionbalance+coursecost;
    		}
    	
    		 
    	}
    	
    	else {
    		break;
    	
    	}
    	}
    	while(1!=0);
    	
    	System.out.println("tuition balance: $"+tuitionbalance);
    
    }
    
    //view balance 
    public void viewbalance() {
    	System.out.println("your fee balance is: $"+ tuitionbalance);
    	}
    
    //paying tuition fee
    public void paytuition() {
    	System.out.println("enter payment: ");
    	Scanner in = new Scanner(System.in);
    	int payment=in.nextInt();		
    	tuitionbalance= tuitionbalance-payment;
    	System.out.println("thank you for your payment of $"+ payment);
    	viewbalance();
    }
    
    //show status
    public String showinfo() {
    	return "name: " +firstname +" " +lastname+
    			"\nstudent id: "+id+"\ncourses enrolled: "
         + courses+"\nfee balance: $"+tuitionbalance;
		
	}
}
