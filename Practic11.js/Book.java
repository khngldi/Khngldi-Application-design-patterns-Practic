import java.util.List;

public class Book {
    private String title;
    private String isbn;
    private List<Author> authors;
    private int publicationYear;
    private boolean isAvailable;

    public Book(String title, String isbn, int publicationYear) {
        this.title = title;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public void changeAvailability(boolean status) {
        this.isAvailable = status;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getBookInfo() {
        return "Title: " + title + ", ISBN: " + isbn + ", Year: " + publicationYear;
    }
}
