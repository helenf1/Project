import java.util.Scanner;

public class SuggestClasses {

    // main choice thing
    public static void main(String[] args) {
        // maybe will ask this somewhere else but wanted to make this section functional vv
        System.out.println("What is your major? Please write it in full.");
        Scanner input = new Scanner(System.in);
        String major = input.nextLine();

        switch (major) {
            case "Information Systems", "Information systems", "information systems":
                informationSystems();
                break;
            case "Computer Science", "computer science", "Computer science":
                computerScience();
                break;
                // etc. for all the majors
        }
    }


    public static void informationSystems() {
        System.out.println("As an Information Systems major, here are the major classes you can take with no prerequisites:");
        System.out.println("COMP101: Computational Thinking and Design");
        System.out.println("ECON101: Principles of Microeconomics");
        System.out.println("MATH155: Applied Calculus");
        System.out.println("IS147: Introduction to Computer Programming");
        System.out.println("MGMT210: The Practice of Management");
        System.out.println("ECON102: Principles of Macroeconomics");
        generalEducation();
    }

    public static void computerScience(){

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
