
/**
 * This class defines how power pills behave in
 * a game.  The purpose of a power pill is to simply
 * provide a character with power.
 *
 * @author (You)
 * @version (0.1)
 */
public class PowerPill
{
    static int DEFAULT_POWER = 10;


    // instance variables
    int power;
    String name;

    // constructors
    /**
     \* Initializes this power pill to a default power value
     \* and sets the name of the pill to name.
     \* @param name the name of this power pill.
     */
    public PowerPill(String name){
        this.name = name;
        power = DEFAULT_POWER;
    }

    /**
     * Initializes this power pill to the value of power
     * and sets the name of the pill to name.
     * @param name the name of this power pill
     * @param power the power level of this power pill.
     */

    public PowerPill(String name, int power){
        this.name = name;
        this.power = power;
    }


    // accessor methods

    public static int getPowerPill() {
        return DEFAULT_POWER;
    }

    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }


    // mutator methods

    public static void setPowerPill(int powerPill) {
        DEFAULT_POWER = powerPill;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setName(String name) {
        this.name = name;
    }


    // toString method

    @Override
    public String toString() {
        return "PowerPill " + name +" = "+power;
    }
}