import java.time.LocalDate;

public class Loan {
    private Book book;
    private Reader reader;
    private LocalDate loanDate;
    private LocalDate returnDate;

    public Loan(Book book, Reader reader) {
        this.book = book;
        this.reader = reader;
        this.loanDate = LocalDate.now();
    }

    public void returnLoan() {
        this.returnDate = LocalDate.now();
        book.changeAvailability(true);
        System.out.println("Book \"" + book.getBookInfo() + "\" returned by " + reader.getName());
    }

    public Book getBook() {
        return book;
    }
}
