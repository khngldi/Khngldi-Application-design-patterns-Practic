public class Reader extends User {
    private String ticketNumber;

    public Reader(int id, String name, String email, String ticketNumber) {
        super(id, name, email);
        this.ticketNumber = ticketNumber;
    }

    public void requestBook(Book book) {
        System.out.println("Reader " + name + " is requesting the book: " + book.getBookInfo());
    }

    @Override
    public void displayInfo() {
        System.out.println("Reader: " + name + ", Email: " + email + ", Ticket: " + ticketNumber);
    }
}
