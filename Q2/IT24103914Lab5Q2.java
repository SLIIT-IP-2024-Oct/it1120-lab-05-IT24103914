import java.util.Scanner;

public class IT24103914Lab5Q2 {
    public static void main(String[] args) { 
        
       // Declare variables
       int newMembers;
       String prize;

       // Create a Scanner object to read input
       Scanner input = new Scanner(System.in);

       // Prompt the user to enter the number of new members introduced
       System.out.print("Enter the number of new members introduced:");
       newMembers = input.nextInt();

       // Validate that the number of new member is non-negative
       if (newMembers >= 0) {
           //Switch statement to determine the prize based on the number of new members
           switch (newMembers) {
             case 0:
                 System.out.println("No Prize");     
                 break;

             case 1:
                 System.out.println("Prize is a:" + "Pen");     
                 break;

             case 2:
                 System.out.println("Prize is a:" + "Umbrella");     
                 break;

             case 3:
                 System.out.println("Prize is a:" + "Bag");     
                 break;

             case 4:
                 System.out.println("Prize is a:" + "Travelling Chair");     
                 break;
           
             default:
                 System.out.println("Prize is a:" + "Headphone");
                 break;
           }
       } else {
           System.out.println("Input must be a number 0 or greater");
       }
    }
}
