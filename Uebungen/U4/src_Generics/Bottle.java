public class Bottle <T extends Drink> {
    private T content;
    private T content2;
    public boolean isEmpty(){
        return this.content == null;
    }

    public void fill(T content){
        if (!isEmpty())
            throw new IllegalStateException();
        this.content = content;
    }

    public T empty(){
        if (isEmpty())
            throw new IllegalStateException();

        content2 = content;
        content = null;
        return content2;
    }

}
