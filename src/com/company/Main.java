package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Evidence e = new Evidence();
        Scanner sc = new Scanner(System.in);
        System.out.println("EVIDENCE ZAMĚSTNANCŮ");
        System.out.println("---------------------");

        String  volba = "0";
        while (!(volba.equals("9"))){
            System.out.println("1 - Přidat zaměstnance");
            System.out.println("2 - Hledat zaměstnance");
            System.out.println("3 - Seřadit podle jména");
            System.out.println("4 - Seřadit podle příjmení");
            System.out.println("5 - Vypsat kolekci");
            System.out.println("6 - Smazat zaměstnance podle pozice");
            System.out.println("7 - Smazat zaměstnance podle příjmení");
            System.out.println("8 - Smazat vše");
            System.out.println("9 - Konec");
            System.out.println("");

            volba = sc.next();

            switch (volba){
                case "1": e.novyZamestnanec();System.out.println("");break;

                case "2": e.najitZamestnance();System.out.println("");break;

                case "3": e.razeniJmeno();System.out.println("");break;

                case "4": e.razeniPrijmeni();System.out.println("");break;

                case "5": e.tisk();System.out.println("");break;

                case "6": e.smazatZamestnancePozice();System.out.println("");break;

                case "7": e.smazatZamestnancePrijmeni();System.out.println("");break;

                case "8": e.smazatVse();System.out.println("");break;

                case "9": System.out.println("Děkujeme za použití programu");break;

                default: System.out.println("Neplatná volba");
            }
        }
    }
}
