import java.util.Scanner;
public class IsItPrimeNumber {

    public static boolean prime(int a){
        for(int i=2; i<a; i++){
            if(a%i == 0){
                return false;
            }
        }return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER VALUE");
        int value = sc.nextInt();
        for(int i = 0; i<value; i++){
            if(prime(i)){
                if(i == 0 || i == 1){
                    continue;
                }
                System.out.println(i);
        }

        }
    }
}
