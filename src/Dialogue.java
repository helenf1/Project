import java.util.Scanner;

public class Dialogue {

    public static String introduction() {
        System.out.println("Hello! Welcome to our blah blah etc.");
        System.out.println("Which option would you like to explore?");
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        return choice;
    }

    public static void pathChosen(String choice) {
        switch (choice) {
            case "Case 1":
                //call case 1 code
                break;
            case "Case 2":
                // call case 2 code
                break;
            case "case 3":
                //call case 3 code
                break;
            default:
                System.out.println("Invalid choice.");
                Dialogue.introduction();
                break;
        }

    }
}
