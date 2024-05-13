package basicAlgorithms.yasinHoca;


//11- 0 ile 1000 arasındaki Fibonacci sayılarını bulan programı yazınız?

public class Question11 {


    public static void main(String[] args) {


        int max = 1000;

        System.out.println("Fibonacci numbers up to " + max + ":");
        int n1 = 0;
         int n2 = 1 ;

         int n3 ;

        System.out.print(n1 + " " + n2);

        n3 = n1 + n2;
        while (n3 <= max) {
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }
    }
}
