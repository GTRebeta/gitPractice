////////////////////////////////////////////////////////////////
package gitPractice;
/**
 * The Pill abstract superclass.
 * 
 * @author Gannon Rebeta
 * @version 5/30/2024
 */
public abstract class Pill
{
    protected String color;
    /**
     * 1-arg constructor.
     * 
     * @param color red or blue
     */
    public Pill(String color)
    {
        this.color = color;
    }

    /**
     * Prints specialized message. Implemented by RedPill & BluePill.
     */
    public abstract void message();
}
////////////////////////////////////////////////////////////////
