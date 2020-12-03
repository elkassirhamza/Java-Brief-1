public class Boucle {

    public static void main(String[] args) {
        int i;
        float m;
        for (i = 0; i < 10; i++) {
            //System.out.println(i);
        }


        for (int j = 1; j < 30; j++) {
            for (i = 2; i <= 100; i++) {
                int r = j * i;
                System.out.println(j+" * "+i+" = " +r);
            }
            System.out.println("========================");
            System.out.println("la multiplication est : "+i*j);
        }

        for (double a = 1.0; a < 10; a += a / 2) {
           // System.out.println(a);
        }

        for (i = 1; i <= 15; i++) {
            //System.out.println("On y arrive presque..."+ i);
        }

        for (i = 20; i >= 0; i--) {
            //System.out.println("C'est presque bon..."+i);
        }

        for (i = 1; i <= 100; i = i + 15) {
            //System.out.println("C'est presque bon..."+i);
        }

        for (i = 200; i >= 0; i = i - 12) {
            //System.out.println("Enfin ! ! !"+i);
        }

    }
}
