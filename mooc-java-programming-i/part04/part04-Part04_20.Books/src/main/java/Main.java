import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> listBooks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Title: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.println("Publication year: ");
            int year = Integer.parseInt(scanner.nextLine());

            listBooks.add(new Book(name, pages, year));
        }

        System.out.println("What information will be printed?");
        String ans = scanner.nextLine();

        for (Book book : listBooks) {
            if (ans.equals("everything")) {
                System.out.println(book);
            } else if (ans.equals("name")) {
                System.out.println(book.getTitle());
            }
        }
    }
}
