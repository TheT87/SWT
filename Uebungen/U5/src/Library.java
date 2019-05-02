import java.util.*;


public class Library {

    private Set<Book> stock = new HashSet<>();


    public void setStock(Set<Book> stock) {
        this.stock = stock;
    }

    public Collection<Book> getStock(){
        return stock;
    }



    public boolean insertBook(Book newBook ){
        return stock.add(newBook);
    }


    public Book searchForIsbn(String isbn) {
        Objects.requireNonNull(isbn);
        for (Book b:stock) {
            if(b.getIsbn().equals(isbn)){
                return b;
            }
        }
        return null;
    }

    public Collection<Book> searchForAuthor(String author) {
        Objects.requireNonNull(author);
        Collection<Book> result = new HashSet<>();
        for (Book b : stock) {
            if (b.getAuthor().equals(author)) {
                result.add(b);
            }
        }
        return result;
    }


    public Map<String, Set<Book>> listStockByAuthor(){
        Map<String,Set<Book>> map = new HashMap<>();


        for (Book b : stock) {
            Set<Book> placeholder = new HashSet<>();

            if (map.containsKey(b.getAuthor())) {
                placeholder=map.get(b.getAuthor());
                placeholder.add(b);
                map.put(b.getAuthor(), placeholder);
            }
            else{
                placeholder.add(b);
                map.put(b.getAuthor(), placeholder);
            }

        }
        return map;
    }
}
