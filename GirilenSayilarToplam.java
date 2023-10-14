import java.util.Scanner;
public class GirilenSayilarToplam {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //GİRİLECEK 5 SAYININ TOPLAMI OLACAKTIR
        System.out.println("Toplamak İstediğiniz Değerleri Giriniz.");
        int sum = 0;
        for(int i = 0; i < 5 ; i++){
            int number = sc.nextInt();
            sum += number;
        }
        System.out.println("Girdiğiniz 5 Sayının Toplamları = " + sum);
    }
}