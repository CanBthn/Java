import java.util.Scanner;
public class RecoQRep {
    
    
    public static float recopower(float a, float b){
        if(b==0) return 1;
        else if(a==0) return 0;
        else if(a>0 && b>0) return a*recopower(a, b-1); 
        else if(a>0 && b<0) return (1/a)*recopower(1/a, -b-1);
        else if(a<0 && b>0) {
            if(b%2==0){
                return a*recopower(a, b-1);
            }else return -(a*recopower(a, b-1));
        }else {
            if(b%2==0){
                return -((1/a)*recopower(1/a, -b-1));
            }else return -((1/a)*recopower(1/a, -b-1));
        }
     }   
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE ENTER TWO VALID VALUE");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println(recopower(a, b));

    }
}