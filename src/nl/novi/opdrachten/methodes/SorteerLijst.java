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

        checkList(wrongList);

    }

    public static void checkList(List<Integer> list) {
        if (list.size() > 3) {
            System.out.println("Deze lijst heeft te veel getallen");
        } else if (list.size() < 3) {
            System.out.println("Deze lijst heeft te weinig getallen");
        } else {
            // nog oplossen van hoog naar laag
            for (int i = 0; i < list.size(); i++){




            }


            int index = -1;
            for (int i = 0; i < list.size(); i++) {
                index = i;
                for (int j = i; j < list.size() - 1; j++) {
                    if (list.get(j) < list.get(i)) {
                        index = j;
                    }
                }
                int temp = list.get(i);
                list.get(i) = list.get(index);
                list.get(index) = temp;
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

}
