import java.util.Scanner;
public class ChangeValue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE ENTER FIRST VALID VALUE");
        int a = sc.nextInt();
        System.out.println("PLEASE ENTER SECOND VALID VALUE");
        int b = sc.nextInt();
        System.out.println("NORMALLY FIRST VALUE İS = "+ a + " SECOND VALUE IS = "+b);
        System.out.println("HOWEVER BECAUSE OF THIS CODE");
        int c = a;
        a = b;
        b = c;
        System.out.println("FIRST VALUE IS = "+a + " SECOND VALUE IS = "+b);
    }
}