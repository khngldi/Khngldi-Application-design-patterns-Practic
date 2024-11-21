import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Library library = new Library();

            Author author1 = new Author("J.K. Rowling", "Famous for Harry Potter series");
            Author author2 = new Author("J.R.R. Tolkien", "Famous for The Lord of the Rings");

            Book book1 = new Book("Harry Potter", "12345", 1997);
            Book book2 = new Book("The Hobbit", "67890", 1937);
            book1.changeAvailability(true); // Книга доступна
            book2.changeAvailability(true);
            library.addBook(book1);
            library.addBook(book2);

            Reader reader = new Reader(1, "Alice", "alice@example.com", "T001");
            Librarian librarian = new Librarian(2, "Bob", "bob@example.com");
            library.addUser(reader);
            library.addUser(librarian);

            librarian.issueBook(book1, reader);

            try {
                librarian.issueBook(book1, reader);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            librarian.returnBook(book1);

            try {
                librarian.returnBook(book1);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            List<Book> foundBooks = library.searchBook("Harry Potter");
            if (!foundBooks.isEmpty()) {
                System.out.println("Found books:");
                for (Book book : foundBooks) {
                    System.out.println(book.getBookInfo());
                }
            } else {
                System.out.println("No books found with the given title.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
