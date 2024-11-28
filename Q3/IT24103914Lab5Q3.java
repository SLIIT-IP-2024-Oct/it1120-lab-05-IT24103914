import java.util.Scanner;

public class IT24103914Lab5Q3 {
    public static void main(String[] args) { 
        
       // Declare variables
       int startDate, endDate, numDays;
       double totalAmount;

       // Create a Scanner object to read input
       Scanner input = new Scanner(System.in);

       // Input start and end dates
       System.out.print("Enter Start Date (1-31):");
       startDate = input.nextInt();
       System.out.print("Enter End Date (1-31):");
       endDate = input.nextInt();

       // Validate input dates
       if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
           System.out.println("Error: Days must be between 1 and 31");
           return; 
       }

       if (startDate >= endDate) {
           System.out.println("Error: Start Date must be less than End Date");
           return;
       }
 
       // Calculate number of days reserved
       numDays = endDate - startDate;

       // Calculate total amount with discount based on the number of days
       int roomRate = 48000;
       if (numDays < 3) {
           totalAmount = numDays * roomRate;
       }
       else if (numDays >= 3 && numDays <= 4) {
           totalAmount = numDays * roomRate * 0.9;
       }
       else {
           totalAmount = numDays * roomRate * 0.8;
       }

       System.out.println("Room Charge Per Day: Rs.48000.0/=");
       System.out.println("Number of Days Reserved:" + numDays);
       System.out.println("Total Amount to be Paid:" + totalAmount);
    }
}
           
