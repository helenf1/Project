import java.util.Scanner;

/**
 * The {@code Biology} class extends the {@code SuggestClasses} class
 * and represents a specific category of suggested classes related to biology.
 * It includes functionality to manage the type of biology-related class suggestions.
 */
public class Biology extends SuggestClasses {

    /**
     * Represents the type of biology-related suggestions.
     * The default value is 0.
     */
    private int type;

    /**
     * Constructs a new {@code Biology} instance.
     * Initializes the base {@code SuggestClasses} with "biology" as the category
     * and sets the {@code type} to its default value of 0.
     */
    public Biology() {
        super("biology");
        this.type = 0;
    }

    /**
     * Constructs a new {@code Biology} instance with a specified major.
     *
     * @param major the specific major to initialize the {@code SuggestClasses} superclass.
     */
    public Biology(String major) {
        super(major);
        this.type = 0;
    }

    /**
     * Prompts the user to specify the type of biology they are interested in.
     * Overrides the {@code setType()} method in the superclass.
     *
     * <p>The options are as follows:
     * <ul>
     *   <li>1: Biological Sciences B.A</li>
     *   <li>2: Biological Sciences B.S</li>
     *   <li>3: Biology Education</li>
     * </ul>
     *
     * <p>Reads the user's choice from the console and assigns it to the {@code type} field.
     */
    @Override
    public void setType() {
        System.out.println("Which kind of biology are you? \n1: Biological Sciences B.A \n2: Biological Sciences B.S \n3: Biology Education");
        Scanner input = new Scanner(System.in);
        this.type = input.nextInt();
    }

    /**
     * Gets the type of biology-related class suggestions.
     *
     * @return the current type of biology class.
     */
    public int getType() {
        return type;
    }

    /**
     * Prints the suggested classes for the selected type of biology.
     * Overrides the {@code printClasses()} method in the superclass.
     *
     * <p>The options are:
     * <ul>
     *   <li>1: Biological Sciences B.A</li>
     *   <li>2: Biological Sciences B.S</li>
     *   <li>3: Biology Education</li>
     * </ul>
     *
     * <p>If an invalid type is selected, an error message is displayed. Additionally,
     * the general education classes are printed after the specific classes.
     */
    @Override
    public void printClasses() {
        switch (this.type) {
            case 1 -> bioScienceBA();
            case 2 -> bioScienceBS();
            case 3 -> bioEdu();
            default -> System.out.println("Invalid option.");
        }
        for (String s : super.GENERALEDUCATION) {
            System.out.print(s + '\n');
        }
    }

    /**
     * Prints the four-year plan for the Biological Sciences B.A program.
     *
     * <p>This includes specific courses like:
     * <ul>
     *   <li>MATH155</li>
     *   <li>PHYS122L, BIOL302</li>
     *   <li>BIOL303, BIOL300L</li>
     * </ul>
     */
    public void bioScienceBA() {
        fourYearPlan(bioFourYear, " MATH155\n", " PHYS122l BIOL302\n", " BIOL303 BIOL300L\n");

    }

    /**
     * Prints the four-year plan for the Biological Sciences B.S program.
     *
     * <p>This includes specific courses like:
     * <ul>
     *   <li>MATH151</li>
     *   <li>CHEM351L, BIOL303, BIOL300L</li>
     * </ul>
     */
    public void bioScienceBS() {
        fourYearPlan(bioFourYear, " MATH151\n", "CHEM351L BIOL303 BIOL300L\n", " \n");
    }

    /**
     * Prints the four-year plan for the Biology Education program.
     *
     * <p>The plan includes detailed course listings for all four years, such as:
     * <ul>
     *   <li>Year 1: BIO141, MATH155, PSYC100, BIOL142, CHEM101, GES110</li>
     *   <li>Year 2: BIOL302, CHEM102, PSYC210, EDUC310, BIOL303, BIOL397, CHEM102L, PHYS111, EDUC311</li>
     *   <li>Year 3: BIOL300L, CHEM351, PHYS112, STAT350, EDUC412, EDUC388, EDUC410</li>
     *   <li>Year 4: BIOL302L, EDUC427, EDUC411, GES311, EDUC456, EDUC457</li>
     * </ul>
     */
    public void bioEdu() {
        System.out.println("Here is your 4 year plan!");
        System.out.println(" Year 1: BIO141 MATH155 PSYC100 BIOL142 CHEM101 GES110");
        System.out.println(" Year 2: BIOL302 CHEM102 PSYC210 EDUC310 BIOL303 BIOL397 CHEM102L PHYS111 EDUC311");
        System.out.println(" Year 3: BIOL300L CHEM351 PHYS112 STAT350 EDUC412 EDUC388 EDUC410");
        System.out.println(" Year 4: BIOL302L EDUC427 EDUC411 GES311 EDUC456 EDUC457");
    }

    /**
     * A predefined four-year plan array containing course suggestions for biology-related majors.
     */
    private static final String[][] bioFourYear = {
            {"Year 1:", "CHEM101", "BIOL141", "BIO142", "CHEM102", "CHEM102L"},
            {"Year 2:", "CHEM351"},
            {"Year 3:", "PHYS111", "STAT350", "PHYS112"},
            {"Year 4:", "Upper-Level BIOL Electives"}
    };
}


