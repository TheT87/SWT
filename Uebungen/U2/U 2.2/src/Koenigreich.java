import einwohner.*;

public class Koenigreich {

	public static void main(String[] args) {

		steuerbescheid(new King(), 20);
        steuerbescheid(new Noble(), 20);
        steuerbescheid(new Peasant(), 20);
        steuerbescheid(new Serf(), 20);
	}




	static void steuerbescheid(Inhabitant inhabitant, int Income) {
        inhabitant.setIncome(Income);
        System.out.println(inhabitant.getClass().getName() +
           ": Einkommen " + Income +
           ", zu versteuerndes Einkommen " +
           inhabitant.taxableIncome() +
           ", Steuer " + inhabitant.tax());

    }
}
