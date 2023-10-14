import java.util.Scanner;
import java.util.Random;
public class NumaraTahminDoWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random(System.currentTimeMillis());
        int attempts = 0;
        int num = -1;
        int r = rd.nextInt(100);
        do{
            System.out.println("LÜTFEN TAHMİN GİRİNİZ");
            num = sc.nextInt();
            if(num==r){
                attempts++;
                continue;
            }else if(num<r){
                System.out.println("YUKARI ÇIKIN");
                attempts++;
            }else{
                System.out.println("AŞAĞI İNİN");
                attempts++;
            }


        }while( r!= num);
        System.out.println("OYUNU " + attempts + " TURDA KAZANDINIZ");

    }
}