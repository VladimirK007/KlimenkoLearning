package HW8_Exceptions.ArrayList;

import HW7_Collections.BookShop.Book;

import java.util.*;

public class ArrayListException {

    public static void main(String[] args) {
        book();

    }

    public static void book() {
        Book book1 = new Book(120, "Book 1", "Soft", 234);
        Book book2 = new Book(130, "Book 2", "Hard", 170);
        Book book3 = new Book(140, "Book 3", "Soft", 280);
        Book book4 = new Book(150, "Book 4", "Hard", 134);
        Book book5 = new Book(160, "Book 5", "Soft", 547);

        ArrayList<Book> bookCollection =
                new ArrayList<>(Arrays.asList(book1, book2, book3,
                        book4, book5));

        int input = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Type the book index: ");
            input = scanner.nextInt();
            System.out.println("Title of the searched book is: " + bookCollection.get(input));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("The book with the index " + input + " does not exist in the collection!");
        } catch (InputMismatchException e) {
            System.out.println("Format issue, the required type is numeric!");
        }
    }
}