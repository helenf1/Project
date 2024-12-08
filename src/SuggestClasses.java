/**
 * The {@code SuggestClasses} class provides a framework for suggesting classes
 * based on the user's declared major.
 * <p>
 * This class includes methods for setting and retrieving the major and can
 * be extended to include more specific behavior for different majors.
 * </p>
 */
public class SuggestClasses {

    /**
     * The user's declared major.
     */
    private String major;

    /**
     * Default constructor for {@code SuggestClasses}.
     * <p>
     * Initializes the {@code major} field to an empty string.
     * </p>
     */
    public SuggestClasses(){
        this.major = "";
    }

    /**
     * Parameterized constructor for {@code SuggestClasses}.
     * <p>
     * Initializes the {@code major} field to the specified value.
     * </p>
     *
     * @param major The user's declared major.
     */
    public SuggestClasses(String major){
        this.major = major;
    }

    /**
     * Sets the user's declared major.
     *
     * @param major The user's declared major.
     */
    public void setMajor(String major){
        this.major = major;
    }

    /**
     * Retrieves the user's declared major.
     *
     * @return A string describing the user's major.
     */
    public String getMajor(){
        return "Your major is" + this.major;
    }

    /**
     * A placeholder method for setting the type of the suggestion.
     * <p>
     * This method is intended to be overridden in subclasses to define
     * specific behaviors based on the major type.
     * </p>
     */
    public void setType(){
    }

    /**
     * Prints the recommended classes for the user's declared major.
     * <p>
     * Based on the user's major, this method prints major-specific class recommendations
     * by invoking specialized methods. If the major is unrecognized, a message is displayed
     * prompting the user to input a valid major name.
     * </p>
     * <p>
     * In addition, the method iterates through a list of general education requirements
     * and prints them as a supplement to the major-specific recommendations.
     * </p>
     */
    public void printClasses() {
        switch (this.major) {
            case "information systems","is" -> printInformationSystems();
            case "chemistry" -> printChemistry();
            case "geology","geology and earth sciences" -> printGeo();
            case "math","mathematics" -> printMath();
            case "physics" -> printPhysics();
            case "psychology" -> printPsychology();
            case "statistics" -> printStatistics();
            default -> System.out.println("Invalid major. Please write the general name of your major.");
        }
        for (String s : GENERALEDUCATION) {
            System.out.print(s + '\n');
        }
    }

    /**
     * Prints the 4-year academic plan for students majoring in Information Systems.
     * <p>
     * The plan outlines the recommended courses for each academic year:
     * </p>
     * <ul>
     *   <li>Year 1: COMP101, ECON101, MATH155, IS147, MGMT210, ECON102</li>
     *   <li>Year 2: IS247, IS300, ECON121, IS310, MATH215, ECON122</li>
     *   <li>Year 3: IS410, IS450, IS420, IS451, STAT351</li>
     *   <li>Year 4: IS425, ENGL393, IS436</li>
     * </ul>
     * <p>
     * This plan provides a structured progression from foundational to advanced courses
     * in Information Systems, supplemented by general education and business-related courses.
     * </p>
     */
    public void printInformationSystems() {
        System.out.println("Here is your 4 Year Plan!");
        System.out.println(" Year 1: COMP101 ECON101 MATH155 IS147 MGMT210 ECON102");
        System.out.println(" Year 2: IS247 IS300 ECON121 IS310 MATH215 ECON122");
        System.out.println(" Year 3: IS410 IS450 IS420 IS451 STAT351");
        System.out.println(" Year 4: IS425 ENGL393 IS436");
    }

    /**
     * Prints the 4-year academic plan for students majoring in Chemistry.
     * <p>
     * The plan includes the recommended courses for each year:
     * </p>
     * <ul>
     *   <li>Year 1: CHEM101, MATH151, CHEM102, CHEM102L, MATH152, PHYS121</li>
     *   <li>Year 2: CHEM351, CHEM351L, CHEM300, PHYS122, CHEM352, CHEM352L, MATH251</li>
     *   <li>Year 3: CHEM301, CHEM311L, CHEM302, CHEM312L, CHEM405</li>
     *   <li>Year 4: CHEM405L, CHEM461</li>
     * </ul>
     */
    public void printChemistry() {
        System.out.println("Here is your 4 Year Plan!");
        System.out.println(" Year 1: CHEM101 MATH151 CHEM102 CHEM102L MATH152 PHYS121");
        System.out.println(" Year 2: CHEM351 CHEM351L CHEM300 PHYS122 CHEM352 CHEM352L MATH251");
        System.out.println(" Year 3: CHEM301 CHEM311L CHEM302 CHEM312L CHEM405");
        System.out.println(" Year 4: CHEM405L CHEM461");
    }

    /**
     * Prints the 4-year academic plan for students majoring in Geology and Earth Sciences.
     * <p>
     * The plan includes the recommended courses for each year:
     * </p>
     * <ul>
     *   <li>Year 1: GES110, MATH151, CHEM101, GES120, BIOL141, CHEM102</li>
     *   <li>Year 2: GES220, GES286, GES386, PHYS11, STAT355</li>
     *   <li>Year 3: GES308, GES300, GES310</li>
     *   <li>Year 4: GES 400-Level Electives</li>
     * </ul>
     */
    public void printGeo() {
        System.out.println("Here is your 4 Year Plan!");
        System.out.println(" Year 1: GES110 MATH151 CHEM101 GES120 BIOL141 CHEM102");
        System.out.println(" Year 2: GES220 GES286 GES386 PHYS11 STAT355");
        System.out.println(" Year 3: GES308 GES300 GES310");
        System.out.println(" Year 4: GES 400-Level Electives");
    }

    /**
     * Prints the 4-year academic plan for students majoring in Mathematics.
     * <p>
     * The plan includes the recommended courses for each year:
     * </p>
     * <ul>
     *   <li>Year 1: MATH151, CMSC201, MATH152, PHYS121</li>
     *   <li>Year 2: MATH251, MATH221, PHYS122, MATH300, MATH301, MATH225</li>
     *   <li>Year 3: MATH302, MATH Upper-Level Electives</li>
     *   <li>Year 4: MATH Upper-Level Electives</li>
     * </ul>
     */
    public void printMath() {
        System.out.println("Here is your 4 Year Plan!");
        System.out.println(" Year 1: MATH151 CMSC201 MATH152 PHYS121");
        System.out.println(" Year 2: MATH251 MATH221 PHYS122 MATH300 MATH301 MATH225");
        System.out.println(" Year 3: MATH302 MATH Upper-Level Electives");
        System.out.println(" Year 4: MATH Upper-Level Electives");
    }

    /**
     * Prints the 4-year academic plan for students majoring in Physics.
     * <p>
     * The plan includes the recommended courses for each year:
     * </p>
     * <ul>
     *   <li>Year 1: MATH151, CHEM101, PHYS121H, MATH152, PHYS122H, CMSC201</li>
     *   <li>Year 2: PHYS224, PHYS122L, MATH251, PHYS220, PHYS324, MATH225</li>
     *   <li>Year 3: PHYS303, PHYS330L, MATH221, PHYS321, PHYS320L</li>
     *   <li>Year 4: PHYS424, PHYS431L, PHYS300, PHYS407</li>
     * </ul>
     */
    public void printPhysics() {
        System.out.println("Here is your 4 Year Plan!");
        System.out.println(" Year 1: MATH151 CHEM101 PHYS121H MATH152 PHYS122H  CMSC201");
        System.out.println(" Year 2: PHYS224 PHYS122L MATH251 PHYS220 PHYS324 MATH225");
        System.out.println(" Year 3: PHYS303 PHYS330L MATH221 PHYS321 PHYS320L");
        System.out.println(" Year 4: PHYS424 PHYS431L PHYS300 PHYS407");
    }

    /**
     * Prints the 4-year academic plan for students majoring in Psychology.
     * <p>
     * The plan includes the recommended courses for each year:
     * </p>
     * <ul>
     *   <li>Year 1: PSYCH100, MATH150, PSYCH210, BIOL141, STAT121</li>
     *   <li>Year 2: PSYC309, CHEM101, BIOL142, CHEM102, PSYCH300-Level Distribution Requirement</li>
     *   <li>Year 3: PSYC397, PSYC311, BIOL302, PSYC397, PSYC312</li>
     *   <li>Year 4: PSYC335, PSYC370, PSYC Electives</li>
     * </ul>
     */
    public void printPsychology() {
        System.out.println("Here is your 4 Year Plan!");
        System.out.println(" Year 1: PSYCH100 MATH150 PSYCH210 BIOL141 STAT121");
        System.out.println(" Year 2: PSYC309 CHEM101 BIOL142 CHEM102 PSYCH300-Level Distribution Requirement");
        System.out.println(" Year 3: PSYC397 PSYC311 BIOL302 PSCY397 PSYC312");
        System.out.println(" Year 4: PSYC335 PSYC370 PSYC Electives");
    }

    /**
     * Prints the 4-year academic plan for students majoring in Statistics.
     * <p>
     * The plan includes the recommended courses for each year:
     * </p>
     * <ul>
     *   <li>Year 1: MATH151, MATH152, CMSC201</li>
     *   <li>Year 2: MATH251, MATH221, STAT355</li>
     *   <li>Year 3: STAT451, STAT454, ENGL393, STAT453, STAT Upper-Level Electives</li>
     *   <li>Year 4: STAT433, SPCH100, STAT Upper-Level Electives</li>
     * </ul>
     */
    public void printStatistics() {
        System.out.println("Here is your 4 Year Plan!");
        System.out.println(" Year 1: MATH151 MATH152 CMSC201");
        System.out.println(" Year 2: MATH251 MATH221 STAT355");
        System.out.println(" Year 3: STAT451 STAT454 ENGL393 STAT453 STAT Upper-Level Electives");
        System.out.println(" Year 4: STAT433 SPCH100 STAT Upper-Level Electives");
    }

    /**
     * Prints a customizable 4-year academic plan.
     * <p>
     * This method prints courses for each academic year using a 2D array of course data
     * and appends additional information for each year if provided.
     * </p>
     *
     * @param fourYearPlan A 2D array where each row corresponds to the courses for a specific year:
     *                     <ul>
     *                       <li>Index 0: Year 1 courses</li>
     *                       <li>Index 1: Year 2 courses</li>
     *                       <li>Index 2: Year 3 courses</li>
     *                       <li>Index 3: Year 4 courses</li>
     *                     </ul>
     * @param year1Add Additional string to append to Year 1's courses.
     * @param year2Add Additional string to append to Year 2's courses.
     * @param year3Add Additional string to append to Year 3's courses.
     * @param year4Add Additional string to append to Year 4's courses.
     */
    public static void fourYearPlan(String[][] fourYearPlan, String year1Add, String year2Add, String year3Add, String year4Add){
        System.out.println("Here is your 4 Year Plan!");
        for (String s : fourYearPlan[0]) {
            System.out.print(" " + s);
        }
        System.out.print(year1Add);
        for (String s : fourYearPlan[1]) {
            System.out.print(" " + s);
        }
        System.out.print(year2Add);
        for (String s : fourYearPlan[2]) {
            System.out.print(" " + s);
        }
        System.out.print(year3Add);
        for (String s : fourYearPlan[3]) {
            System.out.print(" " + s);
        }
        System.out.print(year4Add);
    }

    /**
     * Prints a 4-year academic plan with optional additions for the third and fourth years.
     * <p>
     * This method prints courses for each academic year using a 2D array of course data
     * and appends additional information for the third and fourth years if provided.
     * </p>
     *
     * @param fourYearPlan A 2D array where each row corresponds to the courses for a specific year:
     *                     <ul>
     *                       <li>Index 0: Year 1 courses</li>
     *                       <li>Index 1: Year 2 courses</li>
     *                       <li>Index 2: Year 3 courses</li>
     *                       <li>Index 3: Year 4 courses</li>
     *                     </ul>
     * @param year3Add Additional string to append to Year 3's courses.
     * @param year4Add Additional string to append to Year 4's courses.
     */
    public static void fourYearPlan(String[][] fourYearPlan, String year3Add, String year4Add){
        System.out.println("Here is your 4 Year Plan!");
        for (String s : fourYearPlan[0]) {
            System.out.print(" " + s);
        }
        System.out.print("\n");
        for (String s : fourYearPlan[1]) {
            System.out.print(" " + s);
        }
        System.out.print("\n");
        for (String s : fourYearPlan[2]) {
            System.out.print(" " + s);
        }
        System.out.print(year3Add);
        for (String s : fourYearPlan[3]) {
            System.out.print(" " + s);
        }
        System.out.print(year4Add);
    }

    /**
     * Prints a 4-year academic plan with optional additions for the first three years.
     * <p>
     * This method prints courses for each academic year using a 2D array of course data
     * and appends additional information for the first, second, and third years if provided.
     * </p>
     *
     * @param fourYearPlan A 2D array where each row corresponds to the courses for a specific year:
     *                     <ul>
     *                       <li>Index 0: Year 1 courses</li>
     *                       <li>Index 1: Year 2 courses</li>
     *                       <li>Index 2: Year 3 courses</li>
     *                       <li>Index 3: Year 4 courses</li>
     *                     </ul>
     * @param year1Add Additional string to append to Year 1's courses.
     * @param year2Add Additional string to append to Year 2's courses.
     * @param year3Add Additional string to append to Year 3's courses.
     */
    public static void fourYearPlan(String[][] fourYearPlan, String year1Add, String year2Add, String year3Add){
        System.out.println("Here is your 4 Year Plan!");
        for (String s : fourYearPlan[0]) {
            System.out.print(" " + s);
        }
        System.out.print(year1Add);
        for (String s : fourYearPlan[1]) {
            System.out.print(" " + s);
        }
        System.out.print(year2Add);
        for (String s : fourYearPlan[2]) {
            System.out.print(" " + s);
        }
        System.out.print(year3Add);
        for (String s : fourYearPlan[3]) {
            System.out.print(" " + s);
        }
        System.out.print("\n");
    }

    /**
     * An array of strings representing the General Education requirements at UMBC.
     * <p>
     * This array includes a list of requirements that all students must fulfill,
     * regardless of their major. These requirements span various academic disciplines
     * to ensure a well-rounded education.
     * </p>
     * <ul>
     *   <li>English Composition: Completion of English 100 or equivalent course</li>
     *   <li>Arts/Humanities: Three courses with "AH" designation from at least two disciplines</li>
     *   <li>Social Sciences: Three courses with "SS" designation from at least two disciplines</li>
     *   <li>Mathematics: One course in mathematics or statistics</li>
     *   <li>Sciences: Two courses with the "S" designation, including one lab</li>
     *   <li>Culture: One course with the "C" designation</li>
     *   <li>Language: Completion of foreign language through the 201 level</li>
     * </ul>
     *
     * <p>
     * This array is marked as {@code protected final} to ensure that it is accessible
     * only within the package and subclasses while remaining unmodifiable.
     * </p>
     */
    protected final String[] GENERALEDUCATION = {
            "In addition, these are the General Education requirements as a UMBC student:",
            " English Composition: Completion of English 100 or equivalent course",
            " Arts/Humanities: Three courses with \"AH\" designation from at least two disciplines",
            " Social Sciences: Three courses with \"SS\" designation from at least two disciplines",
            " Mathematics: One course in mathematics or statistics",
            " Sciences: Two courses with the \"S\" designation, including one lab",
            " Culture: One course with the \"C\" designation",
            " Language: Completion of foreign language through the 201 level"
    };

}

