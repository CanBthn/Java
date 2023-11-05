public class Recursive {
    /*public static void recurse(int c) {
        if(c != 3){
            System.out.println("hello");
            recurse(c+1);
        }
        System.out.println("The function with c ="+ c + " is complete");    
    }*/



    public static int summation(int a){
        if(a==0){
            return 0;
        }else{
            return a + summation(a-1);
        }
    }


    public static void main(String[] args){
        System.out.println(summation(10));
    }
}