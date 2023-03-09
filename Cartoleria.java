
/*
Una cartoleria richiede un programma per gestire la merce in magazzino.
Gli articoli che vengono trattati sono gomme e penne.
Le penne sono caratterizzate da:
marca, modello, colore, costo e prezzo(uguale al triplo del costo).
Le gomme sono caratterizzate da:
marca, modello, dimensione, forma, costo e prezzo(uguale al doppio del costo).

Le funzioni richieste per il magazzino sono:
- caricamento articoli in magazzino;
- stampa articoli presenti;
- stampa costi totali;
- stampa ricavi totali;

Per la risoluzione di questo programma si utilizzi correttamente l'ereditarietà, il polimorfismo ed il binding dinamico dei metodi.

 */

public class Cartoleria {

    private Articolo[] magazzino;
    private String nome;

    public Cartoleria(String nome) {
        this.nome = nome;
        magazzino = new Articolo[10];
    }

    public Cartoleria() {
        magazzino = new Articolo[10];
    }

    public void aggiungiArticolo(Articolo articolo) { // aggiungo un articolo al magazzino se c'è spazio
        if(magazzino[magazzino.length - 1] != null) {
            System.out.println("il magazzino è pieno");// se il magazzino è pieno stampo un messaggio di errore e non aggiungo l'articolo
        }

        for(int i = 0; i < magazzino.length; i++) { // scorro il magazzino e aggiungo l'articolo alla prima posizione liberata
            if(magazzino[i] == null) {
                magazzino[i] = articolo;
                break;
            }
        }
    }

    public void stampaArticoli() { // stampo tutti gli articoli presenti nel magazzino

        System.out.println("Gli articoli presenti in magazzino sono: \n");
        for(Articolo a : magazzino) {
            if(a == null) {
                return;
            }

            System.out.println(a.toString());
        }
    }

      // creo un metodo che calcola i costi totali del magazzino
    public double calcolaCosti() {

        double costi = 0;

        for(Articolo a : magazzino) {
            if(a == null) {
                break;
            }

            costi += a.getCosto();

            //costi = costi + a.getCosto();
        }

        System.out.println("I costi totali ammontano a: " + costi);
        return costi;
    }

    public double calcolaRicavi() { // creo un metodo che calcola i ricavi totali del magazzino

        double costi = calcolaCosti();
        double prezzi = 0;

        for(Articolo a : magazzino) {
            if(a == null) {
                break;
            }

            prezzi += a.getPrezzo();
            //costi = costi + a.getCosto();
        }

        double ricavi = prezzi - costi;
        System.out.println("I ricavi totali ammontano a: " + ricavi);
        return ricavi;
    }

    public Articolo[] getMagazzino() {
        return magazzino;
    }

    public void setMagazzino(Articolo[] magazzino) {
        this.magazzino = magazzino;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}