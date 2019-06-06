package quotes;

public class Quote {
    private String author;
    private String text;

    public Quote(String author, String text) {
        this.author = author;
        this.text = text;
    }

    public String toString() {
        return String.format("Quote: %s - Author: %s", this.text, this.author);
    }
}
