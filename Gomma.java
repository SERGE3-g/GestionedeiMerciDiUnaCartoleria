//
//created by: SERGE GUEA 09/03/2023
//

//Descrizione: Classe che estende Articolo e che rappresenta una gomma

public class Gomma extends Articolo {// estendo la classe Articolo e aggiungo le caratteristiche della gomma

    private String dimensione;
    private String forma;

    public Gomma(String marca, String modello, double costo, String dimensione, String forma) { // creo il costruttore
        super(marca, modello, costo);
        this.dimensione = dimensione;
        this.forma = forma;
        this.setPrezzo(this.getCosto() * 2);
    }

    public Gomma() { // creo il costruttore vuoto
        super();
    }

    public String getDimensione() {
        return dimensione;
    }

    public void setDimensione(String dimensione) { // creo i metodi get e set per le variabili
        this.dimensione = dimensione;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    @Override
    public void setCosto(double costo) {// sovrascrivo il metodo setCosto per aggiornare il prezzo
        super.setCosto(costo);
        this.setPrezzo(this.getCosto() * 2);
    }

    @Override
    public String toString() {      // sovrascrivo il metodo toString per stampare le informazioni della gomma
        return "Questa gomma ha una forma: " + this.forma + "ed è di dimensioni:  " + this.dimensione + " "
                + super.toString();
    }

}