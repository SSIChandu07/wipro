/*Question 1
Marks: 1/1

7. Arithmetic Operators in Java
Instructions:

Write a program that takes two numbers as input from the user and performs arithmetic operations on them using the arithmetic operators (sum, difference, product, quotient, remainder) in Java.

Examples:

# Examples: 
1. int num1 = 10; 
   int num2 = 5; 
   int sum = num1 + num2; 
   System.out.println(sum); // Output: 15  
Sample Input & Output:

Sample Input:
Enter the first number: 10
Enter the second number: 5

Sample Output:
Sum: 15
Difference: 5
Product: 50
Quotient: 2
Remainder: 0
Hints:
1. Use the Scanner class to read input from the user.
2. Declare variables to store the input values and the results of the arithmetic operations.
3. Use the appropriate arithmetic operators to perform the calculations.
4. Print the results using the System.out.println() method.
5. Remember to handle division by zero when calculating the quotient.

Your answer*/

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Write your code here

        int num1 = scanner.nextInt();

        int num2 = scanner.nextInt();

        int Sum = num1 + num2;
        int Difference = num1 - num2;
        int Product = num1 * num2;
        int Quotient;
        int Remainder;

        // Division check
        if (num2 != 0) {
            Quotient = num1 / num2;
            Remainder = num1 % num2;
        } else {
            Quotient = 0;
            Remainder = 0;
            System.out.println("\n(Note: Division by zero occurred. Quotient and remainder are placeholders.)");
        }
        System.out.println("Sum: " + Sum);
        System.out.println("Difference: " + Difference);
        System.out.println("Product: " + Product);

        if (num2 != 0) {
            System.out.println("Quotient: " + Quotient);
            System.out.println("Remainder: " + Remainder);
        } else {
            System.out.println("Quotient: Cannot divide by zero");
            System.out.println("Remainder: Cannot calculate remainder");
        }

        scanner.close();
    }
}