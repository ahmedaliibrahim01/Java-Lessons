import java.util.Scanner;

public class Java_36_PrimeNumbers {
    public static void main(String[] args) {
        for(int i=2; i<=100; i++){
            boolean isPrime= true;
            for(int j=2; j<i;j++){
                if(i%j==0){
                    isPrime= false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i +" ");
            }
        }
    }
}