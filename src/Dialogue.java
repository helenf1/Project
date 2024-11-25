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
        System.out.println("--------------------------------------------------");
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
                majorCases();
                break;
            case "2":
                SuggestMajor.suggest();
                break;
            case "3":

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

    public static void majorCases(){
        System.out.println("What is your major? (ex: Engineering)");
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
