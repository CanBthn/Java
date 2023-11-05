public class euclid {
    public static int fonk(int number1, int number2){
        if(number2 == 0) return number1;
        else return fonk (number2, number1 % number2);
    }
    
    
    public static void main(String[] args){
        System.out.println(fonk(10,2));

    }
}