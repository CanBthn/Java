import java.util.Scanner;
public class overloadingcalcu {
   
    public static int collection(int a, int b){
        return a+b;
    }
    public static int extraction(int a, int b){
        return a-b;
    }
    public static int multiplication(int a, int b){
        return a*b;
    }
    public static double partition(double a, double b){
        return a/b;
    }
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operation you want to perform\n**************");
        System.out.println("FOR COLLECTION 1");
        System.out.println("FOR EXTRACTION 2");
        System.out.println("FOR MULTIPLICATION 3");
        System.out.println("FOR PARTITION 4\n**************");
        int a = sc.nextInt();
        switch (a){
            case 1:
            System.out.println("PLEASE ENTER 2 VALUE");
            int value1 = sc.nextInt();
            int value2 = sc.nextInt();
            System.out.println("RESULT "+collection(value1,value2));
            break;
            case 2:
            System.out.println("PLEASE ENTER 2 VALUE");
            int value3 = sc.nextInt();
            int value4 = sc.nextInt();
            System.out.println("RESULT "+extraction(value3,value4));
            break;
            case 3:
            System.out.println("PLEASE ENTER 2 VALUE");
            int value5 = sc.nextInt();
            int value6 = sc.nextInt();
            System.out.println("RESULT "+multiplication(value5,value6));
            break;
            case 4:
            System.out.println("PLEASE ENTER 2 VALUE");
            double value7 = sc.nextInt();
            double value8 = sc.nextInt();
            System.out.println("RESULT "+partition(value7,value8));
            break;
        }
    }
}