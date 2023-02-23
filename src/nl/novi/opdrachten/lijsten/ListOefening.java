package nl.novi.opdrachten.lijsten;

import java.util.*;

public class ListOefening {

    public static void main(String[] uitlegList) {

        //We hebben een list die de namen van voetbalclubs bevat
        List<String> clubNames = new ArrayList<>();
        //Die vullen we alvast voor de opdracht
        clubNames.add("Ajax");
        clubNames.add("PSV");
        clubNames.add("Feyenoord");
        clubNames.add("Fc Utrecht");
        clubNames.add("Fc Groningen");
        clubNames.add("FC Twente");

        printClubNamesI(clubNames);

        printClubNames(clubNames);

        addUniqueClubNames(clubNames);

        positionClub(clubNames);

        sortListAjaxFirst(clubNames);

        sortListPSVLast(clubNames);





    }



    // Vraag 0: Maak een methode die als taak heeft om de list uit te printen: positie + inhoud.
    // Bovenstaande list zou dan dit zijn:
    // 0 - Ajax
    // 1 - PSv
    // etc...

    public static void printClubNamesI(List<String> clubNames) {
        for (int i = 0; i < clubNames.size(); i++) {
            System.out.println(i + " " + clubNames.get(i));
        }
    }

    // Vraag -1: Maak een methode die al taak heeft om de list per regel uit te printen.
    public static void printClubNames(List<String> clubNames) {
        for (String clubname : clubNames) {
            System.out.println(clubname);
        }
    }


    // Vraag 1: Maak een methode die checkt of een club al in de lijst zit en voeg deze anders toe.
    public static void addUniqueClubNames(List<String> clubNames) {
        HashSet<String> setClubNames = new HashSet<>(clubNames);
        setClubNames.add("Ajax");
        setClubNames.add("Ajax");
        setClubNames.add("PSV");
        setClubNames.add("AA Aachen");

        System.out.println("Unique clubnames");
        for (String clubName : setClubNames) {
            System.out.println(clubName);


        }
    }


    // Vraag 2: Maak een methode die de positie van de club in de lijst teruggeeft.

        public static void positionClub(List<String> clubNames){

            System.out.println(clubNames.indexOf("Ajax"));

        }


    // Vraag 3: Maak een methode die de lijst alfabetisch sorteert. Wanneer Ajax niet op positie 1 staat, moeten de
    // clubs die voor Ajax staan verwijderd worden.
    // We voegen nog wat clubs toe om de code te kunnen testen
        public static void sortListAjaxFirst(List<String> clubNames){
            clubNames.add("AA Aachen");
            clubNames.add("AFC Amsterdam");
            clubNames.add("AFC");

            Collections.sort(clubNames);
            System.out.println("before remove");
            System.out.println(clubNames);

            while (clubNames.get(0) != "Ajax"){
                clubNames.remove(0);
            }

            System.out.println("after remove");
            System.out.println(clubNames);
        }
        public static void sortListPSVLast(List<String> clubNames){
            // Vraag 4: Kun je hetzelfde doen als hierboven, maar PSV moet dan laatste zijn.
            clubNames.add("Zlotty FC");
            clubNames.add("SC Eindhoven");

            Collections.sort(clubNames);
            System.out.println("before remove");
            System.out.println(clubNames);

            while (clubNames.get(clubNames.size()-1) != "PSV"){
                clubNames.remove(clubNames.size()-1);
            }

            System.out.println("after remove");
            System.out.println(clubNames);
        }





}

