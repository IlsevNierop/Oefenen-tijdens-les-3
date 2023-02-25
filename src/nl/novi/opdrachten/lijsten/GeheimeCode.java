package nl.novi.opdrachten.lijsten;

import java.awt.*;
import java.util.*;
import java.util.List;

public class GeheimeCode {

    public static void main(String[] secret) {

        List<String> laResistanceMembers = new ArrayList<>();

        laResistanceMembers = addMembers(laResistanceMembers, "Arie");
        laResistanceMembers = addMembers(laResistanceMembers, "Sjaak");
        laResistanceMembers = addMembers(laResistanceMembers, "Henrie");
        laResistanceMembers = addMembers(laResistanceMembers, "Piet");
        laResistanceMembers = addMembers(laResistanceMembers, "LeDroitCestMoi");
        laResistanceMembers = addMembers(laResistanceMembers, "Piet");
        laResistanceMembers = addMembers(laResistanceMembers, "Alex");

        System.out.println(laResistanceMembers);

        encryptList(laResistanceMembers);
    }

        /*
        Opdracht 1: Hierboven zijn via de methode addMembers, leden aan de lijst toegevoegd. Pas de Methode zo aan dat
         er alleen unieke namen in voor mogen komen.
         */

        /*
        Opdracht 2: La Resistance wil niet dat de lijst met namen zo in handen komt te vallen van de bezetter. Versleutel
        Maak een methode die de lijst op de volgende manier versleuteld:
        a) Verander elke letter naar het nummer in het alfabet. Voeg na elke veranderde letter een - toe
        (behalve de laatste). Dus a wordt 1, b wordt 2 et cetera.
        Wanneer een letter een hoofdletter is, moet je beginnen met tellen bij 100. Dus A wordt 101, B wordt 102.
        Voorbeeld: Alex wordt versleuteld naar: 101-12-5-24
        b) Als de positie in de lijst een even getal is, dan moet de cijfercombinatie omgedraaid worden.
         */

    public static void encryptList(List<String> members) {


        HashMap<Character, String> charMap = new HashMap<>(); //create HashMap of alphabet

        charMap.put('a', "1");
        charMap.put('b', "2");
        charMap.put('c', "3");
        charMap.put('d', "4");
        charMap.put('e', "5");
        charMap.put('f', "6");
        charMap.put('g', "7");
        charMap.put('h', "8");
        charMap.put('i', "9");
        charMap.put('j', "10");
        charMap.put('k', "11");
        charMap.put('l', "12");
        charMap.put('m', "13");
        charMap.put('n', "14");
        charMap.put('o', "15");
        charMap.put('p', "16");
        charMap.put('q', "17");
        charMap.put('r', "18");
        charMap.put('s', "19");
        charMap.put('t', "20");
        charMap.put('u', "21");
        charMap.put('v', "22");
        charMap.put('w', "23");
        charMap.put('x', "24");
        charMap.put('y', "25");
        charMap.put('z', "26");
        charMap.put('A', "101");
        charMap.put('B', "102");
        charMap.put('C', "103");
        charMap.put('D', "104");
        charMap.put('E', "105");
        charMap.put('F', "106");
        charMap.put('G', "107");
        charMap.put('H', "108");
        charMap.put('I', "109");
        charMap.put('J', "110");
        charMap.put('K', "111");
        charMap.put('L', "112");
        charMap.put('M', "113");
        charMap.put('N', "114");
        charMap.put('O', "115");
        charMap.put('P', "116");
        charMap.put('Q', "117");
        charMap.put('R', "118");
        charMap.put('S', "119");
        charMap.put('T', "120");
        charMap.put('U', "121");
        charMap.put('V', "122");
        charMap.put('W', "123");
        charMap.put('X', "124");
        charMap.put('Y', "125");
        charMap.put('Z', "126");

        ArrayList<String> encryptMembers = new ArrayList<>();
        for (int i = 0; i < members.size(); i++) {//iterate through each String in ArrayList
            if ((i+1) % 2 != 0) {
                String name = members.get(i);
                String encrName = null;
                for (int j = 0; j < name.length(); j++) {//Iterate through each Character in Strings (in ArrayList)
                    String encrNum = charMap.get(name.charAt(j));
                    if (j == 0) {
                        encrName = encrNum + "-";
                    } else if ((j + 1) == name.length()) {
                        encrName = encrName + encrNum;
                    } else {
                        encrName = encrName + encrNum + "-";
                    }

                }
                encryptMembers.add(encrName);
            }
            else { //make it flip the order for even positions
                String name = members.get(i);
                String encrName = null;
                for (int j = (name.length()-1); j >= 0 ; j--) {//Iterate through each Character in Strings (in ArrayList)
                    String encrNum = charMap.get(name.charAt(j));
                    if (j == name.length()-1) {
                        encrName = encrNum + "-";
                    } else if ((j) == 0) {
                        encrName = encrName + encrNum;
                    } else {
                        encrName = encrName + encrNum + "-";
                    }

                }
                encryptMembers.add(encrName);

            }

        }
        System.out.println(encryptMembers);

    }

        /*
        Opdracht 3:
        Schrijf een methode die de versleutelde lijst kan omzetten naar de ontsleutelde lijst.
         */

    private static List<String> addMembers(List<String> members, String name) {
        if (members.contains(name)) {
            System.out.println("There is already a member with the name " + name + " in the list, and therefor this name is not added again");
        } else {
            members.add(name);
        }
        return members;
    }
}
