package Assignment;

import java.util.ArrayList;
import java.util.Iterator;

class Book {

    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title  = title;
        this.author = author;
        this.isbn   = isbn;
    }

    public String getIsbn()   { return isbn; }
    public String getTitle()  { return title; }
    public String getAuthor() { return author; }

    @Override
    public String toString() {
        return String.format("  %-35s | %-20s | ISBN: %s", title, author, isbn);
    }
}

class Library {

    private ArrayList<Book> books = new ArrayList<>();

    
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added: \"" + book.getTitle() + "\"");
    }

    
    public boolean removeBook(String isbn) {
        Iterator<Book> it = books.iterator();
        while (it.hasNext()) {
            Book b = it.next();
            if (b.getIsbn().equals(isbn)) {
                System.out.println("Removed: \"" + b.getTitle() + "\"");
                it.remove();
                return true;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
        return false;
    }

    
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("The library has no books.");
            return;
        }
        System.out.println("\n========== Library Catalog ==========");
        System.out.printf("  %-35s | %-20s | %s%n", "Title", "Author", "ISBN");
        System.out.println("  " + "-".repeat(70));
        for (Book b : books) {
            System.out.println(b);
        }
        System.out.println("=====================================\n");
    }
}

public class LibraryDemo {

    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book("The Great Gatsby",          "F. Scott Fitzgerald", "978-0743273565"));
        library.addBook(new Book("To Kill a Mockingbird",     "Harper Lee",          "978-0061935466"));
        library.addBook(new Book("1984",                      "George Orwell",       "978-0451524935"));
        library.addBook(new Book("Pride and Prejudice",       "Jane Austen",         "978-0141439518"));

        library.displayBooks();

        library.removeBook("978-0451524935");

        library.removeBook("000-0000000000");

        library.displayBooks();
    }
}
