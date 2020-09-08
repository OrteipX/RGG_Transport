/* Program Name: VehicleTester.java
 * Purpose: tester class for transports
 * Coder: Ramon Gnan Garcia - 0926596
 * Date: Feb 25, 2020
 */
import transp.*;

public class VehicleTester
{
    public static void main(String []args)
    {
        // creating an obkect
        Transport plane1 = new Aeroplane("Boeing", "787 Dreamliner", "Blue", 125);
        Transport car1 = new Automobile("Toyota", "Corolla", "Red", 65, 130);

        // calling toString method
        System.out.println("Plane1 object: " + plane1.toString());
        System.out.println("Car1 object: " + car1.toString());

        // calling checkSpeed method
        System.out.println("\nPlane1 speed check: " + plane1.checkSpeed());
        System.out.println("Car1 speed check: " + car1.checkSpeed());

        // creating more objects
        Aeroplane plane2 = new Aeroplane("Diamond", "Katana", "white", 50);

        // calling the toString method
        System.out.println("\nPlane2 object: " + plane2.toString());

        // setter
        plane2.setAirbone(true);
        plane2.setForwardSpeed(65);

        // getter forward speed
        System.out.println("Plane2 forward speed: " + plane2.getForwardSpeed());
        System.out.println("Plane2 speed check: " + plane2.checkSpeed());

        // setter forward speed
        plane2.setForwardSpeed(40);
        System.out.println("Plane2 forward speed is now: " + plane2.getForwardSpeed());
        System.out.println("Plane2 speed check: " + plane2.checkSpeed());


    }//end of main

}//end of class
