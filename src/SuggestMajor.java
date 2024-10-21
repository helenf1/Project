import java.util.Scanner;

public class SuggestMajor {
    public static void suggest(){
        Scanner input = new Scanner(System.in);

        System.out.println("Examples: Math, English, Science, Social Studies");

        System.out.print("What classes are you interested in? ");
        String interestedClasses = input.next();

        if(interestedClasses.equals("Math"))
            System.out.println("You may be interested in a mathematics major, computer science major, information systems major");
        else if(interestedClasses.equals("English"))
            System.out.println("You may be interested in a language major");
        else if(interestedClasses.equals("Science"))
            System.out.println("You may be interested in a physics major, biology major or a chemistry major");
        else if(interestedClasses.equals("Social Studies"))
            System.out.println("You may be interested in an american history major, political science major or anthropology major");
        else
            System.out.println("You may want to go undecided");

    }
}
