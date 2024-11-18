import java.util.Scanner;

public class CScience {

    public static void main(String[] args) {

        askTrack();

    }

    public static void askTrack() {

        System.out.print("Which pathway are you most interested in taking?\n1. AI\n2. Cyber Security\n3. Data Science\n4. Game Development\n5. Standard");

        Scanner input = new Scanner(System.in);

        int type = input.nextInt();

        switch (type) {

            case 1 -> ai();

            case 2 -> cyber();

            case 3 -> data();

            case 4 -> game();

            case 5 -> standard();

            default -> System.out.println("Please select one of the options above");

        }

    }

    public static void ai() {

        System.out.println("This is your 4 year plan for AI:");

        System.out.println("Year 1: CMSC 201, CMSC 202, CMSC 203, MATH 151, MATH 152");

        System.out.println("Year 2: CMSC 331, CMSC 341, CMSC 313, Math 221");

        System.out.println("Year 3: CMSC 304, CMSC 411, CMSC 471, STAT 355, CMSC 421, CMSC 478, CMSC 4XX AI/ML elective");

        System.out.println("Year 4: CMSC 441, CMSC 447, and 2 CMSC 4XX AI/ML electives");

    }

    public static void cyber() {

        System.out.println("This is your 4 year plan for Cyber Security:");

        System.out.println("Year 1: CMSC 201, CMSC 202, CMSC 203, MATH 151, MATH 152");

        System.out.println("Year 2: CMSC 331, CMSC 341, CMSC 313, Math 221");

        System.out.println("Year 3: CMSC 304, CMSC 411, CMSC 421, STAT 355, CMSC 426, and 2 CMSC 4XX Cyber electives");

        System.out.println("Year 4: CMSC 441, CMSC 447, CMSC 487, CMSC 4XX elective");

    }

    public static void data() {

        System.out.println("This is your 4 year plan for Data Science:");

        System.out.println("Year 1: CMSC 201, CMSC 202, CMSC 203, MATH 151, MATH 152");

        System.out.println("Year 2: CMSC 331, CMSC 341, CMSC 313, Math 221");

        System.out.println("Year 3: CMSC 304, CMSC 411, STAT 355, CMSC 491, CMSC 421, CMSC 4XX elective, CMSC 4XX Data elective");

        System.out.println("Year 4: CMSC 441, CMSC 447, CMSC 487, CMSC 4XX elective, and 2 CMSC 4XX Data electives");

    }

    public static void game() {

        System.out.println("This is your 4 year plan for Game Development:");

        System.out.println("Year 1: CMSC 201, CMSC 202, CMSC 203, MATH 151, MATH 152");

        System.out.println("Year 2: CMSC 331, CMSC 341, CMSC 313, Math 221");

        System.out.println("Year 3: CMSC 304, CMSC 411, CMSC 435, STAT 355, CMSC 421, CMSC 471, CMSC 4XX elective (437, 445, 461, 481, or 483");

        System.out.println("Year 4: CMSC 441, CMSC 447, CMSC 493, CMSC 4XX elective (437, 445, 455, 461, 481, or 483)");

    }

    public static void standard() {

        System.out.println("This is your 4 year plan for Computer Science:");

        System.out.println("Year 1: CMSC 201, CMSC 202, CMSC 203, MATH 151, MATH 152");

        System.out.println("Year 2: CMSC 331, CMSC 341, CMSC 313, Math 221");

        System.out.println("Year 3: CMSC 304, CMSC 411, STAT 355, CMSC 421, and 3 CMSC 4XX electives");

        System.out.println("Year 4: CMSC 441, CMSC 447, and 2 CMSC 4XX electives");

    }

}
