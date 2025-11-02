/*Question 1
Marks: 0.50/1

Classes & Objects in Java


Instructions:

Write a program that takes input from the user and creates an object of a class named 'Person'. The 'Person' class should have two member variables: 'name' and 'age'. The program should prompt the user to enter their name and age, create a 'Person' object with the entered values, and then display the name and age of the person.

Sample Input & Output:

Sample Input:
John
25

Sample Output:
Name: John
Age: 25
Hints:
1. Use the 'Scanner' class to read input from the user.
2. Create a class named 'Person' with two member variables: 'name' and 'age'.
3. Use the 'new' keyword to create an object of the 'Person' class.
4. Use the dot operator to access the member variables of the 'Person' object.
5. Print the name and age of the person using the 'System.out.println()' method.

Your answer
*/
import java.util.Scanner;

class Person {
    String name;
    int age;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an object of Person
        Person p = new Person();

        // Taking input
        p.name = sc.nextLine();
        p.age = sc.nextInt();

        // Displaying output
        System.out.println("Name: " + p.name);
        System.out.println("Age: " + p.age);

        // Closing scanner
        sc.close();
    }
}