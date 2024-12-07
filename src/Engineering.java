import java.util.Scanner;

/**
 * Represents an Engineering object, a subclass of {@code SuggestClasses}.
 * This class is used to initialize and manage attributes related to an engineering major.
 */
public class Engineering extends SuggestClasses{

    /**
     * Represents the type of engineering.
     * Default value is 0.
     */
    private int type;

    /**
     * Represents the track or specific focus area in engineering.
     * Default value is undefined in the current implementation.
     */
    private int track;

    /**
     * Default constructor for the Engineering class.
     * Calls the superclass constructor to initialize the major as "engineering"
     * and sets the {@code type} attribute to 0.
     */
    public Engineering(){
        super("engineering");
        this.type = 0;
    }

    /**
     * Parameterized constructor for the Engineering class.
     * Allows the major to be explicitly set while initializing {@code type} to 0.
     *
     * @param major the name of the major to be set for this Engineering object
     */
    public Engineering(String major){
        super(major);
        this.type = 0;
    }

    /**
     * Overrides the {@code setType} method to prompt the user for a specific type of engineering.
     * Allows the user to select one of the predefined engineering types: Chemical, Computer, or Mechanical.
     * The selected type is stored in the {@code type} field.
     */
    @Override
    public void setType() {
        System.out.print("Which kind of engineering are you? \n1: Chemical\n2: Computer \n3: Mechanical\n");
        Scanner input = new Scanner(System.in);
        this.type = input.nextInt();
    }

    /**
     * Retrieves the type of engineering.
     *
     * @return the type of engineering as an integer value
     */
    public int getType() {
        return type;
    }

    /**
     * Retrieves the track or specific focus area of the engineering major.
     *
     * @return the track of engineering as an integer value
     */
    public int getTrack() {
        return track;
    }

    /**
     * Overrides the {@code printClasses} method to display the list of classes based on the type of engineering.
     * It calls specific methods for Chemical, Computer, or Mechanical engineering based on the value of {@code type}.
     * Additionally, it prints the general education courses from the superclass.
     */
    @Override
    public void printClasses() {
        switch (this.type) {
            case 1 -> printChemical();
            case 2 -> printComputer();
            case 3 -> printMechanical();
            default -> System.out.println("Invalid option.");
        }
        for (String s : super.GENERALEDUCATION) {
            System.out.print(s + '\n');
        }
    }

    /**
     * Prompts the user to select a track within Chemical Engineering and displays a four-year plan based on the selected track.
     * The available tracks are:
     * <ul>
     *   <li>1: Traditional</li>
     *   <li>2: Biotechnology/Bioengineering</li>
     *   <li>3: Environmental Engineering & Sustainability</li>
     * </ul>
     * Depending on the user's selection, the appropriate course plan is passed to the {@code fourYearPlan} method.
     * If an invalid option is selected, an error message is displayed.
     */
    public void printChemical() {
        System.out.print("Which track are you on? \n1: Traditional\n2: Biotechnology/Bioengineering \n3: Environmental Engineering & Sustainability\n");
        Scanner input = new Scanner(System.in);
        this.track = input.nextInt();
        switch (this.track) {
            case 1 -> fourYearPlan(chemPlan," ENME110\n"," CHEM351L\n"," CHEM301 CHEM311L CHEM302\n"," ENCH437L\n");
            case 2 -> fourYearPlan(chemPlan," BIOL141\n"," BIOL303 CHEM352\n", " CHEM437 CHEM303\n"," ENCH482 ENCH485L\n");
            case 3 -> fourYearPlan(chemPlan," ENME110\n"," ENCH2101 CHEM352\n"," ENCH410 CHEM303\n"," ENCH437L ENCH414 ENCH412\n");
            default -> System.out.println("Invalid option.");
        }
    }

    /**
     * Prompts the user to select a track within Computer Engineering and displays a four-year plan based on the selected track.
     * The available tracks are:
     * <ul>
     *   <li>1: Electronic Systems</li>
     *   <li>2: Communications</li>
     *   <li>3: Cybersecurity</li>
     * </ul>
     * Based on the user's selection, the appropriate course plan is passed to the {@code fourYearPlan} method.
     * If an invalid option is selected, an error message is displayed.
     */
    public void printComputer() {
        System.out.print("Which track are you on? \n1: Electronic Systems\n2: Communications \n3: Cybersecurity\n");
        Scanner input = new Scanner(System.in);
        this.track = input.nextInt();
        switch (this.track) {
            case 1 -> fourYearPlan(compPlan," CMSC421 CMPE415\n"," CMSC421 CMPE315\n");
            case 2 -> fourYearPlan(compPlan," CMPE323 CMPE330\n"," CMSC421\n");
            case 3 -> fourYearPlan(compPlan," CMSC421 CMPE415\n"," CMPE315 CMSC426 CMSC481\n");
            default -> System.out.println("Invalid option.");
        }
    }

    /**
     * Prints a predefined four-year course plan for the Mechanical Engineering track.
     * The plan includes a list of courses for each year, from Year 1 through Year 4.
     * This method is static, as it does not depend on any instance-specific data.
     */
    public static void printMechanical() {
        System.out.println("Here is your 4 year plan!");
        System.out.println(" Year 1: CHEM101 MATH151 ENES101 CHEM102 CHEM102L PHYS121 MATH152 ENME110");
        System.out.println(" Year 2: ENME220 STAT355 MATH251 PHYS122 ENME221 MATH225 ENME204 ENME217");
        System.out.println(" Year 3: CMPE306 ENME320 ENME303 ENME301 ENME304 ENME321 ENME360 ENME332L");
        System.out.println(" Year 4: ENME403 ENME432L ENME482L ENME444");
    }

    /**
     * A predefined four-year course plan for the Chemical Engineering track.
     * Each sub-array represents a specific year and contains the list of courses for that year.
     * The structure is as follows:
     * <ul>
     *   <li>Year 1: CHEM101, MATH151, ENES101, CHEM102, CHEM102L, PHYS121, MATH152</li>
     *   <li>Year 2: ENCH215, CHEM351, MATH251, ENCH225L, MATH225, PHYS122</li>
     *   <li>Year 3: ENCH300, ENCH425, ENCH427, ENCH440, ENCH442</li>
     *   <li>Year 4: ENCH444, ENCH445, ENCH446</li>
     * </ul>
     */
    private static final String[][] chemPlan = {
            {"Year 1:", "CHEM101", "MATH151", "ENES101", "CHEM102", "CHEM102L", "PHYS121", "MATH152"},
            {"Year 2:","ENCH215","CHEM351","MATH251","ENCH225L","MATH225","PHYS122"},
            {"Year 3:","ENCH300","ENCH425","ENCH427","ENCH440","ENCH442"},
            {"Year 4:","ENCH444", "ENCH445","ENCH446"}
    };

    /**
     * A predefined four-year course plan for the Computer Engineering track.
     * Each sub-array represents a specific year and contains the list of courses for that year.
     * The structure is as follows:
     * <ul>
     *   <li>Year 1: CMSC201, CMSC202, PHYS121, MATH151, MATH152, CMPE212, ENES101</li>
     *   <li>Year 2: MATH251, PHYS122, CMSC203, CMPE306L, MATH225, CMPE310, CMSC341</li>
     *   <li>Year 3: CMPE314, CMPE311, MATH221, CMPE320, CMPE349</li>
     *   <li>Year 4: CMSC411, CMPE450, CMPE451</li>
     * </ul>
     */
    private static final String[][] compPlan = {
            {"Year 1:","CMSC201","CMSC202","PHYS121","MATH151","MATH152","CMPE212","ENES101"},
            {"Year 2:","MATH251","PHYS122","CMSC203", "CMPE306L","MATH225","CMPE310","CMSC341"},
            {"Year 3:","CMPE314","CMPE311","MATH221", "CMPE320","CMPE349"},
            {"Year 4:","CMSC411","CMPE450","CMPE451"}
    };


}