import java.util.Scanner;
 class Assign {

	public static void main(String[] args) 
{
		int num1=10,num2=5;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		num1+=num2;
		System.out.println("After addition assignment, num1 =" + num1);
		num1-=num2;
		System.out.println("After substraction assignment, num1 =" +num1);
		num1*=num2;
		System.out.println("After multiplication assignment, num1 =" + num1);
		num1/=num2;
		System.out.println("After division assignment, num1 =" + num1);
		num1%=num2;
		System.out.println("After modulo assignment, num1 =" + num1);
		
		
		
	}

}
