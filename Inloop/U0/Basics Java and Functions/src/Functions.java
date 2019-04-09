public class Functions {
    public static int factorial(int n) {
       int factorial = 1;
       int i=0;
       for(i=2;i<=n;i++){
           factorial = factorial*i;
       }
    return factorial;
    }
}
