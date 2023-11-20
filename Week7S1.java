import java.util.Random;
public class Week7S1 {
    public static void main(String[] args){
       Random rd = new Random(System.currentTimeMillis());
        int min = 1;
        int max = 6;
        int[] dice = {0,0,0,0,0,0,0}; //Array lenght is 7 for the last value press dice[6]
        for(int i = 0; i<=10000000; i++){
            int random = rd.nextInt(min, max+1);
            dice[random]++;
         }
    for(int i = 1; i<dice.length; i++){
        System.out.println("Element " + i + ":" + dice[i]);

    }
    }
}