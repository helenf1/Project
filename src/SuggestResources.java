import java.util.Scanner;

/**
 * The {@code SuggestResources} class provides information about various
 * campus resources based on user input.
 * <p>
 * This class allows users to learn about available campus services, such as
 * academic support, career services, mental health resources, student organizations,
 * and locating academic advisors. The user is presented with a menu of options
 * and their selection is processed to provide more detailed information.
 * </p>
 */
public class SuggestResources {

    /**
     * Displays a menu of campus resources and processes the user's selection.
     * <p>
     * This method provides a menu of campus resources, prompting the user to select an
     * option by entering a number. Based on the user's input, the corresponding method is
     * called to provide details about the selected resource. If the user enters an invalid
     * option, the menu is displayed again.
     * </p>
     *
     * <p>Options:</p>
     * <ul>
     *   <li>1: Academic Support</li>
     *   <li>2: Career Services</li>
     *   <li>3: Mental Health & Wellness</li>
     *   <li>4: Clubs & Organizations</li>
     *   <li>5: Finding Your Academic Advisor</li>
     *   <li>6: Quit the program</li>
     * </ul>
     */
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

    /**
     * Displays information about academic support resources.
     * <p>
     * This method provides a detailed list of academic support resources available to students,
     * including tutoring services, the writing center, workshops, peer study groups, and SI Pass
     * (Supplemental Instruction). After displaying the information, it prompts the user to decide
     * whether to explore another resource.
     * </p>
     */
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

    /**
     * Displays information about career services resources.
     * <p>
     * This method provides a detailed list of career services resources available to students,
     * including internship opportunities, job fairs, resume assistance, career counseling,
     * and networking events. After displaying the information, it prompts the user to decide
     * whether to explore another resource.
     * </p>
     */
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

    /**
     * Displays information about mental health and wellness resources.
     * <p>
     * This method provides a detailed list of mental health and wellness resources
     * available to students, including counseling services, stress management workshops,
     * wellness events, support groups, and emergency services. After displaying the
     * information, it prompts the user to decide whether to explore another resource.
     * </p>
     */
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

    /**
     * Displays information about clubs and organizations resources.
     * <p>
     * This method provides a detailed list of resources related to clubs and organizations
     * available to students, including opportunities to join student government, academic
     * clubs, cultural organizations, volunteer projects, and special interest groups.
     * After displaying the information, it prompts the user to decide whether to explore
     * another resource.
     * </p>
     */
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

    /**
     * Provides instructions for finding an academic advisor on myUMBC.
     * <p>
     * This method outlines the steps to locate the name and contact information
     * of an academic advisor through the myUMBC platform. It also informs users
     * about scheduling an appointment or reaching out via email for guidance.
     * After displaying the information, it prompts the user to decide whether to
     * explore another resource.
     * </p>
     */
    public static void findAdvisor() {
        System.out.println("To find your academic advisor on myUMBC, follow these steps:");
        System.out.println("1. Log in to your myUMBC account.");
        System.out.println("2. Navigate to your profile.");
        System.out.println("3. Under 'Academic Advisor', you will find the name and contact information for your academic advisor.");
        System.out.println("4. You can schedule an appointment through myUMBC, or reach out via email for advice.");
        System.out.println("\nWould you like to explore another resource? (y/n)");
        promptContinue();
    }

    /**
     * Prompts the user to decide whether to continue exploring resources.
     * <p>
     * This method asks the user if they would like to explore more campus resources.
     * If the user inputs "y" (yes), the program redisplays the resource menu by calling
     * the {@code suggest} method. If the user inputs "n" (no), the program ends with
     * a thank-you message. For invalid inputs, the method recursively prompts the user
     * until a valid response is provided.
     * </p>
     */
    public static void promptContinue() {
        Scanner input = new Scanner(System.in);
        String continueChoice = input.nextLine();

        if (continueChoice.equalsIgnoreCase("y")) {
            suggest();  // If the user wants to continue, show the resource options again.
        } else if (continueChoice.equalsIgnoreCase("n")) {
            System.out.println("Thank you for using our program!");
        } else {
            System.out.println("Invalid input. Please type 'y' to continue or 'n' to exit.");
            promptContinue();
        }
    }
}
