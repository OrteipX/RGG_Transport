/* Program Name: Transport.java
 * Purpose: abstract class that will be implemented by sub classes
 * Coder: Ramon Gnan Garcia - 0926596
 * Date: Feb 25, 2020
 */

package transp;

public abstract class Transport
{
    // members variables
    private String vehicleType;
    private String color;
    private boolean isMoving;
    private int forwardSpeed;

    // constructor 3 args
    public Transport(String vehicleType, String color, int forwardSpeed)
    {
        // setting values
        this.vehicleType = vehicleType;
        this.color = color;
        this.forwardSpeed = forwardSpeed;

        // if forward speed is zero, not moving
        // greater than zero, is moving
        if (forwardSpeed > 0)
            this.isMoving = true;
        else if (forwardSpeed == 0)
            this.isMoving = false;
    }

    // getter - vehicle type
    public String getVehicleType()
    {
        return vehicleType;
    }

    // getter - color
    public String getColor()
    {
        return color;
    }

    // getter - is moving
    public boolean getIsMoving()
    {
        return isMoving;
    }

    // getter - forward speed
    public int getForwardSpeed()
    {
        return forwardSpeed;
    }

    // setter - forward speed
    public void setForwardSpeed(int newSpeed)
    {
        this.forwardSpeed = newSpeed;
        // checking new speed
        if (newSpeed > 0)
            isMoving = true;
        else if (newSpeed == 0)
            isMoving = false;
    }

    /*
     * Method Name: toString()
     * Purpose: it's an overriding method to show some informetion to the display
     * Accepts: nothing
     * Returns: String
     * Date: Feb 25, 2020
     */
    @Override
    public String toString()
    {
        return "This vehicle is a(n) " + vehicleType + ", its color is " + color + ".\nCurrent speed is " + forwardSpeed + ", so the in-motion state is " + isMoving + ". ";
    }


    /*
     * Method Name: checkSpeed()
     * Purpose: it's an abstract method that it will be implemented in subclasses
     * Accepts: nothing
     * Returns: String
     * Date: Feb 25, 2020
     */
    public abstract String checkSpeed();

}//end of class
