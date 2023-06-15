package CheckPoint._2;

public class Macchina implements Guidabile {

    private String marca;
    private String modello;
    private double carburanteAttualeInLitri;
    private double capacitaSerbatoio;

    public Macchina(String marca, String modello, double carburanteAttualeInLitri, double capacitaSerbatoio) {
        this.marca = marca;
        this.modello = modello;
        this.carburanteAttualeInLitri = carburanteAttualeInLitri;
        this.capacitaSerbatoio = capacitaSerbatoio;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return this.modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public double getCarburanteAttualeInLitri() {
        return this.carburanteAttualeInLitri;
    }

    public void setCarburanteAttualeInLitri(double carburanteAttualeInLitri) {
        this.carburanteAttualeInLitri = carburanteAttualeInLitri;
    }

    public double getCapacitaSerbatoio() {
        return this.capacitaSerbatoio;
    }

    public void setCapacitaSerbatoio(double capacitaSerbatoio) {
        this.capacitaSerbatoio = capacitaSerbatoio;
    }

    @Override
    public double guida(double litriConsumati) {
        if(litriConsumati > this.carburanteAttualeInLitri){
            return this.carburanteAttualeInLitri = 0;
        }

        return this.carburanteAttualeInLitri -= litriConsumati;

    }

    public void inserireBenzina(double litriDaInserire) throws Exception {
        if(litriDaInserire + this.carburanteAttualeInLitri > capacitaSerbatoio){
            this.carburanteAttualeInLitri = capacitaSerbatoio;
            throw new Exception ("Errore litri benzina maggiori della capacita");
        }

        this.carburanteAttualeInLitri += litriDaInserire;

    }
}
