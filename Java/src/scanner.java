import java.util.Scanner;  // Import the Scanner class

class scan {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter votre prénom");

        String userName = myObj.nextLine();
        System.out.println("Bonjour " + userName);
    }
}