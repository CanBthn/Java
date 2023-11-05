import java.util.Scanner;
public class ebobexercise {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE ENTER TWO VALID VALUE");
        int j = 0;
        int k = 0;
        int n = 0;
        int i = 0;
        j = sc.nextInt();
        k = sc.nextInt();
        if(j<k){
            for(i=1; i<=j; i++){
                if(j%i==0 && k%i==0){
                    n = i;
            }
        }
        }else{
                for(i= 1;i<=k; i++){
                    if(j%i==0 && k%i==0){
                        n = i;
                    }
                }
            }

System.out.println("ebob is "+ n);
}
    }