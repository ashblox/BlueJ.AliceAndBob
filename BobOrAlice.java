
/**
 * Created to greet people. But only Bob and Alice.
 *
 * @author ashblox
 * @version 1.0
 */

import java.util.Scanner;

public class BobOrAlice
{
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = input.nextLine();
        if(name.equals("Bob")||name.equals("Alice")){
            System.out.println("Hello "+name);
        }
    }
}
