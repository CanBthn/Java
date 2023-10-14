import java.util.Random;
import java.util.Scanner;
public class NumaraTahmin{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random(System.currentTimeMillis());
        int r = rd.nextInt(100);
        int n = -1;
        int attemp = 1;
        boolean a = true;
        while(a == true){
            System.out.println("TAHMİNİZİ YAZINIZ:");
            n = sc.nextInt();
            if(r == n){
                System.out.println("OYUNU KAZANDINIZ");
                a = false;
                break;
            }else if(n < r){
                System.out.println("YUKARI ÇIKIN");
                attemp++;
                continue;
            }else if(n > r){
                System.out.println("AŞAĞI İNİN");
                attemp++;
                continue;
            }
        }
        

    }
}