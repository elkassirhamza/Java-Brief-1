import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Collection {
    public static void main(String[] args) {

       // String[] mois = {"Janvier", "Fevrier", "mars", "Avril", "Mai", "Juin", "Juillet", "Aôut", "September", "November", "October", "December"};
        ArrayList<String> mois = new ArrayList<>();
        mois.add("Janvier");
        mois.add("Fevrier");
        mois.add("mars");
        mois.add("Avril");
        mois.add("Mai");
        mois.add("Juin");
        mois.add("Aout");
        mois.add("September");
        mois.add("November");
        mois.add("October");
        mois.add("December");

        //System.out.println(mois); //Question1

        //System.out.println(mois.get(3));  //Question 2

        //System.out.println(mois.get(5));  //Question 3

        for (int i=0 ; i<11; i++){
           // System.out.println(mois.get(i)); //Question 4
        }

        //Question 5
        mois.set(7,"Aôut");
        //System.out.println(mois.get(7));

        //Question 6
        mois.add(0,"test");
        //System.out.println(mois.get(0));

        //Question 7
        mois.remove(2);
        //System.out.println(mois);

        //Question 8

        //System.out.println(mois.size());

        //Question 9

        //Collections.sort(mois);
        //System.out.println(mois);

        //Question 10
        /*
        ArrayList<String> Lcopier = new ArrayList<String>();
        Lcopier.addAll(mois);
        System.out.println(Lcopier + " Nov list ");
        */
        //Question 11

        ArrayList<String> Clonedlist = (ArrayList<String>)mois.clone();
        //System.out.println(Clonedlist + "List cloner");

        //Question 12

        // System.out.println("list est vide ?" + Clonedlist.isEmpty());

        //Question 13

        HashSet<String> mois2= new HashSet<String>();
        mois2.add("Janvier");
        mois2.add("Fevrier");
        mois2.add("mars");
        mois2.add("Avril");
        mois2.add("Mai");
        mois2.add("Juin");
        mois2.add("Aout");
        mois2.add("September");
        mois2.add("November");
        mois2.add("October");
        mois2.add("December");

       // System.out.println(mois2);

        //Question 14
        /*
        for (String i : mois2) {
            System.out.println(i);
        } */

        //Question 15

        // System.out.println(mois2.size());

        //Question 16

        mois2.clear();
        //System.out.println(mois2);

        //Question 17 //Question 18

        boolean isEmpty = mois2.isEmpty();
       // System.out.println(isEmpty);

        //Question 19
        HashMap<String,String> Capitals= new HashMap<String, String>() ;

        Capitals.put("Maroc", "Rabat");
        Capitals.put("Spain", "Madrid");
        Capitals.put("Italy", "Roma");
        Capitals.put("France", "Paris");

        System.out.println(Capitals);

        //Question 20
        System.out.println(Capitals.size());

        //Question 21

        HashMap<String,String> CopyCapitals = new HashMap<String, String>();
        CopyCapitals.putAll(Capitals);
        System.out.println(CopyCapitals);

        //Question 22

        CopyCapitals.remove("Maroc");
        System.out.println(CopyCapitals);


    }
}
