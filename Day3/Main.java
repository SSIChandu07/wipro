/*Question 2
Marks: 1/1

Sum of All Numbers
Find the sum of the digits using recursion



Input:

4246

Output:

16

Explanation:

4+2+4+6 is 16







Input:

-32

Output:

5

Explanation:

3+2



Input value ranges in the range of Integer data type.

Your answer*/

import java.util.Scanner;

public class Main {
    // Recursive function to find sum of digits
    static int sumOfDigits(int n) {
        if (n == 0)
            return 0;
        return (n % 10) + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // input number
        System.out.println(sumOfDigits(num)); // print result
    }
}