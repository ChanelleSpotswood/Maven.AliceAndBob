import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Chanelle's Name Game!");
        System.out.println("what is your name");
        Scanner in = new Scanner(System.in);
        String username = in.nextLine();
        String alice = "Alice";
        String bob = "Bob";

        if (alice.equals(username)) {
            System.out.println("correct");
        }
    }
}