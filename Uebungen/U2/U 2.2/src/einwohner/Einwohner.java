package einwohner;

public class Einwohner {
    protected int einkommen;

    public int zuVersteuerndesEinkommen(){
        return einkommen;
    }

    public int steuer(){
        int steuer = (int) (zuVersteuerndesEinkommen() * 0.1);
        if (steuer <= 1) steuer =1 ;
        return steuer;
    }

    public void setEinkommen(int einkommen){
        this.einkommen = einkommen;
    }

}
