/*Question 4
Marks: 1/1

Generic Data Analysis using JAVA
Description:
You are working on a data analysis module that needs to process different types of data. Implement a class named DataAnalyzer with the following requirements:


Constructor:

The class should have a constructor that takes an array of type T as its parameter and initializes an internal data structure to store the provided array.

Calculate Average Method:

Implement a method named calculateAverage that calculates and returns the average of the elements in the array.
Ensure that the method works for numeric types (e.g., Integer, Double) and does not require a separate implementation for each type.
Find Maximum Method:

Implement a method named findMaximum that finds and returns the maximum element in the array.
Ensure that the method works for comparable types (e.g., Integer, String) and does not require a separate implementation for each type.
Data Summary Method: (Pre-Implemented as a Boiler Plate Code)

Implement a method named dataSummary that prints a summary of the data, including the average and maximum values.


Sample Input:

2

4

45.9

46.8

57.3

37.8

Sample Output:

Data Summary:

Average: 46.95

Maximum: 57.3







Your answer*/

import java.util.*;

public class DataAnalyzer<T extends Number & Comparable<T>> {

    private T[] data; // to store input data

    // Constructor
    public DataAnalyzer(T[] data) {
        this.data = data;
    }

    // Method to calculate average (for numeric types)
    public double calculateAverage() {
        double sum = 0.0;
        for (T val : data) {
            sum += val.doubleValue(); // convert any numeric type to double
        }
        return sum / data.length;
    }

    // Method to find maximum (for comparable types)
    public T findMaximum() {
        T max = data[0];
        for (T val : data) {
            if (val.compareTo(max) > 0) {
                max = val;
            }
        }
        return max;
    }

    // Pre-implemented method
    public void dataSummary() {
        System.out.println("Data Summary:");
        System.out.println("Average: " + calculateAverage());
        System.out.println("Maximum: " + findMaximum());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt(); // choice (1: Integer, 2: Double, etc.)
        int size = sc.nextInt();

        if (ch == 1) {
            Integer[] arr = new Integer[size];
            for (int i = 0; i < size; i++) arr[i] = sc.nextInt();
            DataAnalyzer<Integer> obj = new DataAnalyzer<>(arr);
            obj.dataSummary();
        } 
        else if (ch == 2) {
            Double[] arr = new Double[size];
            for (int i = 0; i < size; i++) arr[i] = sc.nextDouble();
            DataAnalyzer<Double> obj = new DataAnalyzer<>(arr);
            obj.dataSummary();
        } 
        else if (ch == 3) {
            Short[] arr = new Short[size];
            for (int i = 0; i < size; i++) arr[i] = sc.nextShort();
            DataAnalyzer<Short> obj = new DataAnalyzer<>(arr);
            obj.dataSummary();
        } 
        else if (ch == 4) {
            Float[] arr = new Float[size];
            for (int i = 0; i < size; i++) arr[i] = sc.nextFloat();
            DataAnalyzer<Float> obj = new DataAnalyzer<>(arr);
            obj.dataSummary();
        }
    }
}