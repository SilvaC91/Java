package CheckPoint._2_2;

public class Quadrato extends Figura {

    private int lato;

    public int getLato() {
        return lato;
    }

    public void setLato(int lato) {
        this.lato = lato;
    }

    public Quadrato(String nome, int lato) {
        super(nome);
        this.lato = lato;
    }

    @Override
    public int computeArea() throws Exception{
        if(this.lato < 0) {
            throw new Exception("Il lato non è corretto");
        }else{
        int risultato =  this.lato * this.lato;
        return risultato;
        }
    }
}
