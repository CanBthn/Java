import java.util.Scanner;
public class ForQuiz {
    public static int sum(int a, int b){
        int c = a +b;
        return c; // a +b de olabilir.
}
    
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sum(a,b));

    }
}