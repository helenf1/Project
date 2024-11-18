import java.util.Scanner;

public class SuggestMajor {

    public static void suggest() {
        Scanner input = new Scanner(System.in);

        // Introduction message
        System.out.println("Welcome to the Major Suggestion System!");
        System.out.println("Let's help you explore some potential majors based on your interests.");

        // Get user interest
        String interestedClasses = getUserInterest();

        // Offer suggestions based on the interest
        if (interestedClasses.contains("math")) {
            suggestMath();
        } else if (interestedClasses.contains("english")) {
            suggestEnglish();
        } else if (interestedClasses.contains("science")) {
            suggestScience();
        } else if (interestedClasses.contains("social studies")) {
            suggestSocialStudies();
        } else {
            System.out.println("\nIt seems you might have broader interests. Let's narrow it down a bit more.");
            askFollowUpQuestions();
        }

        // Final message
        System.out.println("\nRemember, these are just a few options! Feel free to explore many fields before deciding.");
        System.out.println("Good luck with your major search!");
    }

    public static String getUserInterest() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nWhat type of subjects or classes are you most interested in? (e.g., Math, English, Science, Social Studies): ");
        return input.nextLine().toLowerCase();
    }

    public static void suggestMath() {
        System.out.println("\nSince you are interested in Math, here are some possible majors you might consider:");
        System.out.println("- Mathematics");
        System.out.println("- Computer Science");
        System.out.println("- Information Systems");
        System.out.println("- Engineering (e.g., Electrical, Mechanical, Civil)");
        System.out.println("- Economics");
        System.out.println("- Data Science");
    }

    public static void suggestEnglish() {
        System.out.println("\nSince you are interested in English, here are some potential majors:");
        System.out.println("- English Literature");
        System.out.println("- Creative Writing");
        System.out.println("- Linguistics");
        System.out.println("- Communications");
        System.out.println("- Journalism");
        System.out.println("- Education");
    }

    public static void suggestScience() {
        System.out.println("\nSince you are interested in Science, here are some possible majors for you:");
        System.out.println("- Biology");
        System.out.println("- Chemistry");
        System.out.println("- Physics");
        System.out.println("- Environmental Science");
        System.out.println("- Astronomy");
        System.out.println("- Geology");
        System.out.println("- Biotechnology");
    }

    public static void suggestSocialStudies() {
        System.out.println("\nSince you are interested in Social Studies, here are some majors you might like:");
        System.out.println("- Political Science");
        System.out.println("- History");
        System.out.println("- Sociology");
        System.out.println("- Anthropology");
        System.out.println("- International Relations");
        System.out.println("- Psychology");
        System.out.println("- Criminal Justice");
    }

    public static void askFollowUpQuestions() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nDo you enjoy working with people or data more? (Type 'people' or 'data'): ");
        String preference = input.nextLine().toLowerCase();

        if (preference.equals("people")) {
            suggestPeopleOrientedMajors();
        } else if (preference.equals("data")) {
            suggestDataOrientedMajors();
        } else {
            System.out.println("\nIt seems you're unsure. Don't worry, you can always explore many fields before making your final decision!");
        }
    }

    public static void suggestPeopleOrientedMajors() {
        System.out.println("\nSince you enjoy working with people, here are some major suggestions:");
        System.out.println("- Psychology");
        System.out.println("- Sociology");
        System.out.println("- Education");
        System.out.println("- Nursing");
        System.out.println("- Human Resources");
        System.out.println("- Social Work");
        System.out.println("- Business Administration (HR or Marketing)");
    }

    public static void suggestDataOrientedMajors() {
        System.out.println("\nSince you enjoy working with data, consider these major options:");
        System.out.println("- Computer Science");
        System.out.println("- Data Science");
        System.out.println("- Statistics");
        System.out.println("- Information Systems");
        System.out.println("- Economics");
        System.out.println("- Engineering (e.g., Industrial Engineering)");
        System.out.println("- Business Analytics");
    }
}
