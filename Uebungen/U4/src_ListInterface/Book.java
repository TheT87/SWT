import java.util.Objects;

public class Book implements Comparable<Book> {

    private String isbn = "";
    private String author = "";
    private String title = "";

    public Book(String isbn, String author, String title){
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }

    public Book(String isbn){

        this(isbn, "", "");
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        if (title.equals("")){
            return "";
        }
        return title;
    }

    //Isbn

    public void setIsbn(String isbn) {
        Objects.requireNonNull(isbn);
        this.isbn = isbn;
    }

    public String getIsbn() {

        return isbn;
    }

    // Author

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        if (author.equals("")){
            return "";
        }
        return author;
    }




    public int compareTo(Book b){
        return isbn.compareTo(b.getIsbn());
    }

    @Override
    public boolean equals(Object obj) {
        return (isbn.equals(((Book)obj).getIsbn()));
    }

    @Override
    public int hashCode() {
        return isbn.hashCode();
    }
}
