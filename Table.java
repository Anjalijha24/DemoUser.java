import java.util.Scanner;
public class Table {
    int no,i,tab;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int no=sc.nextInt();
		
		for (int i = 1; i <= 10; i++) 
		{
            int tab = no * i;
            System.out.println(tab);
	     }

}}
