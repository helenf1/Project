import java.util.Scanner;

public class Dialogue {

    private static int repeat = 1;

    public static void dialogueLoop() {
        do {
            pathChosen(introduction());
            System.out.println("\nThank you for using our program!");
        } while (repeat > 0);
    }

    public static String introduction() {
        System.out.println("Hello! Welcome to our college planning program.");
        System.out.println("Which option would you like to explore?");
        System.out.println(" 1: Suggest classes based on major");
        System.out.println(" 2: Suggest major based on interests");
        System.out.println(" 3: Suggest campus resources");
        System.out.println(" 4: Quit");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static void pathChosen(String choice) {
        switch (choice) {
            case "1":
                //suggest classes case
                System.out.println("What is your major? (ex: Engineering)");
                Scanner input = new Scanner(System.in);
                SuggestClasses newStudent = new SuggestClasses(input.nextLine());
                break;
            case "2":

                break;
            case "3":
                //call case 3 code
                break;
            case "4":
                // call case 0 code
                repeat = 0;
                break;
            default:
                System.out.println("Invalid choice. To use this program, type option 1,2, or 3; to exit, enter 4.");
                break;
        }

    }
}
