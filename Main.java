//
// Created by SERGE GUEA 09/03/2023
//
// Description: Classe Cartoleria che contiene un array di Articoli

public class Main {

    public static void main(String[] args) { // creo un metodo main

        Penna p = new Penna();
        p.setCosto(0.4);
        p.setMarca("Bic");
        p.setModello("Standard");
        p.setColore("Blu");

        Penna penna = new Penna("Standler", "Standard", 0.3, "nera");//

        Gomma g = new Gomma("Gomu", "Standard", 0.2, "piccola", "rettangolare");

        Cartoleria cartoleria = new Cartoleria("Fantasia della carta");//

        cartoleria.aggiungiArticolo(g);// aggiungo gli articoli al magazzino
        cartoleria.aggiungiArticolo(p);
        cartoleria.aggiungiArticolo(penna);

        cartoleria.stampaArticoli();

        double costiOttobre = cartoleria.calcolaCosti();
        System.out.println(costiOttobre);

        cartoleria.calcolaRicavi();// stampo i costi e i ricavi totali del magazzino

    }

}
