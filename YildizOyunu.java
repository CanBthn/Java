public class YildizOyunu {
    public static void main(String[] args){
        for(int i = 0; i < 5 ; i++){
            //System.out.println();      //Print sonrası sonda % bırakır.
            for(int a = 0; a <10 ; a ++){
                System.out.print("*");
            }
            System.out.println();     //Print sonrası sonda % bırakmaz.
        }
    }
}