public class Fac {
    public static int factorial(int n) {
        if(n==0) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    public static void main (String ar []) {
        int n=5;
        int factorial = factorial(n);
        System.out.println("the fac" +n+ "is"+ factorial);
    }
}
