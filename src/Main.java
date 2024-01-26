import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int input;

        input = showMenu();
        System.out.println(input);
    }

        private static int showMenu() {

            int input = 0;

        try (Scanner scanner = new Scanner(System.in)) {

            do {
                System.out.println("Welcome to the library. You can choose from the following options:\n" +
                        "Show book collections - enter 1:\n" +
                        "Search for book - enter 2:\n" +
                        "Borrow a book - enter 3:\n" +
                        "Add a book - enter 4:\n" +
                        "Remove book - enter 5:");
                try {
                    input = scanner.nextInt();
                } catch(InputMismatchException e) {
                    scanner.nextLine();
                }
            } while (input != 1 && input != 2 && input != 3 && input != 4 && input != 5);
        }
        return input;
    }
}
