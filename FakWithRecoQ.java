import java.util.Scanner;
public class FakWithRecoQ {
    public static int fak(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return n*fak(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE ENTER VALID VALUE");
        int n = sc.nextInt();
        System.out.println(fak(n));
    }
}