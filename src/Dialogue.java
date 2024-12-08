import java.util.Scanner;
import java.util.Date;

/**
 * The {@code Dialogue} class handles a looping dialogue system
 * where the user interacts with the program.
 * <p>
 * This class includes methods to manage the dialogue loop,
 * user input, and program flow control.
 * </p>
 */
public class Dialogue {

    /**
     * A static field to control the repetition of the dialogue loop.
     * <p>
     * The value of this field determines whether the loop continues
     * or stops. A value greater than 0 keeps the loop running.
     * </p>
     */
    private static int repeat = 1;

    /**
     * Initiates and controls the main dialogue loop of the program.
     * <p>
     * The loop runs as long as the {@code repeat} variable is greater than 0.
     * The method calls other functions to manage the dialogue flow
     * and prints a thank-you message when the loop ends.
     * </p>
     */
    public static void dialogueLoop() {
        do {
            pathChosen(introduction());
            System.out.println("\nThank you for using our program!");
        } while (repeat > 0);
    }

    /**
     * Displays the introduction message and options to the user.
     * <p>
     * This method uses the current date to dynamically display the year
     * and the number of years since 2000. It then presents a list of
     * options for the user to explore and reads the user's choice.
     * </p>
     *
     * @return The user's selected option as a {@code String}.
     */
    public static String introduction() {
        Date currentDate = new Date();
        int year = currentDate.getYear() +1900;
        System.out.println("--------------------------------------------------");
        System.out.println("Hello! Welcome to our " + year + "/" + (year-1999) + " college planning program.");
        System.out.println("Which option would you like to explore?");
        System.out.println(" 1: Suggest classes based on major");
        System.out.println(" 2: Suggest major based on interests");
        System.out.println(" 3: Suggest campus resources");
        System.out.println(" 4: Quit");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    /**
     * Processes the user's menu choice and directs the program flow accordingly.
     * <p>
     * Based on the user's input, this method triggers different actions:
     * <ul>
     *   <li>Option "1": Calls the {@code majorCases} method to suggest classes based on the major.</li>
     *   <li>Option "2": Calls the {@code suggest} method of the {@code SuggestMajor} class to suggest a major based on interests.</li>
     *   <li>Option "3": Calls the {@code suggest} method of the {@code SuggestResources} class to suggest campus resources.</li>
     *   <li>Option "4": Exits the program by setting the {@code repeat} variable to 0.</li>
     *   <li>Any other input: Displays an error message prompting valid input.</li>
     * </ul>
     * </p>
     *
     * @param choice The user's input, representing the selected menu option as a {@code String}.
     */
    public static void pathChosen(String choice) {
        switch (choice) {
            case "1":
                majorCases();
                break;
            case "2":
                SuggestMajor.suggest();
                break;
            case "3":
                SuggestResources.suggest();
                break;
            case "4":
                repeat = 0;
                break;
            default:
                System.out.println("Invalid choice. To use this program, type option 1,2, or 3; to exit, enter 4.");
                break;
        }
    }

    /**
     * Handles the process of suggesting classes based on the user's declared major.
     * <p>
     * Prompts the user to input their major, which is expected to be within STEM fields.
     * Based on the input, the method creates an instance of a specific class related to the major
     * and suggests appropriate classes by calling relevant methods.
     * </p>
     * <p>
     * Supported majors:
     * <ul>
     *   <li>"engineering"</li>
     *   <li>"computer science" or "compsci"</li>
     *   <li>"biology"</li>
     *   <li>Other: Falls back to general suggestions</li>
     * </ul>
     * </p>
     */
    public static void majorCases(){
        System.out.println("What is your major? (Please choose one in STEM; ex: Engineering)");
        Scanner input = new Scanner(System.in);
        String unMajor = input.nextLine();
        String major = unMajor.toLowerCase();
        switch (major) {
            case "engineering":
                SuggestClasses engineeringStudent = new Engineering(major);
                engineeringStudent.setType();
                engineeringStudent.printClasses();
                break;
            case "computer science", "compsci":
                SuggestClasses compSciStudent = new CScience(major);
                compSciStudent.setType();
                compSciStudent.printClasses();
                break;
            case "biology":
                SuggestClasses bioStudent = new Biology();
                bioStudent.setType();
                bioStudent.printClasses();
                break;
            default:
                SuggestClasses genStudent = new SuggestClasses(major);
                genStudent.printClasses();
        }
    }
}
