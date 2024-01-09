import java.util.Scanner;

public class Hotel {

	public static void main(String[] args) {
		
		int choice,ch1;
		char ans;
		double total =0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Anjali Hotel");
		do
		{
			System.out.println("1:Starters\n2:Main Course\n3:Deserts\n4:Drink");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
					System.out.println("Starters:");
					System.out.println("1:masala papad      30Rs.");
					System.out.println("2:paneer masala     80Rs.");
					System.out.println("3:roasted papad     200Rs.");
					System.out.println("4:paneer pakodi     50Rs.");
					ch1=sc.nextInt();
					
					switch(ch1) {
					case 1:
						total+=30;
						break;
					case 2:
						total+=80;
						break;
					case 3:
						total+=200;
					case 4:
						total+=50;
					}
				break;
				
			
				
			case 2:
				System.out.println("Main course:");
				System.out.println("1:pannertikka      200Rs.");
				System.out.println("2:veg kholahpuri   150Rs.");
				System.out.println("3:mushroom         100Rs.");
				System.out.println("4:veg mix          120Rs.");
				ch1=sc.nextInt();
				
				switch(ch1) {
				case 1:
					total+=200;
					break;
					
				case 2:
					total+=150;
					break;
					
				case 3:
					total+=100;
					break;
					
				case 4:
					total+=120;
					break;
					
				}
			break;
			case 3:
				System.out.println("Deserts:");
				System.out.println("1:Butter scotch   40Rs.");
				System.out.println("2:kaju badam      40Rs.");
				System.out.println("3:badam pista     40Rs.");
				System.out.println("4:kivi            50Rs.");
				ch1=sc.nextInt();
				
				switch(ch1) {
				case 1:
					total+=40;
					break;
					
				case 2:
					total+=40;
					break;
					
				case 3:
					total+=40;
					break;
					
				case 4:
					total+=50;
					break;
					
				}
			break;
			case 4:
				System.out.println("Drinks:");
				System.out.println("1:pepsi           40Rs.");
				System.out.println("2:soda            30Rs.");
				System.out.println("3:badam dudh      40Rs.");
				System.out.println("4:nimbu pani      30Rs.");
				ch1=sc.nextInt();
				
				switch(ch1) {
				case 1:
					total+=40;
					break;
					
				case 2:
					total+=30;
					break;
					
				case 3:
					total+=40;
					break;
					
				case 4:
					total+=30;
					break;
					
				}
			break;
			default:
				System.out.println("Invalid choice");
				break;
			}
			
			System.out.println("Do you want to add any other item Y/N");
			ans=sc.next().charAt(0);
		}
		while(ans=='Y'||ans=='y');
		
		System.out.println("Thans for coming\nVisit again :)");
		
	System.out.println("total price: Rs."+total);
		
	}

}









