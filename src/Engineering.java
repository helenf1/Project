import java.util.Scanner;

public class Engineering {
    public static void main(String[] args) {
        askTrack();
    }

    public static void askTrack() {
        System.out.print("Which kind of engineering are you? \n1: Chemical\n2: Computer \n3: Mechanical\n");
        Scanner input = new Scanner(System.in);
        int type = input.nextInt();
        switch (type) {
            case 1 -> chemical();
            case 2 -> computer();
            case 3 -> mechanical();
        }
    }

    public static void chemical() {
        System.out.print("Which track are you on? \n1: Traditional\n2: Biotechnology/Bioengineering \n3: Environmental Engineering & Sustainability\n");
        Scanner input = new Scanner(System.in);
        int type = input.nextInt();
        switch (type) {
            case 1 -> chemTraditional();
            case 2 -> chemBiotech();
            case 3 -> chemEnvironmental();
        }
    }

    public static void chemFourYearPlan(String year1Add, String year2Add, String year3Add, String year4Add){
        System.out.println("Here is your 4 Year Plan!");
        for (String s : chemYear1) {
            System.out.print(" " + s);
        }
        System.out.print(year1Add);
        for (String s : chemYear2) {
            System.out.print(" " + s);
        }
        System.out.print(year2Add);
        for (String s : chemYear3) {
            System.out.print(" " + s);
        }
        System.out.print(year3Add);
        for (String s : chemYear4) {
            System.out.print(" " + s);
        }
        System.out.print(year4Add);
    }

    public static void chemTraditional() {
        chemFourYearPlan(" ENME110\n"," CHEM351L\n"," CHEM301 CHEM311L CHEM302\n"," ENCH437L\n");
    }

    public static void chemBiotech() {
        chemFourYearPlan(" BIOL141\n"," BIOL303 CHEM352\n", " CHEM437 CHEM303\n"," ENCH482 ENCH485L\n");
    }

    public static void chemEnvironmental() {
        chemFourYearPlan(" ENME110\n"," ENCH2101 CHEM352\n"," ENCH410 CHEM303\n"," ENCH437L ENCH414 ENCH412\n");
    }

    public static void computer() {
        System.out.print("Which track are you on? \n1: Electronic Systems\n2: Communications \n3: Cybersecurity\n");
        Scanner input = new Scanner(System.in);
        int type = input.nextInt();
        switch (type) {
            case 1 -> computerElecSyst();
            case 2 -> computerCommunications();
            case 3 -> computerCybersecurity();
        }
    }
    public static void compFourYearPlan(String year1Add, String year2Add, String year3Add, String year4Add){
        System.out.println("Here is your 4 Year Plan!");
        for (String s : compYear1) {
            System.out.print(" " + s);
        }
        System.out.print(year1Add);
        for (String s : compYear2) {
            System.out.print(" " + s);
        }
        System.out.print(year2Add);
        for (String s : compYear3) {
            System.out.print(" " + s);
        }
        System.out.print(year3Add);
        for (String s : compYear4) {
            System.out.print(" " + s);
        }
        System.out.print(year4Add);
    }

    public static void computerElecSyst() {
        compFourYearPlan("\n","\n"," CMSC421 CMPE415\n"," CMSC421 CMPE315\n");
    }
    public static void computerCommunications() {
        compFourYearPlan("\n","\n"," CMPE323 CMPE330\n"," CMSC421\n");
    }
    public static void computerCybersecurity() {
        compFourYearPlan("\n","\n"," CMSC421 CMPE415\n"," CMPE315 CMSC426 CMSC481\n");
    }

    public static void mechanical() {

    }

    public static final String[] chemYear1 = {"Year 1:", "CHEM101", "MATH 151", "ENES101",
            "CHEM102", "CHEM102L", "PHYS121", "MATH152"};
    public static final String[] chemYear2 = {"Year 2:","ENCH215","CHEM351","MATH251"
            ,"ENCH225L","MATH225","PHYS122"};
    public static final String[] chemYear3 = {"Year 3:","ENCH300","ENCH425","ENCH427","ENCH440",
            "ENCH442"};
    public static final String[] chemYear4 = {"Year 4:","ENCH444", "ENCH445","ENCH446"};
    public static final String[] compYear1 = {"Year 1:","CMSC201","CMSC202","PHYS121",
            "MATH151","MATH152","CMPE212","ENES101"};
    public static final String[] compYear2 = {"Year 2:","MATH251","PHYS122","CMSC203",
            "CMPE306L","MATH225","CMPE310","CMSC341"};
    public static final String[] compYear3 = {"Year 3:","CMPE314","CMPE311","MATH221",
            "CMPE320","CMPE349"};
    public static final String[] compYear4 = {"Year 4:","CMSC411","CMPE450","CMPE451"};
}
