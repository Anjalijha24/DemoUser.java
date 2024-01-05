import java.util.Scanner;
class Price
{

     public static void main(String[] args)
     {
          int sp,cp,profit;
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the selling price:");
          sp=sc.nextInt();
          System.out.println("Enter the cost price:");
          cp=sc.nextInt();
          profit=sp-cp;
          System.out.println("The profit is:"+profit);
      }
}