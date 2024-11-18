public class SuggestClasses {

    private String major;

    public SuggestClasses(){
        System.out.println("Please choose a major! If undecided, use our Suggest Major feature!");
    }

    public SuggestClasses(String major){
        this.major = major;
        majorCases(major);
    }

    public String getMajor(){
        return major;
    }

    public static void majorCases(String major) {
        String majorLowercase = major.toLowerCase();
        switch (majorLowercase) {
            case "engineering" -> Engineering.askTrack();
            case "computer science", "compsci" -> CScience.askTrack();
            case "biology" -> Biology.askTrack();
            case "information systems","is" -> printInformationSystems();
            case "chemistry" -> printChemistry();
            case "geology","geology and earth sciences" -> printGeo();
            case "math","mathematics" -> printMath();
            case "physics" -> printPhysics();
            case "psychology" -> printPsychology();
            case "statistics" -> printStatistics();
            default -> System.out.println("Invalid major.");
        }
        printGeneralEducation();
    }

    public static void printInformationSystems() {
        System.out.println("Here is your 4 Year Plan!");
        System.out.println(" Year 1: COMP101 ECON101 MATH155 IS147 MGMT210 ECON102");
        System.out.println(" Year 2: IS247 IS300 ECON121 IS310 MATH215 ECON122");
        System.out.println(" Year 3: IS410 IS450 IS420 IS451 STAT351");
        System.out.println(" Year 4: IS425 ENGL393 IS436");
    }

    public static void printChemistry() {
        System.out.println("Here is your 4 Year Plan!");
        System.out.println(" Year 1: CHEM101 MATH151 CHEM102 CHEM102L MATH152 PHYS121");
        System.out.println(" Year 2: CHEM351 CHEM351L CHEM300 PHYS122 CHEM352 CHEM352L MATH251");
        System.out.println(" Year 3: CHEM301 CHEM311L CHEM302 CHEM312L CHEM405");
        System.out.println(" Year 4: CHEM405L CHEM461");
    }

    public static void printGeo() {
        System.out.println("Here is your 4 Year Plan!");
        System.out.println(" Year 1: GES110 MATH151 CHEM101 GES120 BIOL141 CHEM102");
        System.out.println(" Year 2: GES220 GES286 GES386 PHYS11 STAT355");
        System.out.println(" Year 3: GES308 GES300 GES310");
        System.out.println(" Year 4: GES 400-Level Electives");
    }

    public static void printMath() {
        System.out.println("Here is your 4 Year Plan!");
        System.out.println(" Year 1: MATH151 CMSC201 MATH152 PHYS121");
        System.out.println(" Year 2: MATH251 MATH221 PHYS122 MATH300 MATH301 MATH225");
        System.out.println(" Year 3: MATH302 MATH Upper-Level Electives");
        System.out.println(" Year 4: MATH Upper-Level Electives");
    }

    public static void printPhysics() {
        System.out.println("Here is your 4 Year Plan!");
        System.out.println(" Year 1: MATH151 CHEM101 PHYS121H MATH152 PHYS122H  CMSC201");
        System.out.println(" Year 2: PHYS224 PHYS122L MATH251 PHYS220 PHYS324 MATH225");
        System.out.println(" Year 3: PHYS303 PHYS330L MATH221 PHYS321 PHYS320L");
        System.out.println(" Year 4: PHYS424 PHYS431L PHYS300 PHYS407");
    }

    public static void printPsychology() {
        System.out.println("Here is your 4 Year Plan!");
        System.out.println(" Year 1: PSYCH100 MATH150 PSYCH210 BIOL141 STAT121");
        System.out.println(" Year 2: PSYC309 CHEM101 BIOL142 CHEM102 PSYCH300-Level Distribution Requirement");
        System.out.println(" Year 3: PSYC397 PSYC311 BIOL302 PSCY397 PSYC312");
        System.out.println(" Year 4: PSYC335 PSYC370 PSYC Electives");
    }

    public static void printStatistics() {
        System.out.println("Here is your 4 Year Plan!");
        System.out.println(" Year 1: MATH151 MATH152 CMSC201");
        System.out.println(" Year 2: MATH251 MATH221 STAT355");
        System.out.println(" Year 3: STAT451 STAT454 ENGL393 STAT453 STAT Upper-Level Electives");
        System.out.println(" Year 4: STAT433 SPCH100 STAT Upper-Level Electives");
    }

    public static void printGeneralEducation(){
        System.out.println("In addition, these are the General Education requirements as a UMBC student:");
        System.out.println(" English Composition: Completion of English 100 or equivalent course");
        System.out.println(" Arts/Humanities: Three courses with \"AH\" designation from at least two disciplines");
        System.out.println(" Social Sciences: Three courses with \"SS\" designation from at least two disciplines");
        System.out.println(" Mathematics: One course in mathematics or statistics");
        System.out.println(" Sciences: Two courses with the \"S\" designation, including one lab");
        System.out.println(" Culture: One course with the \"C\" designation");
        System.out.println(" Language: Completion of foreign language through the 201 level");
    }

}

