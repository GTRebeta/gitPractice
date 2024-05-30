////////////////////////////////////////////////////////////////
package gitPractice;
/**
 * The RedPill subclass.
 * 
 * @author Gannon Rebeta
 * @version 5/30/2024
 */
public class RedPill extends Pill
{
    /**
     * No-arg constructor. Color passed to Pill superclass.
     */
    public RedPill()
    {
        super("red");
    }

    /**
     * Prints liberating message.
     */
    public void message()
    {
        System.out.println("You awoke in the Matrix.");
    }
}
////////////////////////////////////////////////////////////////
