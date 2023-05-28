package JavaOOP_Advanced._09_Abstract_classes_Interfaces;

public abstract class Instrument implements Playable {

    private String name, brand;

    public Instrument(String name, String brand){
        this.name = name;
        this.brand = brand;
    }
}
