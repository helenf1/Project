import java.util.Scanner;

public class Biology extends SuggestClasses {

    private int type;

    public Biology(){
        super("biology");
        this.type = 0;
    }

    public Biology(String major){
        super(major);
        this.type = 0;
    }

    @Override
    public void setType() {
        System.out.println("Which kind of biology are you? \n1: Biological Sciences B.A \n2: Biological Sciences B.S \n3: Biology Education");
        Scanner input = new Scanner(System.in);
        this.type = input.nextInt();
    }

    public int getType() {
        return type;
    }

    @Override
    public void printClasses(){
        switch (this.type) {
            case 1 -> bioScienceBA();
            case 2 -> bioScienceBS();
            case 3 -> bioEdu();
            //case 4 -> biochem();
            //case 5 -> bioinform();
            default -> System.out.println("Invalid option.");
        }
        for (String s : super.GENERALEDUCATION) {
            System.out.print(s + '\n');
        }
    }

    public void bioScienceBA() {
        System.out.print("Which track are you on? \n1: Pre-Med\n2: Pre-Nursing \n3: Pre-Dental\n");
        Scanner input = new Scanner(System.in);
        int type = input.nextInt();
        switch (type) {
            case 1 -> bioFourYearPlan(" BIO430\n"," CHEM437 \n"," PHYS111\n"," PHYS121\n");
            case 2 -> bioFourYearPlan(" STAT 121\n"," CHEM 123 \n", " CHEM124\n"," BIOL273L\n");
            case 3 -> bioFourYearPlan(" BIO300L\n"," PHYS122l\n"," CHEM352 CHEM352L\n"," BIOL430 CHEM 437\n");
            default -> System.out.println("Invalid option.");
        }
    }

    public void bioScienceBS() {
        System.out.print("Which track are you on? \n1: Pre-Med\n2: Pre-PA \n3: Pre-Nursing\n");
        Scanner input = new Scanner(System.in);
        int type = input.nextInt();
        switch (type) {
            case 1 -> bioFourYearPlan("\n","\n"," CMSC421 CMPE415\n"," CMSC421 CMPE315\n");
            case 2 -> bioFourYearPlan("\n","\n"," CMPE323 CMPE330\n"," CMSC421\n");
            case 3 -> bioFourYearPlan("\n","\n"," CMSC421 CMPE415\n"," CMPE315 CMSC426 CMSC481\n");
            default -> System.out.println("Invalid option.");
        }
    }

    public void bioEdu() {
        System.out.println("Here is your 4 year plan!");
        System.out.println(" Year 1: BIO141 MATH155 PSYC100 BIOL142 CHEM101 GES110");
        System.out.println(" Year 2: BIOL302 CHEM102 PSYC210 EDUC310 BIOL303 BIOL397 CHEM102L PHYS111 EDUC311");
        System.out.println(" Year 3: BIOL300L CHEM351 PHYS112 STAT350 EDUC412 EDUC388 EDUC410");
        System.out.println(" Year 4: BIOL302L EDUC427 EDUC411 GES311 EDUC456 EDUC457");
    }

    public static void bioFourYearPlan(String year1Add, String year2Add, String year3Add, String year4Add){
        System.out.println("Here is your 4 Year Plan!");
        for (String s : bioYear1) {
            System.out.print(" " + s);
        }
        System.out.print(year1Add);
        for (String s : bioYear2) {
            System.out.print(" " + s);
        }
        System.out.print(year2Add);
        for (String s : bioYear3) {
            System.out.print(" " + s);
        }
        System.out.print(year3Add);
        for (String s : bioYear4) {
            System.out.print(" " + s);
        }
        System.out.print(year4Add);

    }

    private static final String[] bioYear1 = {"Year 1:", "CHEM101", "MATH151", "ENGL GEP",
            "Elective", "BIOL141", "CHEM102", "CHEM102L"};
    private static final String[] bioYear2 = {"Year 2:","BIOL142","CHEM351","BIOL302"
            ,"MATH155"};
    private static final String[] bioYear3 = {"Year 3:","BIOL303","BIOL300L","PHYS111","STAT350",
            "MATH155", "PHYS112"};
    private static final String[] bioYear4 = {"Year 4:","BIOL Upper Level Lab Elective",
            "STAT350","BIOL Elective", "Upper Level Research"};
    private static final String[] bioBAYear1 = {"Year 1:","CMSC202","PHYS121",
            "MATH151","MATH152"};
    private static final String[] bioBAYear2 = {"Year 2:","MATH251","PHYS122","MATH225"};
    private static final String[] bioBAYear3 = {"Year 3:","BIOL141","BIOL302","MATH221",
            "CMPE320","CMPE349"};
    private static final String[] bioBAYear4 = {"Year 4:","BIOL303","BIOL300L","BIOL397"};


    }


