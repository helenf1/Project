public class SuggestClasses {

    private String major;

    public SuggestClasses(){
        this.major = "";
    }

    public SuggestClasses(String major){
        this.major = major;
    }

    public void setMajor(String major){
        this.major = major;
    }

    public String getMajor(){
        return "Your major is" + this.major;
    }

    public void setType(){
    }

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

    public void printInformationSystems() {
        System.out.println("Here is your 4 Year Plan!");
        System.out.println(" Year 1: COMP101 ECON101 MATH155 IS147 MGMT210 ECON102");
        System.out.println(" Year 2: IS247 IS300 ECON121 IS310 MATH215 ECON122");
        System.out.println(" Year 3: IS410 IS450 IS420 IS451 STAT351");
        System.out.println(" Year 4: IS425 ENGL393 IS436");
    }

    public void printChemistry() {
        System.out.println("Here is your 4 Year Plan!");
        System.out.println(" Year 1: CHEM101 MATH151 CHEM102 CHEM102L MATH152 PHYS121");
        System.out.println(" Year 2: CHEM351 CHEM351L CHEM300 PHYS122 CHEM352 CHEM352L MATH251");
        System.out.println(" Year 3: CHEM301 CHEM311L CHEM302 CHEM312L CHEM405");
        System.out.println(" Year 4: CHEM405L CHEM461");
    }

    public void printGeo() {
        System.out.println("Here is your 4 Year Plan!");
        System.out.println(" Year 1: GES110 MATH151 CHEM101 GES120 BIOL141 CHEM102");
        System.out.println(" Year 2: GES220 GES286 GES386 PHYS11 STAT355");
        System.out.println(" Year 3: GES308 GES300 GES310");
        System.out.println(" Year 4: GES 400-Level Electives");
    }

    public void printMath() {
        System.out.println("Here is your 4 Year Plan!");
        System.out.println(" Year 1: MATH151 CMSC201 MATH152 PHYS121");
        System.out.println(" Year 2: MATH251 MATH221 PHYS122 MATH300 MATH301 MATH225");
        System.out.println(" Year 3: MATH302 MATH Upper-Level Electives");
        System.out.println(" Year 4: MATH Upper-Level Electives");
    }

    public void printPhysics() {
        System.out.println("Here is your 4 Year Plan!");
        System.out.println(" Year 1: MATH151 CHEM101 PHYS121H MATH152 PHYS122H  CMSC201");
        System.out.println(" Year 2: PHYS224 PHYS122L MATH251 PHYS220 PHYS324 MATH225");
        System.out.println(" Year 3: PHYS303 PHYS330L MATH221 PHYS321 PHYS320L");
        System.out.println(" Year 4: PHYS424 PHYS431L PHYS300 PHYS407");
    }

    public void printPsychology() {
        System.out.println("Here is your 4 Year Plan!");
        System.out.println(" Year 1: PSYCH100 MATH150 PSYCH210 BIOL141 STAT121");
        System.out.println(" Year 2: PSYC309 CHEM101 BIOL142 CHEM102 PSYCH300-Level Distribution Requirement");
        System.out.println(" Year 3: PSYC397 PSYC311 BIOL302 PSCY397 PSYC312");
        System.out.println(" Year 4: PSYC335 PSYC370 PSYC Electives");
    }

    public void printStatistics() {
        System.out.println("Here is your 4 Year Plan!");
        System.out.println(" Year 1: MATH151 MATH152 CMSC201");
        System.out.println(" Year 2: MATH251 MATH221 STAT355");
        System.out.println(" Year 3: STAT451 STAT454 ENGL393 STAT453 STAT Upper-Level Electives");
        System.out.println(" Year 4: STAT433 SPCH100 STAT Upper-Level Electives");
    }

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

