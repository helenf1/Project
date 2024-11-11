import java.util.Scanner;

public class Biology {
    public static void main (String[] args){
        askTrack();
    }

    public static void askTrack() {
        System.out.println("Which kind of biology are you? \n1: Biological Sciences B.A \n2: Biological Sciences B.S \n3: Biology Education \n4: Biochemistry & Molecular Biology \n5: Bioinformatics & Computational Biology");
        Scanner input = new Scanner(System.in);
        int type = input.nextInt();
        switch (type) {
            case 1 -> bioScienceBA();
            case 2 -> bioScienceBS();
            case 3 -> bioEdu();
            //case 4 -> biochem();
            //case 5 -> bioinform();
            default -> System.out.println("Invalid option.");
        }
    }

    public static void bioScienceBA() {
        System.out.print("Which track are you on? \n1: Pre-Med\n2: Pre-Nursing \n3: Pre-Dental\n");
        Scanner input = new Scanner(System.in);
        int type = input.nextInt();
        switch (type) {
            case 1 -> bioFourYearPlan(" ENME110\n"," CHEM351L\n"," CHEM301 CHEM311L CHEM302\n"," ENCH437L\n");
            case 2 -> bioFourYearPlan(" BIOL141\n"," BIOL303 CHEM352\n", " CHEM437 CHEM303\n"," ENCH482 ENCH485L\n");
            case 3 -> bioFourYearPlan(" ENME110\n"," ENCH2101 CHEM352\n"," ENCH410 CHEM303\n"," ENCH437L ENCH414 ENCH412\n");
            default -> System.out.println("Invalid option.");
        }
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

    public static void bioScienceBS() {
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
    public static void bioFourYearPlan1(String year1Add, String year2Add, String year3Add, String year4Add){
        System.out.println("Here is your 4 Year Plan!");
        for (String s : bioBAYear1) {
            System.out.print(" " + s);
        }
        System.out.print(year1Add);
        for (String s : bioBAYear2) {
            System.out.print(" " + s);
        }
        System.out.print(year2Add);
        for (String s : bioBAYear3) {
            System.out.print(" " + s);
        }
        System.out.print(year3Add);
        for (String s : bioBAYear4) {
            System.out.print(" " + s);
        }
        System.out.print(year4Add);
    }

    public static void bioEdu() {
        System.out.println("Here is your 4 year plan!");
        System.out.println(" Year 1: CHEM101 MATH151 ENES101 CHEM102 CHEM102L PHYS121 MATH152 ENME110");
        System.out.println(" Year 2: ENME220 STAT355 MATH251 PHYS122 ENME221 MATH225 ENME204 ENME217");
        System.out.println(" Year 3: CMPE306 ENME320 ENME303 ENME301 ENME304 ENME321 ENME360 ENME332L");
        System.out.println(" Year 4: ENME403 ENME432L ENME482L ENME444");
    }

    private static final String[] bioYear1 = {"Year 1:", "CHEM101", "MATH155", "ENGL GEP",
            "Elective", "BIOL141", "CHEM102", "CHEM102L"};
    private static final String[] bioYear2 = {"Year 2:","BIOL142","CHEM351","BIOL302"
            ,"GEP","GEP","Upper Level Elective"};
    private static final String[] bioYear3 = {"Year 3:","BIOL303","BIOL300L","PHYS111","BIOL Elective",
            "STAT350", "PHYS112"};
    private static final String[] bioYear4 = {"Year 4:","BIOL Upper Level Lab Elective",
            "Writing Intensive Course","BIOL Elective", "Upper Level Research"};
    private static final String[] bioBAYear1 = {"Year 1:","CMSC201","CMSC202","PHYS121",
            "MATH151","MATH152","CMPE212","ENES101"};
    private static final String[] bioBAYear2 = {"Year 2:","MATH251","PHYS122","CMSC203",
            "CMPE306L","MATH225","CMPE310","CMSC341"};
    private static final String[] bioBAYear3 = {"Year 3:","CMPE314","CMPE311","MATH221",
            "CMPE320","CMPE349"};
    private static final String[] bioBAYear4 = {"Year 4:","CMSC411","CMPE450","CMPE451"};


    }


