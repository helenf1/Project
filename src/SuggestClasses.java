import java.util.Scanner;

public class SuggestClasses {

    // main choice thing
    public static void main(String[] args) {
        // maybe will ask this somewhere else but wanted to make this section functional vv
        System.out.println("What is your major? Please write it in full using title caps. (ex. Biochemistry and Molecular Biology)");
        Scanner input = new Scanner(System.in);
        String major = input.nextLine();

        switch (major) {
            case "Information Systems", "Information systems", "information systems", "IS", "is" -> informationSystems();
            case "Computer Science", "computer science", "Computer science" -> computerScience();
            case "Biochemistry", "biochemistry", "Biochemistry and Molecular Biology", "biochemistry and molecular biology" -> bioChemistry();
            case "Bioinformatics", "Bioinformatics and Computational Biology" -> bioInformatics();
            case "Biology", "Biological Sciences", "Biological sciences" -> biologicalSciences();
            default -> System.out.println("Invalid major.");
            // etc. for all the majors
        }
        generalEducation();
    }


    public static void informationSystems() {
        System.out.println("As an Information Systems major, here are the major classes you can take with no prerequisites:");
        System.out.println("COMP101: Computational Thinking and Design");
        System.out.println("ECON101: Principles of Microeconomics");
        System.out.println("MATH155: Applied Calculus");
        System.out.println("IS147: Introduction to Computer Programming");
        System.out.println("MGMT210: The Practice of Management");
        System.out.println("ECON102: Principles of Macroeconomics");
    }

    public static void computerScience(){
        System.out.println("As an Information Systems major, here are the major classes you can take with no prerequisites:");
        System.out.println("CMSC201: Computer Science I");
        System.out.println("MATH151: Calculus & Analytic Geometry");
    }

    public static void bioChemistry() {
        System.out.println("As a Biochemistry & Molecular Biology major, here are the major classes you can take with no prerequisites:");
        System.out.println("MATH151: Calculus and Analytic Geometry");
        System.out.println("CHEM101: Principles of Chemistry 1");
        System.out.println("BIO141: Foundations of Biology: Cells, Energy, & Org.");
    }

    public static void bioInformatics() {
        System.out.println("As a Bioinformatics & Computational Biology major, here are the major classes you can take with no prerequisites:");
        System.out.println("MATH151: Calculus and Analytic Geometry");
        System.out.println("CHEM101: Principles of Chemistry 1");
        System.out.println("BIO141: Foundations of Biology: Cells, Energy, & Org.");
    }

    public static void biologicalSciences() {
        System.out.println("As a Biological Sciences major, here are the major classes you can take with no prerequisites:");
        System.out.println("MATH151: Calculus and Analytic Geometry");
        System.out.println("CHEM101: Principles of Chemistry 1");
        System.out.println("BIO141: Foundations of Biology: Cells, Energy, & Org.");
    }


    //gen ed requirements; add to end of every list of major classes?
    public static void generalEducation(){
        System.out.println("In addition, these are the General Education requirements as a UMBC student:");
        System.out.println("English Composition: Completion of English 100 or equivalent course");
        System.out.println("Arts/Humanities: Three courses with \"AH\" designation from at least two disciplines");
        System.out.println("Social Sciences: Three courses with \"SS\" designation from at least two disciplines");
        System.out.println("Mathematics: One course in mathematics or statistics");
        System.out.println("Sciences: Two courses with the \"S\" designation, including one lab");
        System.out.println("Culture: One course with the \"C\" designation");
        System.out.println("Language: Completion of foreign language through the 201 level");
    }


}
