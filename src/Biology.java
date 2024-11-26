import java.util.Scanner;

public class Biology extends SuggestClasses {

    private int type;

    public Biology() {
        super("biology");
        this.type = 0;
    }

    public Biology(String major) {
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

    public void bioScienceBA() {
        fourYearPlan(bioFourYear, " MATH155\n", " PHYS122l BIOL302\n", " BIOL303 BIOL300L\n");

    }

    public void bioScienceBS() {
        fourYearPlan(bioFourYear, " MATH151\n", "CHEM351L BIOL303 BIOL300L\n", " \n");
    }

    public void bioEdu() {
        System.out.println("Here is your 4 year plan!");
        System.out.println(" Year 1: BIO141 MATH155 PSYC100 BIOL142 CHEM101 GES110");
        System.out.println(" Year 2: BIOL302 CHEM102 PSYC210 EDUC310 BIOL303 BIOL397 CHEM102L PHYS111 EDUC311");
        System.out.println(" Year 3: BIOL300L CHEM351 PHYS112 STAT350 EDUC412 EDUC388 EDUC410");
        System.out.println(" Year 4: BIOL302L EDUC427 EDUC411 GES311 EDUC456 EDUC457");
    }


    private static final String[][] bioFourYear = {
            {"Year 1:", "CHEM101", "BIOL141", "BIO142", "CHEM102", "CHEM102L"},
            {"Year 2:", "CHEM351"},
            {"Year 3:", "PHYS111", "STAT350", "PHYS112"},
            {"Year 4:", "Upper-Level BIOL Electives"}
    };
}


