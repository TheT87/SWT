public class Library {

    private Book [] myBooks;
    private int searchNum = 0;

    private int number;

    public Library() {
        myBooks = new Book[10];
        number = 0;
        System.out.println("Hello, I am a library, which can store up to 10 books!");
    }

    public void add(Book book) {
        if (number >= 10){
            System.out.println("The library is full!");
            return;}
        myBooks[number] = book;
        number += 1;
        System.out.println("I added the book " + book + "!");

    }

    public Book search(String title){
        for (int i = 0; i < myBooks.length; i++){
            if (myBooks[i] != null && myBooks[i].toString().equals(title)) {
                System.out.println("The book with the title " + title + " exists in the library!");
                searchNum = i;
                return myBooks[i];
            }
        }

        System.out.println("The book with the title " + title + " does not exist in the library!");
        return null;
    }

}