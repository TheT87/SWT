import org.w3c.dom.Node;

public class ListElement{

    String content;
    ListElement next;
    ListElement(String c){
        setContent(c);
        content = c;
        next = null;
    }

    public void setNext(ListElement next) {
        this.next = next;
    }

    public ListElement getNext() {
        return next;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        if(content.equals(""))
            throw new IllegalArgumentException("Eingabe sollte nicht leer sein!");
        if(content.equals(null))
            throw new NullPointerException("String sollte nicht null sein!");
        this.content = content;
    }

    @Override
    public String toString() {
        return content;
    }
}