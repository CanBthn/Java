import java.util.Scanner;
public class asal {
    public static boolean asalMı(int sayi){
        for(int i = 2; i<sayi; i++){
            if(sayi % i == 0){
                return false;

            }
        }return true;
    }
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("DEĞER GİRİNİZ");
        int a = sc.nextInt();
        for(int i = 0; i<a; i++){
            if(asalMı(i)){
                System.out.println(i);
            }

        }


    }
}