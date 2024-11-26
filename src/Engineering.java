import java.util.Scanner;

public class Engineering extends SuggestClasses{

    private int type;
    private int track;

    public Engineering(){
        super("engineering");
        this.type = 0;
    }

    public Engineering(String major){
        super(major);
        this.type = 0;
    }

    @Override
    public void setType() {
        System.out.print("Which kind of engineering are you? \n1: Chemical\n2: Computer \n3: Mechanical\n");
        Scanner input = new Scanner(System.in);
        this.type = input.nextInt();
    }

    public int getType() {
        return type;
    }

    public int getTrack() {
        return track;
    }

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

    public static void printMechanical() {
        System.out.println("Here is your 4 year plan!");
        System.out.println(" Year 1: CHEM101 MATH151 ENES101 CHEM102 CHEM102L PHYS121 MATH152 ENME110");
        System.out.println(" Year 2: ENME220 STAT355 MATH251 PHYS122 ENME221 MATH225 ENME204 ENME217");
        System.out.println(" Year 3: CMPE306 ENME320 ENME303 ENME301 ENME304 ENME321 ENME360 ENME332L");
        System.out.println(" Year 4: ENME403 ENME432L ENME482L ENME444");
    }

    private static final String[][] chemPlan = {
            {"Year 1:", "CHEM101", "MATH151", "ENES101", "CHEM102", "CHEM102L", "PHYS121", "MATH152"},
            {"Year 2:","ENCH215","CHEM351","MATH251","ENCH225L","MATH225","PHYS122"},
            {"Year 3:","ENCH300","ENCH425","ENCH427","ENCH440","ENCH442"},
            {"Year 4:","ENCH444", "ENCH445","ENCH446"}
    };
    private static final String[][] compPlan = {
            {"Year 1:","CMSC201","CMSC202","PHYS121","MATH151","MATH152","CMPE212","ENES101"},
            {"Year 2:","MATH251","PHYS122","CMSC203", "CMPE306L","MATH225","CMPE310","CMSC341"},
            {"Year 3:","CMPE314","CMPE311","MATH221", "CMPE320","CMPE349"},
            {"Year 4:","CMSC411","CMPE450","CMPE451"}
    };


}