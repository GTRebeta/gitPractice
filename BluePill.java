////////////////////////////////////////////////////////////////
package gitPractice;
/**
 * The BluePill subclass.
 * 
 * @author Gannon Rebeta
 * @version 5/30/2024
 */
public class BluePill extends Pill
{
    /**
     * No-arg constructor. Color passed to Pill superclass.
     */
    public BluePill()
    {
        super("blue");
    }

    /**
     * Prints comforting message.
     */
    public void message()
    {
        System.out.println("You awake in your bed, believing"
                           + "whatever you want to believe.");
    }
}
////////////////////////////////////////////////////////////////
