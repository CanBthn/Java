import java.util.Scanner;
public class MidtermExLast {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE ENTER VALID");
        int sum = 0;
        int max = 0;
        int min = 0;
        int hotd= 0;
        int pleasentd = 0;
        int coldd=0;
        int temp = sc.nextInt();
        if(temp>=30){ 
            sum +=temp;
            hotd++;
            max = temp;
            min = temp;
            System.out.println("HOT DAY");
        }
        else if(temp<=29 && temp >=17){ 
            sum +=temp;
            pleasentd++;
            max = temp;
            min = temp;
            System.out.println("PLEASENT DAY");
        }
        else if(temp<=16 && temp>-1000){
            sum +=temp;
            coldd++;
            max = temp;
            min = temp;
            System.out.println("COLD DAY");
        }
        boolean counter = true;
        while(counter==true){
        System.out.println("PLEASE ENTER VALID");
        temp = sc.nextInt();
        if(temp>=30){ 
            sum +=temp;
            hotd++;
            if(max<temp) max=temp;
            if(min>temp) min = temp;
            System.out.println("HOT DAY");
        }
        else if(temp<=29 && temp >=17){
            sum +=temp; 
            pleasentd++;
            if(max<temp) max=temp;
            if(min>temp) min = temp;
            System.out.println("PLEASENT DAY");
        }
        else if(temp<=16 && temp>-1000){
            sum +=temp;
            coldd++;
            if(max<temp) max=temp;
            if(min>temp) min = temp;
            System.out.println("COLD DAY");
        }else if (temp==-1000){ 
            System.out.println("YOU ENTER -1000 THİS MEAN PROGRAM İS STOP"); 
            counter=false;
        }
        }     
        System.out.println("HOT DAYS = " + hotd + "\nPLEASENT DAYS = " + pleasentd + "\nCOLD DAYS = " + coldd); 
        System.out.println("MAX DEGREE IS " + max + "\nMİN DEGREE IS " + min);  
        float count = hotd+coldd+pleasentd;
        System.out.println("AVERAGE DEGREE IS " + ((float)sum/count));
    }
}   