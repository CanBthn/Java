import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class FonksTekrar {
    
        //İLK FONKSİYON PRİNT FONKSİYONU OLACAK
        /*public static void Hello(){
            System.out.println("HELLO");
        }*/
        //Bir Fonksiyonda işlem yaptıracaksam ayrı.
        public static int Fonks(int x){
            int n = 1;
            for(int i = 1; i <x ; i++){
                n *=i;  // KODUN BURADA X E EŞİT OLMAMA SEBEBİ EŞİT OLMA DURUMUNDA AŞAĞIDA ÇARPIM ALACAĞI
                        // ÖRNEĞİN 4 FAKTROİYEL 4.3.2.1.4 OLUYOR
            }
            return x*n;
        }
        
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("PLEASE ENTER VALID VALUE");
            int x = sc.nextInt();
            Fonks(x);
        
            System.out.println(Fonks(x));
        }          
}