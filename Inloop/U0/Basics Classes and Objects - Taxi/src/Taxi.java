


public class Taxi {

    Human driver ;
    Human passenger;
    Human[] taxi = new Human[4];
    Human[] test ;

    public Taxi (Human driver){
       this.driver = driver;

    }

    public String getDriverName() {
        return driver.toString();
    }
    int i = 0;
    int j = 0;

    public void add(Human passenger){
        if (i<4){
            taxi[i] = passenger;
            System.out.println(passenger + " gets in.");
            j++;
        }

        if (i>=4){
            System.out.println("We are sorry, " + passenger + ". The taxi is full.");

        }
        i++;
    }


    public String choose(){
        //System.out.println(i);
        switch(i){
            case 0:
                //j=0;
                return "nobody";
            case 1:
               // j=1;
                return taxi[0].toString();
            case 2:
              //  j=2;
                return taxi[0].toString() + " and " + taxi[1].toString();
            case 3:
             //   j=3;
                return taxi[0].toString() + ", " + taxi[1].toString() + " and " + taxi[2].toString();
            default:
              //  j=4;
                return taxi[0].toString() + ", " + taxi[1].toString() + ", " + taxi[2].toString() + " and " + taxi[3].toString();


        }
    }

    public Human[] allGetOut() {
        test  = new Human[j];
            for(j=0;j<test.length;j++) {
                //System.out.println("j= " + j);

                test[j] = taxi[j];
                //System.out.println("taxi: " + taxi[j].toString());
                //System.out.println("test: " + test[j].toString());
            }
            i=0;
            j=0;
            return test;
    }

    public Human[] getTest() {
        return test;
    }

    @Override
    public String toString() {
        return ("This is the taxi of " + driver + ". He takes " + choose()  + " along.");

    }
}
