/*Question 3
Marks: 1/1

bicycle and mountain bike
your task is to implement two classes as shown in the diagram





Your answer*/

import java.util.Scanner;

public class Bicycle {

    public int gear;
    public int speed;

    // the Bicycle class has one constructor
    public Bicycle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }

    // methods
    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }

    public void speedUp(int increment)
    {
        speed += increment;
    }

    public String toString()
    {
        return ("No of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);
    }

    // derived class
    static class MountainBike extends Bicycle {
        public int seatHeight;

        public MountainBike(int gear, int speed, int startHeight)
        {
            super(gear, speed);
            seatHeight = startHeight;
        }

        public void setHeight(int newValue)
        {
            seatHeight = newValue;
        }

        @Override
        public String toString()
        {
            return (super.toString() + "\nseat height is " + seatHeight);
        }
    }

    // main method
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        MountainBike mb = new MountainBike(x, y, z);
        System.out.println(mb.toString());
        sc.close();
    }
}