import java.util.ArrayList;
import java.util.List;

public class Library implements Searchable {
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();
    private List<Loan> loans = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getBookInfo());
    }

    @Override
    public List<Book> searchBook(String title) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added: " + user.getName());
    }

    public void issueBook(Book book, Reader reader) throws Exception {
        if (book.isAvailable()) {
            book.changeAvailability(false);
            loans.add(new Loan(book, reader));
            System.out.println("Book \"" + book.getBookInfo() + "\" issued to " + reader.getName());
        } else {
            throw new Exception("Book \"" + book.getBookInfo() + "\" is already issued.");
        }
    }

    public void returnBook(Book book) throws Exception {
        for (Loan loan : loans) {
            if (loan.getBook().equals(book)) {
                loans.remove(loan);
                book.changeAvailability(true);
                System.out.println("Book \"" + book.getBookInfo() + "\" has been returned.");
                return;
            }
        }
        throw new Exception("This book is not in the loan records.");
    }
}
