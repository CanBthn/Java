public class FiboWRecu {
    public static int fibo(int a){
        if(a==0)      return 0;
        else if(a==1) return 1;
        else          return a = fibo(a-1) + fibo(a-2);
    }
    
    
    public static void main(String[] args){
        System.out.println("FİBO(10) = " + fibo(10));
    }
}