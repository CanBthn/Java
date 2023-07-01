import java.util.Scanner;
public class BodyMIndex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR HEIGHT AND WEIGHT TO CALCULATE YOUR BODY MASS INDEX");
        System.out.println("Length (In meters)");
        double length = sc.nextDouble();
        System.out.println("ENTER YOUR WEIGHT (KG)");
        int weight = sc.nextInt();
        double BodyM = (weight/(length*length));
        System.out.println("BODY MASS INDEX = " + BodyM);
    }
}