package einwohner;

public class Inhabitant {
    protected int Income;

    public int taxableIncome(){
        return Income;
    }

    public int tax(){
        int tax = (int) (taxableIncome() * 0.1);
        if (tax <= 1) tax =1 ;
        return tax;
    }

    public void setIncome(int Income){
        this.Income= Income;
    }

}
