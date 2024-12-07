import java.util.Scanner;

/**
 * The {@code CScience} class extends the {@code SuggestClasses} class
 * and represents a category of suggested classes related to computer science.
 * It includes functionality to manage the type of computer science-related class suggestions.
 */
public class CScience extends SuggestClasses {

    /**
     * Represents the type of computer science-related suggestions.
     * The value of {@code type} determines the specific category of computer science.
     */
    private int type;

    /**
     * Constructs a new {@code CScience} instance with the default category.
     *
     * <p>Initializes the superclass {@code SuggestClasses} with "compsci" as the category
     * and sets the {@code type} to its default value of 0.
     */
    public CScience(){
        super("compsci");
        this.type = 0;
    }

    /**
     * Constructs a new {@code CScience} instance with a specified major.
     *
     * <p>Initializes the superclass {@code SuggestClasses} with the provided {@code major}
     * and sets the {@code type} to its default value of 0.
     *
     * @param major the specific major to initialize the {@code SuggestClasses} superclass.
     */
    public CScience(String major){
        super(major);
        this.type = 0;
    }

    /**
     * Prompts the user to specify their preferred pathway in computer science.
     * Overrides the {@code setType()} method in the superclass.
     *
     * <p>The options presented are:
     * <ul>
     *   <li>1: AI</li>
     *   <li>2: Cyber Security</li>
     *   <li>3: Data Science</li>
     *   <li>4: Game Development</li>
     *   <li>5: Standard</li>
     * </ul>
     *
     * <p>Reads the user's choice from the console and assigns it to the {@code type} field.
     */
    @Override
    public void setType() {
        System.out.print("Which pathway are you most interested in taking?\n" +
                "1: AI\n2: Cyber Security\n3: Data Science\n4: Game Development\n5: Standard\n");
        Scanner input = new Scanner(System.in);
        this.type = input.nextInt();
    }

    /**
     * Gets the type of computer science pathway chosen by the user.
     *
     * @return the current pathway type as an integer.
     */
    public int getType() {
        return type;
    }

    /**
     * Prints the suggested classes based on the selected computer science pathway.
     * Overrides the {@code printClasses()} method in the superclass.
     *
     * <p>The available pathways are:
     * <ul>
     *   <li>1: AI</li>
     *   <li>2: Cyber Security</li>
     *   <li>3: Data Science</li>
     *   <li>4: Game Development</li>
     *   <li>5: Standard</li>
     * </ul>
     *
     * <p>If an invalid type is selected, an error message is displayed.
     * Additionally, general education classes are printed after the specific pathway classes.
     */
    @Override
    public void printClasses() {
        switch (this.type) {
            case 1 -> ai();
            case 2 -> cyber();
            case 3 -> data();
            case 4 -> game();
            case 5 -> standard();
            default -> System.out.println("Please select one of the options above");
        }
        for (String s : super.GENERALEDUCATION) {
            System.out.print(s + '\n');
        }
    }

    /**
     * Prints the four-year plan for the Artificial Intelligence (AI) pathway in computer science.
     *
     * <p>The plan includes specific courses for each year:
     * <ul>
     *   <li>Year 1: CMSC 201, CMSC 202, CMSC 203, MATH 151, MATH 152</li>
     *   <li>Year 2: CMSC 331, CMSC 341, CMSC 313, MATH 221</li>
     *   <li>Year 3: CMSC 304, CMSC 411, CMSC 471, STAT 355, CMSC 421, CMSC 478, CMSC 4XX AI/ML elective</li>
     *   <li>Year 4: CMSC 441, CMSC 447, and 2 CMSC 4XX AI/ML electives</li>
     * </ul>
     *
     * <p>This method provides a detailed outline of the courses needed to specialize in AI.
     */
    public void ai() {
        System.out.println("This is your 4 year plan for AI:");
        System.out.println(" Year 1: CMSC 201, CMSC 202, CMSC 203, MATH 151, MATH 152");
        System.out.println(" Year 2: CMSC 331, CMSC 341, CMSC 313, Math 221");
        System.out.println(" Year 3: CMSC 304, CMSC 411, CMSC 471, STAT 355, CMSC 421, CMSC 478, CMSC 4XX AI/ML elective");
        System.out.println(" Year 4: CMSC 441, CMSC 447, and 2 CMSC 4XX AI/ML electives");
    }

    /**
     * Prints the four-year plan for the Cyber Security pathway in computer science.
     *
     * <p>The plan includes specific courses for each year:
     * <ul>
     *   <li>Year 1: CMSC 201, CMSC 202, CMSC 203, MATH 151, MATH 152</li>
     *   <li>Year 2: CMSC 331, CMSC 341, CMSC 313, MATH 221</li>
     *   <li>Year 3: CMSC 304, CMSC 411, CMSC 421, STAT 355, CMSC 426, and 2 CMSC 4XX Cyber electives</li>
     *   <li>Year 4: CMSC 441, CMSC 447, CMSC 487, CMSC 4XX elective</li>
     * </ul>
     *
     * <p>This method provides a detailed outline of the courses needed to specialize in Cyber Security.
     */
    public void cyber() {
        System.out.println("This is your 4 year plan for Cyber Security:");
        System.out.println(" Year 1: CMSC 201, CMSC 202, CMSC 203, MATH 151, MATH 152");
        System.out.println(" Year 2: CMSC 331, CMSC 341, CMSC 313, Math 221");
        System.out.println(" Year 3: CMSC 304, CMSC 411, CMSC 421, STAT 355, CMSC 426, and 2 CMSC 4XX Cyber electives");
        System.out.println(" Year 4: CMSC 441, CMSC 447, CMSC 487, CMSC 4XX elective");
    }

    /**
     * Prints the four-year plan for the Data Science pathway in computer science.
     *
     * <p>The plan includes specific courses for each year:
     * <ul>
     *   <li>Year 1: CMSC 201, CMSC 202, CMSC 203, MATH 151, MATH 152</li>
     *   <li>Year 2: CMSC 331, CMSC 341, CMSC 313, MATH 221</li>
     *   <li>Year 3: CMSC 304, CMSC 411, STAT 355, CMSC 491, CMSC 421, CMSC 4XX elective, CMSC 4XX Data elective</li>
     *   <li>Year 4: CMSC 441, CMSC 447, CMSC 487, CMSC 4XX elective, and 2 CMSC 4XX Data electives</li>
     * </ul>
     *
     * <p>This method provides a detailed outline of the courses needed to specialize in Data Science.
     */
    public void data() {
        System.out.println("This is your 4 year plan for Data Science:");
        System.out.println(" Year 1: CMSC 201, CMSC 202, CMSC 203, MATH 151, MATH 152");
        System.out.println(" Year 2: CMSC 331, CMSC 341, CMSC 313, Math 221");
        System.out.println(" Year 3: CMSC 304, CMSC 411, STAT 355, CMSC 491, CMSC 421, CMSC 4XX elective, CMSC 4XX Data elective");
        System.out.println(" Year 4: CMSC 441, CMSC 447, CMSC 487, CMSC 4XX elective, and 2 CMSC 4XX Data electives");
    }

    /**
     * Prints the four-year plan for the Game Development pathway in computer science.
     *
     * <p>The plan includes specific courses for each year:
     * <ul>
     *   <li>Year 1: CMSC 201, CMSC 202, CMSC 203, MATH 151, MATH 152</li>
     *   <li>Year 2: CMSC 331, CMSC 341, CMSC 313, MATH 221</li>
     *   <li>Year 3: CMSC 304, CMSC 411, CMSC 435, STAT 355, CMSC 421, CMSC 471, CMSC 4XX elective (437, 445, 461, 481, or 483)</li>
     *   <li>Year 4: CMSC 441, CMSC 447, CMSC 493, CMSC 4XX elective (437, 445, 455, 461, 481, or 483)</li>
     * </ul>
     *
     * <p>This method provides a detailed outline of the courses needed to specialize in Game Development.
     */
    public void game() {
        System.out.println("This is your 4 year plan for Game Development:");
        System.out.println(" Year 1: CMSC 201, CMSC 202, CMSC 203, MATH 151, MATH 152");
        System.out.println(" Year 2: CMSC 331, CMSC 341, CMSC 313, Math 221");
        System.out.println(" Year 3: CMSC 304, CMSC 411, CMSC 435, STAT 355, CMSC 421, CMSC 471, CMSC 4XX elective (437, 445, 461, 481, or 483)");
        System.out.println(" Year 4: CMSC 441, CMSC 447, CMSC 493, CMSC 4XX elective (437, 445, 455, 461, 481, or 483)");
    }

    /**
     * Prints the four-year plan for the Standard Computer Science pathway.
     *
     * <p>The plan includes specific courses for each year:
     * <ul>
     *   <li>Year 1: CMSC 201, CMSC 202, CMSC 203, MATH 151, MATH 152</li>
     *   <li>Year 2: CMSC 331, CMSC 341, CMSC 313, MATH 221</li>
     *   <li>Year 3: CMSC 304, CMSC 411, STAT 355, CMSC 421, and 3 CMSC 4XX electives</li>
     *   <li>Year 4: CMSC 441, CMSC 447, and 2 CMSC 4XX electives</li>
     * </ul>
     *
     * <p>This method provides a detailed outline of the courses needed for the standard Computer Science track.
     */
    public void standard() {
        System.out.println("This is your 4 year plan for Computer Science:");
        System.out.println(" Year 1: CMSC 201, CMSC 202, CMSC 203, MATH 151, MATH 152");
        System.out.println(" Year 2: CMSC 331, CMSC 341, CMSC 313, Math 221");
        System.out.println(" Year 3: CMSC 304, CMSC 411, STAT 355, CMSC 421, and 3 CMSC 4XX electives");
        System.out.println(" Year 4: CMSC 441, CMSC 447, and 2 CMSC 4XX electives");
    }
}
