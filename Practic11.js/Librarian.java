import java.util.List;

public class Librarian extends User {

    public Librarian(int id, String name, String email) {
        super(id, name, email);
    }

    public void issueBook(Book book, Reader reader) {
        if (book.isAvailable()) {
            book.changeAvailability(false);
            System.out.println("Book \"" + book.getBookInfo() + "\" has been issued to " + reader.getName());
        } else {
            System.out.println("Book \"" + book.getBookInfo() + "\" is not available for issuing.");
        }
    }

    public void returnBook(Book book) {
        book.changeAvailability(true);
        System.out.println("Book \"" + book.getBookInfo() + "\" has been returned.");
    }

    public void manageBooks(List<Book> books, String action, Book book) {
        switch (action.toLowerCase()) {
            case "add":
                books.add(book);
                System.out.println("Book \"" + book.getBookInfo() + "\" has been added to the library.");
                break;
            case "remove":
                books.remove(book);
                System.out.println("Book \"" + book.getBookInfo() + "\" has been removed from the library.");
                break;
            default:
                System.out.println("Invalid action. Use 'add' or 'remove'.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Librarian: " + name + ", Email: " + email);
    }
}
