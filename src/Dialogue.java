import java.util.Scanner;

public class Dialogue {

    public static String introduction() {
        System.out.println("Hello! Welcome to our blah blah etc.");
        System.out.println("Which option would you like to explore?");
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        return choice;

    }
}
