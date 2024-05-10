package basicAlgorithms.yasinHoca;


//6- 1'den 100'e kadar olan sayıların toplamını bulunuz?
public class Question6 {


    public static void main(String[] args) {

        int total = 0 ;

        for (int i = 0 ; i<=100 ; i++){
            total += i  ;
        }

        System.out.println("Total : " + total );
    }
}
