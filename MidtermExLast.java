import java.util.Scanner;
public class MidtermExLast {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        int hotd= 0;
        int pleasentd = 0;
        int coldd=0;
        int max = 0;
        int min = 0;
        int sum = 0;
        int negativecontrol=0;
        while(temp>-1000){
        System.out.println("PLEASE ENTER VALID");
        temp = sc.nextInt();
        if(temp>=30){ 
            System.out.println("HOT DAY");
            hotd++;
            }
        else if(temp<=29 && temp >=17){
            System.out.println("PLEASENT DAY");
            pleasentd++;
            }
        else if(temp<=16 && temp>-1000){
            System.out.println("COLD DAY"); 
            coldd++;
            }
        else break;
        negativecontrol = temp;
        sum +=temp;
        if(max==0) max = negativecontrol;
        if(max<temp) max=temp;
        if(min>temp) min = temp;
}  
        System.out.println("YOU ENTER -1000 THİS MEAN PROGRAM İS STOP");
        System.out.println("HOT DAYS = " + hotd + "\nPLEASENT DAYS = " + pleasentd + "\nCOLD DAYS = " + coldd); 
        System.out.println("MAX DEGREE IS " + max + "\nMİN DEGREE IS " + min);  
        float count = hotd+coldd+pleasentd;
        System.out.println("AVERAGE DEGREE IS " + ((float)sum/count));}}   
