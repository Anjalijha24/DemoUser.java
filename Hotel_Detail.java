import java.util.*;             //importing scanner header file to take input from user
public class Hotel_Detail {

	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) { //main function
		Hotel_Detail obj=new Hotel_Detail();//function calling syntax
		obj.roomList(); 
		

	}
          public void roomList() {
	
           //create an array to store the room
	
	         String[] roomList= {"Luxury","A/C","Non A/C", "Deluxe"};
	         int[] roomCosts= {2500,2000,1500,1800};
 
	         //Get user input
	         
	          System.out.println("Welcome to the Hyatt Hotel! please select a room type:");  
	          for(int i=0;i<roomList.length;i++) 
	         {
	        	 
	        	 System.out.println((i+1)+"."+roomList[i]+"-"+roomCosts[i]+"per day");
	         }
			
             //get the user choice  which type of room they want
	        	System.out.print("Enter the rooom number:"); 
	        	int roomChoice=sc.nextInt();
	        	
            //check whether the room list is valid or not using conditional statement
	        	
	        	if(roomChoice>=1 && roomChoice<=roomList.length)
	        	{
	        		String selectedRoomType=roomList[roomChoice-1];
	        		int selectedRoomCost=roomCosts[roomChoice-1];
	        		
	        		System.out.println("Enter the number of days you stay");
	        		int numDays=sc.nextInt();//by using scanner we can take input
	        		
	        		//display the reservation detail
	        		
	        		System.out.println("thankyou gor choosing Hyatt Hotel");
	        	
	        		
	        		System.out.println("you have selected"+selectedRoomType+"for"+selectedRoomCost+"per day.");
	        		System.out.println("your reservation is confirmed. Enjoy you stay");
	        		
	         }
	        	else
	        	{
	        		System.out.println("Invalid room number. please try again");
          }
	        	 
	        	 
	         }
	         

}

