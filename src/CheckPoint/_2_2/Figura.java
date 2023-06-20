package CheckPoint._2_2;

public abstract class Figura implements Computable {

    private String nome;
    private int area;
    private int perimetro;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    public Figura(String nome) {
        this.nome = nome;

    }

    @Override
    public int computeArea() throws Exception{
        return 0;
    }



}
