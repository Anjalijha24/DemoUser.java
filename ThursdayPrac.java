import java.util.Scanner;

public class ThursdayPrac {
	
	public static void main(String[] args)
	{
		int choice,num;
		String monthName;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1:Accept no and check it is prime no or not\r\n"+"2:Accept no and find out the SUM of DIGIT \r\n"+"3:Accept a no from the user and  display the fibonacci series(0 1 1 2 3 5 .....)\r\n"+"4: Accept no from user and check it is armstrong or not\r\n"+"5:Accept 5 no and find out the greatest\r\n"+"6: Accept a no from the user and display the month name\r\n"+"7: Accept choice from user and create CALC");
	     choice=sc.nextInt();
	switch(choice)
	{
	case 1:
		System.out.println("Enter a number");
		num=sc.nextInt();
		
		int check=0;
		for(int i=1;i<=num;i++)
		{
			check++;
		}
		
		if(check==2)
		{
			System.out.println("Number is prime.");
		}
		else
		{
			System.out.println("number is not prime.");
		}
		break;
		
	case 2:
	System.out.println("enter a number:");
	int number = sc.nextInt();
	    
	    int sum=0;
	    int digit;
	    
	    while(number!=0)
	    {
	    	digit=number%10;
	    	sum+=digit;
	    	number/=10;
	    }
	    System.out.println("The sum of the digits is:"+sum);
		
		break;
		
	case 3:
		int n=10, firstTerm = 0, secondTerm = 1;
		
		System.out.println("The fibonacci series till" + n +" terms:");
		
		for(int i=1;i<=n;++i)
		{
			System.out.println(firstTerm +" ");
		}
		
		
        int nextTerm = firstTerm+secondTerm;
              
        firstTerm = secondTerm;
        secondTerm = nextTerm;
        
        break;
        
	case 4:
		
		int  originalNumber, remainder,result=0;
		System.out.println("Enter a number");
		int number1=sc.nextInt();
		
		originalNumber = number1; 
				
				
				while (originalNumber!=0)
				{
					remainder = originalNumber % 10;
					result += Math.pow(remainder, 3);
				originalNumber /= 10;
 				}
	
        if(result==number1)
        	System.out.println(number1 + "is an Armstrong number.");
        else
        	System.out.println(number1 + "is not an Armstrong number.");
	
	break;
	
	case 5:
			
		int greatest = Integer.MIN_VALUE;
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Enter number"+i+": ");
			
			int number2=sc.nextInt();
		
	      if(number2>greatest) {
	      
	    	  greatest=number2;
	      }
	
	}
	System.out.println("The greatest number is:"+greatest);
	break;
	
	case 6:
		
		System.out.println("Enter a number between 1 and 12:");
		int monthNumber = sc.nextInt();
		
	   switch(monthNumber)
	   {
	   case 1:
		   monthName="january";
		   break;
		   
	   case 2:
		   monthName="february";
		   break;
		   
	   case 3:
		   monthName="march";
		   break;
		   
	   case 4:
		   monthName="april";
		   break;
		   
	   case 5:
		   monthName="may";
		   break;
		   
	   case 6:
		   monthName="june";
		   break;
		   
	   case 7:
		   monthName="july";
		   break;
		   
	   case 8:
		   monthName="august";
		   break;
		   
	   case 9:
		   monthName="september";
		   break;
		   
	   case 10:
		   monthName="october";
		   break;
		   
	   case 11:
		   monthName="November";
		   break;
		   
	   case 12:
		   monthName="december";
		   break;
		   
		   default:
			   monthName= "Invalid month number";
	   }
	   System.out.println("the month name is: "+monthName);
		break;
		
	case 7:
		

		
		System.out.println("Enter the operration(+,-,/,%,*):");
		
		char operation=sc.next().charAt(0);
		
		int result1;
		
		System.out.println("Enter the two number:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		
		switch(operation)
		{
		case'+':
			result1=num1+num2;
			System.out.println("the result1 of addition is:"+result1);
			
			break;
			
		case'-':
			result1=num1-num2;
			System.out.println("the result1 of addition is:"+result1);
			
			break;
			
		case'/':
			result1=num1/num2;
			System.out.println("the result1 of addition is:"+result1);
			
			break;
			
		case'%':
			result1=num1%num2;
			System.out.println("the result1 of addition is:"+result1);
			
			break;
			
		case'*':
			result1=num1*num2;
			System.out.println("the result1 of addition is:"+result1);
			
		break;
			
		
   default:
	System.out.println("your enter invalid choice");
	break;
		}
		
	}

	}
}
	

		