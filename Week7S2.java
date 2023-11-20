public class Week7S2{
    public static void revArray (int[] array){
        int[] second = new int[array.length];
        for(int i = 0; i<array.length; i++){
            second[i] = array[i];
        }
        int a = array.length-1;
        for(int i = 0; i<array.length; i++){
            array[i] = second[a];
            a--;
        }
        for(int i = 0; i<array.length; i++){
            System.out.println(array[i]);
    }
}
   public static void main(String[] args){
        int[] first = new int[100];
        for(int i = 0; i<first.length; i++){
            first[i] = i+1;
            System.out.println(first[i]);
        }
        revArray(first);
    }
}