/*
Player Character Object

needs methods for:
leveling up
seting gender
returning gender
equiping armor/weapons
 */


package mythological.text.adventure;
/**
 *
 * @author Raymond
 */
import java.util.Scanner;

public class Player extends GameObject{
    public void setPlayerName()
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Please Enter the Name of Your Characte.");
            name = input.nextLine();
        }
    
}
