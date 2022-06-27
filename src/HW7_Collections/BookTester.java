package HW7_Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class BookTester {

    public static void main(String[] args) {


        Book book1 = new Book(120, "Book 1", "Soft", 234);
        Book book2 = new Book(130, "Book 2", "Hard", 170);
        Book book3 = new Book(140, "Book 3", "Soft", 280);
        Book book4 = new Book(150, "Book 4", "Hard", 134);
        Book book5 = new Book(160, "Book 5", "Soft", 547);
        Book book6 = new Book(170, "Book 6", "Hard", 256);
        Book book7 = new Book(180, "Book 7", "Soft", 168);
        Book book8 = new Book(190, "Book 8", "Hard", 278);
        Book book9 = new Book(200, "Book 9", "Soft", 365);
        Book book10 = new Book(210, "Book 10", "Hard", 86);


        ArrayList<Book> bookCollection =
                new ArrayList<>(Arrays.asList(book1, book2, book3,
                        book4, book5, book6, book7, book8, book9, book10));

        ArrayList<String> booksWithSoftCover = new ArrayList<>();
        ArrayList<String> booksWithHardCover = new ArrayList<>();


        for (int i = 0; i < bookCollection.size(); i++) {

            if (book1.getCoverType().equals("Soft")) {
                booksWithSoftCover.add(book1.getTitle());
            } else {
                booksWithHardCover.add(book1.getTitle());
            }


            if (book2.getCoverType().equals("Soft")) {
                booksWithSoftCover.add(book2.getTitle());

            } else {
                booksWithHardCover.add(book2.getTitle());

            }

            if (book3.getCoverType().equals("Soft")) {
                booksWithSoftCover.add(book3.getTitle());

            } else {
                booksWithHardCover.add(book3.getTitle());

            }

            if (book4.getCoverType().equals("Soft")) {
                booksWithSoftCover.add(book4.getTitle());

            } else {
                booksWithHardCover.add(book4.getTitle());

            }
            if (book5.getCoverType().equals("Soft")) {
                booksWithSoftCover.add(book5.getTitle());

            } else {
                booksWithHardCover.add(book5.getTitle());

            }
            if (book6.getCoverType().equals("Soft")) {
                booksWithSoftCover.add(book6.getTitle());

            } else {
                booksWithHardCover.add(book6.getTitle());

            }
            if (book7.getCoverType().equals("Soft")) {
                booksWithSoftCover.add(book7.getTitle());

            } else {
                booksWithHardCover.add(book7.getTitle());

            }
            if (book8.getCoverType().equals("Soft")) {
                booksWithSoftCover.add(book8.getTitle());

            } else {
                booksWithHardCover.add(book8.getTitle());

            }
            if (book9.getCoverType().equals("Soft")) {
                booksWithSoftCover.add(book9.getTitle());

            } else {
                booksWithHardCover.add(book9.getTitle());

            }
            if (book10.getCoverType().equals("Soft")) {
                booksWithSoftCover.add(book10.getTitle());

            } else {
                booksWithHardCover.add(book10.getTitle());

            }
            break;

        }


        System.out.println("В магазине есть след книги: ");
        for (Object booksAll : bookCollection) {
            System.out.println(booksAll);
        }

        System.out.println("В магазине есть след книги с мягким переплетом: ");
        for (Object booksSoft : booksWithSoftCover) {
            System.out.println(booksSoft);
        }

        System.out.println("В магазине есть след книги с твердым переплетом: ");
        for (Object booksHard : booksWithHardCover) {
            System.out.println(booksHard);

        }
    }
}