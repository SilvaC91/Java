package Esercizi_Extra.Distributore_Bevande;

public abstract class Bevanda {
    private String descrizione;
    private int codiceBevanda;
    private double prezzo;

    public Bevanda(int codiceBevanda, String descrizione, double prezzo){
        this.codiceBevanda = codiceBevanda;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }

    public int getCodiceBevanda(){
        return  this.codiceBevanda;
    }
    public String getDescrizione(){
        return  this.descrizione;
    }

    public double getPrezzo() {
        return this.prezzo;
    }
}


