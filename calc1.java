import java.util.Scanner;
public class calc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which operation do you want to perform");
        System.out.println("1 For addition, 2 For subtraction, 3 For multiplication, 4 For division.");
        int a = sc.nextInt();
        switch (a) {
            case 1 :
            System.out.println("PLEASE ENTER TWO VALUE");
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println("The result of your addition " + (b+c));
            break;
            case 2 :
            System.out.println("PLEASE ENTER TWO VALUE");
            int d = sc.nextInt();
            int e = sc.nextInt();
            System.out.println("The result of your subtraction " + (d-e));
            break;
            case 3 :
            System.out.println("PLEASE ENTER TWO VALUE");
            int f = sc.nextInt();
            int g = sc.nextInt();
            System.out.println("The result of your multiplication " + (f*g));
            break;
            case 4 :
            System.out.println("PLEASE ENTER TWO VALUE");
            double h = sc.nextDouble();
            double j = sc.nextDouble();
            System.out.println("The result of your division " + (h/j));
            break;
        }
    }
}