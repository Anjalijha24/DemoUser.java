import java.util.Scanner;
class Circle
{
   public static void main(String args[])
 {
    double r,c;
    Scanner sc = new Scanner(System.in);
  
    System.out.println("Enter the radius:");
    r=sc.nextDouble();

    c=2*3.14*r;
    System.out.println("circumference of the circle is "+c);
 }
}