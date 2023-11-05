import java.util.Scanner;
public class Fibonnaci {
    
    public static boolean fibonnaci(int a){
        int first = 0;
        int second = 1;
        int temp = 0;

        while(true){
            temp = first + second;
            //System.out.println(temp);
            first = second;
            second = temp;
            if(temp==a){
                return true;
            }
            else if(temp>=a){
                return false;
            }

        }
   }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE ENTER VALID VALUE");
        int a = sc.nextInt();
        System.out.println(fibonnaci(a));

    }

}