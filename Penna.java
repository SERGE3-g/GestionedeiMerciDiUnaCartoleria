//
// CREATED BY SERGE GUEA 09/03/2023
//
// Description: Classe Penna che estende la classe Articolo

public class Penna extends Articolo{

    private String colore;

    public Penna(String marca, String modello, double costo, String colore) {
        super(marca, modello, costo);
        this.colore = colore;
        this.setPrezzo(this.getCosto() * 3);
    }

    public Penna() {
        super();
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    @Override
    public void setCosto(double costo) {
        super.setCosto(costo);
        this.setPrezzo(this.getCosto() * 3);
    }

    @Override
    public String toString() {
        return "Penna di colore: " + this.colore + " " + super.toString();
    }
}