abstract public class Bauteil {


    protected String id;
    public abstract double preis();

    public Bauteil(){

    }

    public String getId(){
        return id;
    }

    public Bauteil getBauteil(){
        return this;
    }

}
