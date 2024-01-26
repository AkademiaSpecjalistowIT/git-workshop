import java.util.LinkedList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String book1 = "Zbrodnia i kara, Fiodor Dostojewski, 2021, 1";
        String book2 = "Chłopiec z latawcem, Khaled Hosseini, 2021, 1";
        String book3 = "Atomowe nawyki. Drobne zmiany, niezwykłe efekty,James Clear, 2017,1";
        
        List<String> library = new LinkedList<String>();
        library.add(book1);
        library.add(book2);
        library.add(book3);

        library.forEach((value) -> System.out.println(value));
        System.out.println(library.get(0));
        String prompt;
        int marker = 2;
        prompt = "Fiodor Dostojewski";
    }
        }





