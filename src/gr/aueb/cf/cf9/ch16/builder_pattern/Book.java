package gr.aueb.cf.cf9.ch16.builder_pattern;

public class Book {
    private final long id;
    private final String title;
    private final String author;
    private final String isbn;

    private Book(Builder buidler) {
        this.id = buidler.id;
        this.title = buidler.title;
        this.author = buidler.author;
        this.isbn = buidler.isbn;

    }

    public static class Builder {
        private final long id;
        private final String isbn;
        private String title = "";
        private String author = "";

        public Builder(long id, String isbn) {
            this.id = id;
            this.isbn =  isbn;

        }
        // Fluent Setter - returns the Builder object
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
