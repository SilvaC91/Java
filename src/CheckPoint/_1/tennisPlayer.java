package CheckPoint._1;

public class tennisPlayer {
    String id;
    String cognome;
    int numPartitePerse;
    int numPartiteVinte;

    tennisPlayer(String id, String cognome, int numPartitePerse, int numPartiteVinte){
        this.id = id;
        this.cognome = cognome;
        this.numPartitePerse = numPartitePerse;
        this.numPartiteVinte = numPartiteVinte;
    }

    public void Partita(boolean partitaVinta){
        if (partitaVinta){
            this.numPartiteVinte++;
        }else{
            this.numPartitePerse++;
        }
    }
    public int PartiteTotali(){
        int partiteTotali = this.numPartitePerse+this.numPartiteVinte;
        return partiteTotali;
    }
    public void Controllopartite(){
        if (PartiteTotali()>this.numPartiteVinte){
            System.out.println("è tutto ok");
        }
    }
//    String getId(){
//        return this.id;
//    }
//
//    void setId(String id){
//        this.id = id;
//    }
}
