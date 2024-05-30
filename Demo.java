////////////////////////////////////////////////////////////////
package gitPractice;
import java.util.Scanner;
/**
 * The Demo class.
 * 
 * @author Gannon Rebeta
 * @version 5/30/2024
 */
public class Demo
{
    /**
     * Runs a demonstration of the Morphius program.
     * 
     * @param args command-line arguements (not used)
     */
    public static void main(String[] args)
    {
        System.out.println("This is your last chance. After this,"
                       + " there is no turning back."
                       + "\n"
                       + "If you take the \"blue\" pill, the"
                       + " story ends, you wake up in your bed"
                       + " and believe whatever you want to"
                       + " believe."
                       + "\n"
                       + "If you take the \"red\" pill, you"
                       + " stay in wonderland and I show you"
                       + " how deep the rabbit hole goes.");
        System.out.print("Enter your choice here:");
        
        Scanner scanner = new Scanner(System.in);
        Pill choice;
        String input = scanner.nextLine();
        switch (input)
        {
            case "red":
                choice = new RedPill();
                System.out.println(">the red pill.");
                choice.message();
                break;
            case "blue":
                choice = new BluePill();
                System.out.println(">the blue pill.");
                choice.message();
                break;
            default:
                System.out.println(">invalid pill.");
                System.out.println("You awoke in Dunceland.");
        }
    }
}
////////////////////////////////////////////////////////////////
