/* Program Name: Automobile.java
 * Purpose: automobile class that extends from Transport
 * Coder: Ramon Gnan Garcia - 0926596
 * Date: Feb 25, 2020
 */

package transp;

public class Automobile extends Transport
{
    // members variables
    private String maker;
    private String model;
    private int initialSpeed;
    private int maxSafeSpeed;

    // constructor 5 args
    public Automobile(String maker, String model, String color, int initialSpeed, int maxSafeSpeed)
    {
        super("Automobile", color, initialSpeed);
        this.maker = maker;
        this.model = model;
        this.initialSpeed = initialSpeed; // mistake... forgot to include this
        this.maxSafeSpeed = maxSafeSpeed;
    }

    // getter - maker
    public String getMaker()
    {
        return maker;
    }

    // getter - model
    public String getModel()
    {
        return model;
    }

    // getter - max safe speed
    public int getMaxSafeSpeed()
    {
        return maxSafeSpeed;
    }

    /*
     * Method Name: toString()
     * Purpose: overriding method from the super class to display some info to the display
     * Accepts: nothing
     * Returns: String
     * Date: Feb 25, 2020
     */
    @Override
    public String toString()
    {
        return super.toString() + "This car ia a " + model + " that is made by " + maker + ".";
    }

    /*
     * Method Name: checkSpeed()
     * Purpose: overriding method from super class to check the speed
     * Accepts: nothing
     * Returns: String
     * Date: Feb 25, 2020
     */
    @Override
    public String checkSpeed()
    {
        double carSpeed = (double)getForwardSpeed() / maxSafeSpeed;

        // check car speed
        if (carSpeed > 0.95)
            return "Warning: vehicle speed is at safety limits! SLOW DOWN!";
        else
            return "Current car speed is within safe limits.";
    }

}//end of class
