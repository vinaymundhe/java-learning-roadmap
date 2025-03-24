package intermediate.oop.librarybooktracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Library Book Tracker (Using ArrayList + OOP):
Build a console-based app to manage a list of books in a small library. You should be able to:
- Add a new book.
- Remove a book by title.
- Search for a book by title.
- Display all books in the library.
 */

public class LibraryBookTracker {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        boolean toContinue = true;

        while (toContinue) {
            System.out.println("Library Book Tracker: \n" +
                    "1. Add Book\n" +
                    "2. Remove Book\n" +
                    "3. Search Book\n" +
                    "4. Display All Books\n" +
                    "5. Exit");
            int userInput = scn.nextInt();

            List<Book> listOfBooks = new ArrayList<>();

            switch (userInput) {
                case 1:
                    System.out.println("Enter Title:");
                    String titleByUser = scn.nextLine();
                    System.out.println("Enter Author:");
                    String authorByUser = scn.nextLine();
                    System.out.println("Enter Year Published:");
                    int yrPublishedByUser = scn.nextInt();

                    Book bookToAdd = new Book(titleByUser, authorByUser, yrPublishedByUser);
                    listOfBooks.add(bookToAdd);
                    System.out.println(titleByUser + "book added Successfully!");
                    break;

                case 2:
                    System.out.println("Enter Book Title you want to remove:");
                    String titleToRemove = scn.nextLine();

                    for (Book book : listOfBooks) {
                        if (titleToRemove.equalsIgnoreCase(book.getTitle())) {
                            listOfBooks.remove(book.getTitle());
                        }
                    }
                    System.out.println(titleToRemove + " book removed.");
                    break;

                case 3:
                    System.out.println("Enter Book Title you want to search:");
                    String titleToSearch = scn.nextLine();

                    for (Book bookSearch : listOfBooks) {
                        if (titleToSearch.equalsIgnoreCase(bookSearch.getTitle())) {
                            System.out.println("Tile: " + bookSearch.getTitle());
                            System.out.println("Author: " + bookSearch.getAuthor());
                            System.out.println("Year Published: " + bookSearch.getYearPublished());
                        }
                    }
                    break;

                case 4:
                    for (Book allBooks : listOfBooks) {
                        System.out.println("List of all Books: " + allBooks);
                    }
                    break;

                case 5:
                    toContinue = false;
                    break;
            }
        }
    }
}
