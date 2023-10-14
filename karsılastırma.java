public class karsılastırma {
    public static void main(String[] args){
        
        /*
        System.out.println(3==3);
        System.out.println(3 != 3);
        System.out.println(3 > 2);
        System.out.println( 2 >= 2);
        */


        // && and anlamı vardır
        // || or anlamı verir
        // ! not anlamı verir
        System.out.println(3 == 3 && 2!=2); // ve olduğundan biri yanlış sonuç yanlış
        System.out.println(3 == 3 || 2 == 3); // veya anlamı olduğundan dolayı sonuç doğru
        System.out.println("BATUHAN" == "BATUHAN"); // 1-1 aynı olduğundan doğru
        System.out.println("BATUHAN" == "batuhan"); // biri büyük biri küük ondan dolayı eşit değil
        System.out.println( !(3>2)); // 3 2 den büyüktür ama başına not koyarak olumsuz yaptık
    }
}