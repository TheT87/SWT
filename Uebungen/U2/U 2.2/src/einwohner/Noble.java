package einwohner;

public class Noble extends Inhabitant {
    @Override
    public int tax() {
        int tax = super.tax();
        if (tax > 20){
            tax = 20;
        }

        return tax;
    }
}
