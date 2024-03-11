import java.util.Scanner;

public class ProfitLossApp {

	public static void main(String[] args) {
         
		Scanner sc = new Scanner(System.in);      
		
		int sp,cp;
		
		System.out.println("Enter the selling price");
		sp=sc.nextInt();
		
		
		
		System.out.println("Enter the cost price");
		cp=sc.nextInt();
		
		if(sp>cp)//(profit=sp-cp)
		{
			System.out.printf("profit\n",sp-cp);
		}
		else//(loss=cp-sp)
		{
			System.out.printf("loss\n",cp-sp);
		}
		
		
	}
}