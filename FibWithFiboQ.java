import java.util.Scanner;
public class FibWithFiboQ {
    public static int fibo(int i){
        if(i==0) return 0;
        if(i==1) return 1;
        return i+fibo(i-1);
    }
    
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE ENTER VALID VALUE");
        int i = sc.nextInt();
        System.out.println(fibo(i));

    }
}