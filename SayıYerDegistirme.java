import java.util.Scanner;
public class SayıYerDegistirme {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Öncelikle elimizde 2 tane sayı olacak.
        //Bu sayıları a ve b ise a = b b = a değerini alacak.
        //Bunun için bir tane gecici değer tutmam gerekmektedir.
        System.out.println("A DEGERİNİ GİRİNİZ");
        int a = sc.nextInt();
        System.out.println("B DEGERİNİ GİRİNİZ");
        int b = sc.nextInt();
        //Burada b değeri 7 olacak a değeri ise 4 olacak.
        //Eğer a == b yaparsam a değeri 4 olur ama b değeri yok olur.A değerini saklamam gerekmekte.
        System.out.println("A DEGERİ = " + a + " / B DEGERİ = " + b);
        int c;
        c = a;  // C değeri şuan 7. a=7, b=4, c=7;
        a = b;
        b = c;
        System.out.println("A degeri = "+ a + " / B Degeri = " + b);
        

    }
}