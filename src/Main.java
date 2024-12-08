/**
 * The {@code Main} class serves as the entry point for the program.
 * <p>
 * It contains the {@code main} method, which initiates the program by calling
 * the {@code dialogueLoop} method of the {@code Dialogue} class.
 * </p>
 */
public class Main {

    /**
     * The main method, which serves as the program's starting point.
     * <p>
     * This method calls the {@code dialogueLoop} method to start the program's
     * interactive dialogue system.
     * </p>
     *
     * @param args Command-line arguments passed to the program (not used).
     */
    public static void main(String[] args) {
        Dialogue.dialogueLoop();
    }
}