public class Main {
    public static void main(String[] args) {

        int sayi1 = 58;
        int sayi2 = 43;
        int sayi3 = 39;
        int sayi4 = 27;
        int enBüyük = sayi1;

        if(enBüyük<sayi2) {
            enBüyük = sayi2;
        }

        if(enBüyük<sayi3) {
            enBüyük = sayi3;
        }

        if (enBüyük<sayi4) {
            enBüyük = sayi4;
        }
        System.out.println("En Büyük = "+enBüyük);


    }
}