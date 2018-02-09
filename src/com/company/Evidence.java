package com.company;

import java.util.*;

public class Evidence {
    private ArrayList<Clovek> jmena = new ArrayList<Clovek>();
    Scanner sc = new Scanner(System.in);
    String jmeno, prijmeni, bydliste;
    int vek;

    //Přidat zaměstnance
    public void novyZamestnanec(){
        System.out.println("Zadejte jméno:");
        jmeno = sc.next();
        System.out.println("Zadejte příjmení:");
        prijmeni = sc.next();
        System.out.println("Zadejte věk:");
        vek = sc.nextInt();
        System.out.println("Zadejte bydliště:");
        bydliste = sc.next();
        Clovek c = new Clovek(jmeno, prijmeni, vek, bydliste);
        jmena.add(c);
    }

    //Hledat zaměstnance
    public void najitZamestnance(){
        System.out.println("Zadejte příjmení:");
        String prijmeni = sc.next();
        int i = 0;
        for(Clovek c: new ArrayList<>(jmena)){
            if(c.getPrijmeni().equals(prijmeni)){
                System.out.println(c.toString());
            }
            else {
                i++;
            }
        }
    }

    //Seřadit podle jména
    public void razeniJmeno()
    {
        Collections.sort(jmena, new Comparator<Clovek>() {
            @Override
            public int compare(Clovek o1, Clovek o2) {
                return o1.getJmeno().compareTo(o2.getJmeno());
            }
        });
    }

    //Seřadit podle příjmení
    public void razeniPrijmeni()
    {
        Collections.sort(jmena, new Comparator<Clovek>() {
            @Override
            public int compare(Clovek o1, Clovek o2) {
                return o1.getPrijmeni().compareTo(o2.getPrijmeni());
            }
        });
    }

    //Vypsat kolekci
    public void tisk(){
        for (Clovek zam : jmena) {
            System.out.println(zam);
        }
    }

    //Smazat zaměstnance podle pozice
    public void smazatZamestnancePozice(){
        System.out.println("Zadejte pozici:");
        int pozice = sc.nextInt()-1;
        jmena.remove(pozice);
    }

    //Smazat zaměstnance podle příjmení
    public void smazatZamestnancePrijmeni(){
        System.out.println("Zadejte příjmení:");
        String prijmeni = sc.next();
        int i = 0;
        for(Clovek c: new ArrayList<>(jmena)){
            if(c.getPrijmeni().equals(prijmeni)){
                jmena.remove(i);
            }
            else {
                i++;
            }
        }
    }

    //Smazat vše
    public void smazatVse(){
        jmena.clear();
    }
}