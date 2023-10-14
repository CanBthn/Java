import java.util.Scanner;
public class BuyukSayı {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        System.out.println("PLEASE ENTER FİRST VALID VALUE");
        int a = sc.nextInt();
        System.out.println("PLEASE ENTER FİRST VALID VALUE");
        int b = sc.nextInt();
        System.out.println("PLEASE ENTER FİRST VALID VALUE");
        int c = sc.nextInt();
        
        int highnumber = 0;

        if (a > b){
            if(a>c){
                highnumber = a;
            }else if(c>a){
                highnumber = c;
            }
        }
        else if(b>c){
            highnumber = b;
            }
        else{
            highnumber = c;
        }
        System.out.println("HIGHER VALUE IS = " + highnumber);
        
        }
    }