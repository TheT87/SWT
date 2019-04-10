public class Leet {

    String normal ;
    public Leet(){

    }
    public String getNormal() {
        return normal;
    }

    public static String toLeet(String normal){
        normal = normal.replaceAll("elite","1337");
        normal = normal.replaceAll("cool","k3wl");
        normal = normal.replaceAll("!","!!!11");
        normal = normal.replaceAll("ck","xx");
        normal = normal.replaceAll("ers","0rz");
        normal = normal.replaceAll("er","0rz");
        normal = normal.replaceAll("en","n");
        normal = normal.replaceAll("e","3");
        normal = normal.replaceAll("t","7");
        normal = normal.replaceAll("o","0");
        normal = normal.replaceAll("a","@");
        //System.out.println(normal);
        return normal;
    }



    public static String[] allToLeet(String[] normals){
        int i;
        String[] leet = new String[2];
        for (i = 0;i<leet.length;i++){

            String test = Leet.toLeet(normals[i]);
            leet[i]=test;
            System.out.println(leet);
        }

        return leet;
    }

    @Override
    public String toString() {
        return normal;
    }

}
