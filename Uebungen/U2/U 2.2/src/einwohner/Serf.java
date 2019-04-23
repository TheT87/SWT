package einwohner;

public class Serf extends Peasant {
    @Override
    public int taxableIncome() {
        int zve = this.Income - 12;
        return (zve > 0 ? zve:0);
    }
}
