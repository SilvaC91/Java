package Esercizi_Extra.Distributore_Bevande;

import java.util.ArrayList;
import java.util.List;

public class DistributoreDiBevande {

    private int numeroMassimoProdottiNelDistributore;
    private double saldo;
    private double resto;

    private List<Bevanda> listaBevande;

    public DistributoreDiBevande(int numeroMassimoProdottiNelDistributore){
        this.listaBevande = new ArrayList<>();
        this.numeroMassimoProdottiNelDistributore = numeroMassimoProdottiNelDistributore;
    }

    public void caricaProdotto(Bevanda bevanda) {
        if (listaBevande.size() < numeroMassimoProdottiNelDistributore) {
            this.listaBevande.add(bevanda);
        }
    }


    public double inserisciImporto(double importo){
        this.saldo = importo;
        return this.saldo;
    }

    public Bevanda scegliProdotto(int codiceBevanda) {
        Bevanda bevandaScelta = null;
        for (Bevanda bevanda : listaBevande) {
            if (codiceBevanda == bevanda.getCodiceBevanda() && this.saldo >= bevanda.getPrezzo()) {
                this.saldo -= bevanda.getPrezzo();
                bevandaScelta = bevanda;
            }
        }
        return bevandaScelta;
    }


    public int getNumeroMassimoProdottiNelDistributore() {
        return this.numeroMassimoProdottiNelDistributore;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public List<Bevanda> getListaBevande() {
        return this.listaBevande;
    }

    public double getResto(){
        double resto = this.saldo;
        this.saldo = 0;
        return resto;
    }
}


