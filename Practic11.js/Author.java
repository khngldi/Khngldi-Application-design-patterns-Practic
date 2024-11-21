public class Author {
    private String name;
    private String biography;

    public Author(String name, String biography) {
        this.name = name;
        this.biography = biography;
    }

    public String getAuthorInfo() {
        return "Author: " + name + ", Biography: " + biography;
    }
}
