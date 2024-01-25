import java.util.Scanner;

public class Student_Detail {

private String name;        //holds the student name
private int age;            //holds the student age
private double contactno;   //holds the student contact no
private String address;

public static void main(String[] args) {
	
	
	Scanner sc=new Scanner(System.in);
	Student_Detail student=new Student_Detail();   //create a new student detail object
	while(true) {
		System.out.println("enter your choice:");      //prompt the user to enter their choice
		System.out.println("1. Insert student details:");
		System.out.println("2. Delete student details:");
		System.out.println("3. Update student Details:");
		
		int choice=sc.nextInt();
		
		
		switch (choice) {     //case 1 for inserting the details of students
        case 1:
            System.out.println("Enter student name:");
            String name = sc.next();
            System.out.println("Enter student age:");
            int age = sc.nextInt();
            System.out.println("Enter student contact number:");
            long contactNo = sc.nextLong();
            System.out.println("Enter student address:");
            String address = sc.next();

            
            break;
        case 2:
            // case2 for implement delete student details logic here

        	if(student!=null) {
        	student = null;   //delete the student details by setting the student object to null    
        	System.out.println("Students details deleted");
        	}

        	else
                {
        	System.out.println("no student details found");
        	}
            break;
        case 3:
            //case3 for implement update student details logic here

        	if(student!=null) 
                 {
        		System.out.println("Enter the update student name");
        		student.name=sc.next();
        		System.out.println("Enter updated student age");
        		student.age=sc.nextInt();
        		System.out.println("Enter updated student contactno");
        		student.contactno=sc.nextInt();
        		System.out.println("Enter updated student address");
        		student.address=sc.next();
        	}	
            break;
        

        default:   
            System.out.println("Invalid choice");
            break;
    }
}}


}