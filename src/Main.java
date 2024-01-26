import java.util.LinkedList;
import java.util.List;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String book1 = "Zbrodnia i kara, Fiodor Dostojewski, 2021, 1";

        List<String> library = new LinkedList<String>();
        library.add(book1);

        library.forEach((value) -> System.out.println(value));
        System.out.println(library.get(0));

        int input = showMenu();
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
                } catch (InputMismatchException e) {
                    scanner.nextLine();
                }
            } while (input != 1 && input != 2 && input != 3 && input != 4 && input != 5);
        }
        return input;
    }
}






