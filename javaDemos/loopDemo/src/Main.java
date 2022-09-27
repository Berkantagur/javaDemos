public class Main {
    public static void main(String[] args) {

        //for
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Döngü Bitti");

        for (int m = 1; m < 21; m += 3) {
            System.out.println(m);
        }
        System.out.println("For Döngü Bitti");


        //while
        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        //infinite loop: Sonsuz kere çalışır.
        System.out.println("While Döngüsü Bitti");

        int m = 2;
        while (m <= 50) {
            System.out.println(m);
            m += 2;
        }
        System.out.println("While2 Döngüsü Bitti");


        //Do-While
        int j = 1;
        do {
            System.out.println(j);
            j += 2;
        }
        while (j < 10);
        System.out.println("Do-While Döngüsü Bitti");
        //While döngüsünde kod hatalı olursa çalışmaz ama Do-While döngüsünde
        // döngü çalışmasa bile yapmak istediğiniz operasyon var ise 1 kez çalışır.

    }
}