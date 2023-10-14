import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("YAPMAK İSTEDİĞİN İŞLEMİ GİRİNİZ...\nToplama için 1....\nÇıkarma için 2.....\nÇarpma için 3....\nBölme için 4.....");
        int a = sc.nextInt();

        // Bundan sonrası switch case olarak devam etmesi gerekmektedir
        // Aldığımız sayılara göre switch case yap

        switch(a) {
            case 1:  // DİKKAT ETMEK GEREKMEKTEDİR "NOKTALI VİRGÜL DEĞİL"  " İKİ NOKTA ÜST ÜSTE"
            System.out.println("LÜTFEN TOPLAMAK İSTEDİĞİNİZ İKİ DEĞERİ GİRİNİZ...");
                int b = sc.nextInt();
                int c = sc.nextInt();
                System.out.println("TOPLAMLARI: " + (b + c));
                break;
            case 2:  
            System.out.println("LÜTFEN ÇIKARMAK İSTEDİĞİNİZ İKİ DEĞERİ GİRİNİZ...");
                int d = sc.nextInt();
                int e = sc.nextInt();
                System.out.println("FARKLARI: " + (d - e));
                break;
            case 3:
            System.out.println("LÜTFEN ÇARPMAK İSTEDİĞİNİZ İKİ DEĞERİ GİRİNİZ...");
                int f = sc.nextInt();
                int g = sc.nextInt();
                System.out.println("ÇARPIMLARI " + f*g);
                break;
            case 4:
            System.out.println("LÜTFEN BÖLMEK İSTEDİĞİNİZ İKİ DEĞERİ GİRİNİZ...");
                int j = sc.nextInt();
                int k = sc.nextInt();
                System.out.println("BÖLÜMLERİ " + (float)j/k);
                break;
        }
    }
}