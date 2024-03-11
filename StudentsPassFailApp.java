
import java.util.Scanner;

public class StudentsPassFailApp {

	public static void main(String[] args) {
         
		Scanner sc = new Scanner(System.in);      
		
		int s1,s2,s3,s4,s5,s6,agg,per;
		
		System.out.println("Enter the marks of 6 subject");
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
		s4=sc.nextInt();
		s5=sc.nextInt();
		s6=sc.nextInt();
		
		agg=s1+s2+s3+s4+s5+s6;
		
		System.out.println("Total marks of student="+agg);
		
		per=agg/6;
		
		if(per>40)
		{
			System.out.println("Student is Pass");
		}
		else
		{
			System.out.println("Student is Fail");
		}
		

	}

}
