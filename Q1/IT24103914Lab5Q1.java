import java.util.Scanner;

public class IT24103914Lab5Q1 {
    public static void main(String[] args) { 
        
       // Declare variables
       int num1, num2, num3, smallest, largest;

       // Create a Scanner object to read input
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the first integer:");
       num1 = input.nextInt();

       System.out.print("Enter the second integer:");
       num2 = input.nextInt();

       System.out.print("Enter the third integer:");
       num3 = input.nextInt();

       // Compute the smallest and largest numbers
       smallest = num1;
       largest = num1;

       if (num2 < smallest) {
           smallest = num2;
       }
       if (num3 < smallest) {
           smallest = num3;
       }

       if (num2 > largest) {
           largest = num2;
       }
       if (num3 > largest) {
           largest = num3;
       }

       // Output the results
       System.out.println("User entered numbers are:" + num1 +" "+ num2 +" "+ num3);
       System.out.println("The Smallest number is:" + smallest);
       System.out.println("The Largest number is:" + largest);
    }
}
        