package nl.novi.opdrachten.methodes;

import java.util.ArrayList;
import java.util.List;

/**
 * Schrijf een methode  die een List<Integer> ontvangt.
 *
 * Wanneer er twee getallen of meer in zijn:
 * Return het volgende:
 * "Het hoogste getal van de gegeven getallen is: %GETAL%"
 *
 * Je mag hier geen Collections.sort of java.streams gebruiken.
 *
 */
public class HoogsteGetalAbstract {

    public static void main(String[] args) {
        ArrayList<Integer> listNums = new ArrayList<>(List.of(1, 5, 100, 23, 105, 89, 1300, 25, 66, 13, 18013, 8));

        highestNumber(listNums);
    }


    public static void highestNumber(ArrayList<Integer> listNums){

        while (listNums.size() > 1){
            listNums.remove(listNums.indexOf(Math.min(listNums.get(0), listNums.get(1))));
        }

        System.out.println("Het hoogste getal van de gegeven getallen is: " + listNums);

    }
}
