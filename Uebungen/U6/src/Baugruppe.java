import java.util.HashSet;
import java.util.Set;

public class Baugruppe extends Bauteil {
    Set<Bauteil> bauteile;

    public double preis() {
        double result = 0.0;
        for (Bauteil teil : bauteile) {
            result = teil.preis();
        }
        return result;
    }
    public boolean removeBauteil(Bauteil teil){
        if (bauteile.size()>=2){
            bauteile.remove(teil);
        }
        return false;
    }

    public void addBauteil(Bauteil teil){
        bauteile.add(teil);
    }

    public Baugruppe(Bauteil teil, String id){
        this.id = id;
        bauteile = new HashSet<>();
        bauteile.add(teil);
    }
}
