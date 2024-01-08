import java.util.Scanner;

class Switch {

	public static void main(String[] args) 
	{
		
		int choice,num,m1,m2,m3,m4,m5,Total,per,res,num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1:no is even or odd \r\n""2: Find out the grade (accept marks of 5 subject)\r\n"+"3: Accept no and find out cube if no is divisible by\r\n"+"4: Accept 3 no from user and find out the greatest");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			
		System.out.println("Enter the  number" );
		num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("the number is even");
		}
		else
		{
			System.out.println("the number is odd");
		}
		break;
	 
		case 2:
		
		System.out.println("enter the marks of five subject");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		m4=sc.nextInt();
		m5=sc.nextInt();
		
		Total=(m1+2+m3+m4+m5);
		per=Total/5;
		
		System.out.println("total marks:"+Total);
		
		if(per>=70)
		{
		System.out.println("The grade is A");
	    }
	 else if(per>=50)
		{
		System.out.println("The grade is A");
	    }
	 else if(per>=35)
		{
		System.out.println("The grade is pass");
	    }
	 else 
		{
		System.out.println("The grade is fail");
	    }
		
		break;
		
		case 3:
			System.out.println("Enter the  number" );
			num=sc.nextInt();
			
			if(num%5==0)
		{		
			{
				res=num*num*num;
			}
			System.out.println("cube is:+res");
	        	
		}
			else
			{
				System.out.println("no is not divisible by 5");
			}
			break;
			
		case 4:
		
		System.out.println("enter the value of num1=");
		num1=sc.nextInt();
		System.out.println("enter the value of num2=");
		num2=sc.nextInt();
		System.out.println("enter the value of num3=");
		num3=sc.nextInt();
		
		if (num1>num2 && num1>num3)
		
		{
			System.out.println("num1 is greater");
		}
		else if(num2>num1 && num3>num2)
		{
			System.out.println("num2 is greater");
		}
		else if(num3>num1 && num3>num2)
		{
			System.out.println("num3 is greater");
		}	
		else
		{
			System.out.println("Invalid");
		}
		
		break;	
	
	default:
		System.out.println("your enter invalid choice");
		break;
	}
}
}

