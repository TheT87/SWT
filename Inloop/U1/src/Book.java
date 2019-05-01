public class Book {
    private String title;

    private Boolean isLent;

    public Book(String title) {
        this.title = title;
        this.isLent = false;
        System.out.println("Book " + title + " created.");
    }

    public String toString() {
        return title;
    }

    public void loan(){
        if (this.isLent){
            System.out.println("Dieses Buch ist bereits vergriffen");
        } else {
            System.out.println("Viel Spaß beim Lesen!");
            setLent(false);
        }
    }

    public Boolean isLent() {
        return isLent;
    }

    public void setLent(Boolean lent) {
        isLent = lent;
    }
}
