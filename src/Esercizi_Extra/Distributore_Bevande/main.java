package Esercizi_Extra.Distributore_Bevande;

public class main {
    public static void main(String[] args) {

        DistributoreDiBevande distributore = new DistributoreDiBevande(2);

        Cappuccino cappuccino = new Cappuccino(1,"Cappuccino", 2.0);
        Caffe caffe = new Caffe(2,"Caffe", 1.0);

        distributore.caricaProdotto(caffe);
        distributore.caricaProdotto(cappuccino);

        distributore.inserisciImporto(5.0);

        Bevanda bevanda = distributore.scegliProdotto(2);
        System.out.println(bevanda.getDescrizione());
        System.out.println(distributore.getResto());
    }
}
