package einwohner;

public class Adel extends Einwohner {
    @Override
    public int steuer() {
        int steuer = super.steuer();
        if (steuer > 20){
            steuer = 20;
        }

        return steuer;
    }
}
