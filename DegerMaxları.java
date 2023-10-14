public class DegerMaxları {
    public static void main(String[] args){
        
        
        /*System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);
        */

        // BYTE ---- SHORT ----- İNT ------ LONG     SOLDAN SAĞA DOĞRU SAKLANIR SAĞDAN SOLA SAKLANMAZ
        // YANİ BYTE DEĞERLERİ İNT DEĞERLEİRNDE SAKLANIR VE ÇEVRİLİR AMA İNT DEĞERLERİ ÇEVRİLMEYEBİLİR.

        /*short a = 1000;
        int b = a/2;
        System.out.println(b); */

        /*int a = 1000;
        byte b = (byte)(a/2);           //DEĞER KAYBI YAŞANIYOR
        System.out.println(b);*/

        byte a = 1;
        short b = 2;
        int c = 3;
        long d = a+b+c;
        System.out.println(d);     // SIRAYLA DÖNŞÜME GİDER

    }
}