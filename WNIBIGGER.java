import java.util.Scanner;
public class WNIBIGGER {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE ENTER 3 VALID VALUE");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ( a >= b && a >= c) {
            System.out.println("BIGGER NUMBER IS " + a);
        }
        else if ( b >= a && b >= c) {
            System.out.println("BIGGER NUMBER IS " + b);
        }
        else {
            System.out.println("BIGGER NUMBER IS " + c);
        }
    }
}