package nl.novi.opdrachten.methodes;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Schrijf een methode  die een List<Integer> ontvangt.
 *
 * Check in de methode of deze list 3 entries heeft.
 *
 * Wanneer dit niet zo is: return de foutmelding: "Er zijn te veel of te weinig getallen in de lijst."
 * BONUS: Kun je een foutmelding voor te veel en een foutmelding voor te weinig maken?
 *
 * Wanneer er wel drie getallen in zijn:
 * Return het volgende:
 * Een list met getallen gesorteerd van laag naar hoog.
 *
 * Je mag hier geen Collections.sort of java.streams gebruiken.
 *
 */
public class SorteerLijst {

    public static void main(String[] argeblabla) {

        List<Integer> wrongList = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6, 7, 8));
        List<Integer> correctList = new ArrayList<>(Arrays.asList(88, 888, 909909));
        List<Integer> betterList = new ArrayList<>(Arrays.asList(100, 5, 75));


        checkList(wrongList);

        System.out.println("original list");
        System.out.println(correctList);
        checkList(correctList);
        System.out.println("The numbers have not been changed, because they were already in the right order:");
        System.out.println(correctList);

        System.out.println("The original list");
        System.out.println(betterList);
        checkList(betterList);
        System.out.println("The numbers have now been sorted from low to high");
        System.out.println(betterList);

    }

    public static void checkList(List<Integer> integerList) {
        if (integerList.size() > 3) {
            System.out.println("Deze lijst: " + integerList + " heeft te veel getallen");
        } else if (integerList.size() < 3) {
            System.out.println("Deze lijst: " + integerList + " heeft te weinig getallen");
        } else {
            // nog oplossen van laag naar hoog
            for (int i = 0; i < (integerList.size()-1); i++) {

                int minIndTemp = Math.min(integerList.get(i), integerList.get(i+1));
                int maxIndTemp = Math.max(integerList.get(i), integerList.get(i+1));

                integerList.set(i, minIndTemp);
                integerList.set(i+1, maxIndTemp);


            }

        }

//        for (int i = 0; i <array.length; i++){
//            index = i;
//            for (int j = i ; j <= array.length-1; j++){
//                if (array[j] < array[index]){
//                    index = j;
//                }
//            }
//            int temp = array[i];
//            array[i] = array[index];
//            array[index] = temp;
//        }
    }
}


