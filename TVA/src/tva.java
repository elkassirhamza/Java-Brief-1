import java.util.Scanner;

public class tva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre :");
        Double montant = sc.nextDouble();
        System.out.println("Vous souhaite une remise ? (Y/N)");
        char reponse = sc.next().charAt(0);
        if (reponse != 'y' && reponse != 'n') {
            System.out.println("try Again");
        }
        else if (reponse == 'y') {

            System.out.println("Entrer la remise");
            double rem = sc.nextDouble();
            double ttc=(montant+(montant*20) / 100);
            System.out.println("Le prix apres calclule de TTC est :  " +ttc );
            double remise=ttc-(ttc*rem/100);
            System.out.println("Le prix apres calclule est :  " +remise+"MAD" );
        }
        else if (reponse == 'n') {
            System.out.println("Le prix sans TVA est :" + montant );
        }
    }
}

