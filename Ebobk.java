import java.util.Scanner;
public class Ebobk{
    
    //ÖĞRENİLECEK BİLGİ
    //Fonksiyon yazarken return kısmı ne bastırmak istediğimizi söyler
    //Print aşamasında fonksiyonda hangi değerler ile oynadığımızın önemi vardır.
    
    
    
    
    public static int ebob(int a, int b){
        int c = 0;
        for(int i = 1; i<=a && i<=b; i++){
            if((a%i==0) && (b%i==0)){
                c = i;
                }
            }
            return c;
        }
    
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE ENTER TWO VALID VALUE");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(ebob(a,b));

    }
}