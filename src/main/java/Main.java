/**
 * Created by yottawatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Name:");

        String greet = input.nextLine();

        if (rightName(greet)){
            System.out.println("Welcome to the program " + greet + "!");
        }else {
            System.out.print("Go Away!!!!!!");
        }input.close();
    }
    public static boolean rightName(String greet){
        return greet.equalsIgnoreCase("Alice") || greet.equalsIgnoreCase("Bob");
    }
}
