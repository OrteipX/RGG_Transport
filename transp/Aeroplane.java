/* Program Name: Aeroplane.java
 * Purpose: sub class extended by transport
 * Coder: Ramon Gnan Garcia - 0926596
 * Date: Feb 25, 2020
 */

package transp;

public class Aeroplane extends Transport
{
    // members variables
    private String maker;
    private String model;
    private boolean isAirbone;
    private int stallSpeed;

    // constructor 4 args
    public Aeroplane(String maker, String model, String color, int stallSpeed)
    {
        super("Aeroplane", color, 0);
        this.maker = maker;
        this.model = model;
        this.stallSpeed = stallSpeed;
        this.isAirbone = false;
    }

    // getter - maker
    public String getMaker()
    {
        return maker;
    }

    // getter - model
    public String getMoodel()
    {
        return model;
    }

    // getter - airbone
    public boolean getIsAirbone()
    {
        return isAirbone;
    }

    // getter - stall speed
    public int getStallSpeed()
    {
        return stallSpeed;
    }

    // setter - airbone
    public void setAirbone(boolean isAirbone)
    {
        this.isAirbone = isAirbone;
    }

    /*
     * Method Name: toString()
     * Purpose: overriding method to display some information to the display
     * Accepts: nothing
     * Returns: String
     * Date: Feb 25, 2020
     */
    @Override
    public String toString()
    {
        return super.toString() + "This aeroplane is a " + model + " that is made by " + maker + ".";
    }

    /*
     * Method Name: checkSpeed()
     * Purpose: it's an oeverrind method from the super class that will check the current
     * speed
     * Accepts: nothing
     * Returns: String
     * Date: Feb 25, 2020
     */
    public String checkSpeed()
    {
        // checking speed
        if (!isAirbone)
            return "Aeroplane is not airbone at this time.";
        else if (isAirbone && getForwardSpeed() <= stallSpeed)
            return "Warning: airspeed is at or below stall speed! Increase speed NOW!";
        else
            return "Current speed is within safe limits.";
    }

}//end of class
