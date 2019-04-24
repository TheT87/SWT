import java.util.Objects;

public class Book implements Comparable<Book> {

    String isbn;
    String Author;
    public Book(String isbn){
        this.isbn = isbn;
    }


    public String getIsbn() {
        Objects.requireNonNull(Author);
        return isbn;
    }


    public void setIsbn(String isbn) {
        Objects.requireNonNull(isbn);

        this.isbn = isbn;
    }

    public String getAuthor() {
        return Author;
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
