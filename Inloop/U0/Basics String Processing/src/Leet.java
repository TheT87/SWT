public class Leet {

    String normal ;
    public Leet(){

    }
    public String getNormal() {
        return normal;
    }

    public static String toLeet(String normal){
        normal = normal.replace("elite","1337");
        normal = normal.replace("cool","k3wl");
        normal = normal.replace("!","!!!11");
        normal = normal.replace("ck","xx");
        normal = normal.replace("ers","0rz");
        normal = normal.replace("er","0rz");
        normal = normal.replace("en","n");
        normal = normal.replace("e","3");
        normal = normal.replace("t","7");
        normal = normal.replace("o","0");
        normal = normal.replace("a","@");
        System.out.println(normal);
        return normal;
    }



    public static String[] allToLeet(String[] normals){
        String[] leet = new String[normals.length];
        for (int i = 0;i<leet.length;i++){

            String test = toLeet(normals[i]);
            leet[i]=test;

        }

        return leet;
    }

    @Override
    public String toString() {
        return normal;
    }

}
