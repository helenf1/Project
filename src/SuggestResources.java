import java.util.Scanner;
 
public class SuggestResources {

    // Suggests campus resources based on the user's input.
     
    public static void suggest() {
        System.out.println("--------------------------------------------------");
        System.out.println("Which campus resource would you like to learn about?");
        System.out.println("1: Academic Support (tutoring, workshops, SI Pass)");
        System.out.println("2: Career Services (internships, job fairs)");
        System.out.println("3: Mental Health & Wellness (counseling, workshops)");
        System.out.println("4: Clubs & Organizations (student life, networking)");
        System.out.println("5: Finding Your Academic Advisor on myUMBC");
        System.out.println("6: Quit");
        System.out.println("--------------------------------------------------");

        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();

        switch (choice) {
            case "1":
                academicSupport();
                break;
            case "2":
                careerServices();
                break;
            case "3":
                mentalHealthWellness();
                break;
            case "4":
                clubsAndOrganizations();
                break;
            case "5":
                findAdvisor();
                break;
            case "6":
                System.out.println("Thank you for using the program!");
                break;
            default:
                System.out.println("Invalid choice, please select a valid option.");
                suggest();  
        }
    }

    // Provides information on academic support resources.
     
    public static void academicSupport() {
        System.out.println("Academic Support Resources include:");
        System.out.println(" - Tutoring Services: Available for various subjects.");
        System.out.println(" - Writing Center: Get help with writing assignments.");
        System.out.println(" - Workshops: Attend academic skill workshops (e.g., time management, study skills).");
        System.out.println(" - Peer Study Groups: Join or form study groups with fellow students.");
        System.out.println(" - SI Pass (Supplemental Instruction): Group study sessions for difficult courses.");
        System.out.println("\nWould you like to explore another resource? (y/n)");
        promptContinue();
    }

    // Provides information on career services.
    
    public static void careerServices() {
        System.out.println("Career Services Resources include:");
        System.out.println(" - Internship Opportunities: Assistance in finding internships in various fields.");
        System.out.println(" - Job Fairs: Attend career fairs to meet potential employers.");
        System.out.println(" - Resume Building: Help with creating and editing your resume.");
        System.out.println(" - Career Counseling: One-on-one sessions to discuss your career goals.");
        System.out.println(" - Networking Events: Connect with alumni and professionals.");
        System.out.println("\nWould you like to explore another resource? (y/n)");
        promptContinue();
    }

    // Provides information on mental health and wellness resources.
    
    public static void mentalHealthWellness() {
        System.out.println("Mental Health & Wellness Resources include:");
        System.out.println(" - Counseling Services: Individual or group counseling for emotional support.");
        System.out.println(" - Stress Management Workshops: Learn techniques to manage stress and anxiety.");
        System.out.println(" - Wellness Events: Participate in health-related events like yoga, meditation, etc.");
        System.out.println(" - Support Groups: Join groups for students dealing with similar challenges.");
        System.out.println(" - Emergency Services: Available if you need urgent mental health support.");
        System.out.println("\nWould you like to explore another resource? (y/n)");
        promptContinue();
    }

    // Provides information on clubs and student organizations.
     
    public static void clubsAndOrganizations() {
        System.out.println("Clubs & Organizations Resources include:");
        System.out.println(" - Student Government: Get involved in shaping student policies and events.");
        System.out.println(" - Academic Clubs: Join clubs related to your major or academic interests.");
        System.out.println(" - Cultural Organizations: Connect with students from different cultural backgrounds.");
        System.out.println(" - Volunteer Opportunities: Engage in community service projects and leadership activities.");
        System.out.println(" - Special Interest Groups: Join a group that fits your personal hobbies and interests.");
        System.out.println("\nWould you like to explore another resource? (y/n)");
        promptContinue();
    }

    // Provides instructions on how to find your academic advisor on myUMBC.
     
    public static void findAdvisor() {
        System.out.println("To find your academic advisor on myUMBC, follow these steps:");
        System.out.println("1. Log in to your myUMBC account.");
        System.out.println("2. Navigate to your profile.");
        System.out.println("3. Under 'Academic Advisor', you will find the name and contact information for your academic advisor.");
        System.out.println("4. You can schedule an appointment through myUMBC, or reach out via email for advice.");
        System.out.println("\nWould you like to explore another resource? (y/n)");
        promptContinue();
    }

    // Prompt the user to continue or exit after viewing a resource.
     
    public static void promptContinue() {
        Scanner input = new Scanner(System.in);
        String continueChoice = input.nextLine();

        if (continueChoice.equalsIgnoreCase("y")) {
            suggest();  // If the user wants to continue, show the resource options again.
        } else if (continueChoice.equalsIgnoreCase("n")) {
            System.out.println("Thank you for using our program!");
        } else {
            System.out.println("Invalid input. Please type 'y' to continue or 'n' to exit.");
            promptContinue(); .
        }
    }
}
