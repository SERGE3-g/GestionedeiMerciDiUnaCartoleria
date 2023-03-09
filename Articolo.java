//
// created by SERGE GUEA 09/03/2023
//

// Descrizione: Classe che rappresenta un articolo generico

public abstract class Articolo { // creo una classe astratta che mi permette di creare un oggetto di tipo Articolo

    private String marca;
    private String modello;
    private double prezzo;
    private double costo;

    public Articolo(String marca, String modello, double costo) {
        this.marca = marca;
        this.modello = modello;
        this.costo = costo;
    }

    public Articolo() {

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }


    @Override
    public String toString() {
        return "Marca: " + this.marca + " Modello: " + this.modello + " Costo: " + this.costo + " Prezzo: " + this.prezzo;
    }
}