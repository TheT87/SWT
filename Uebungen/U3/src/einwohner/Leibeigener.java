package einwohner;

import einwohner.Bauer;

public class Leibeigener extends Bauer {
    @Override
    public int zuVersteuerndesEinkommen() {
        int zve = this.einkommen - 12;
        return (zve > 0 ? zve:0);
    }
}
