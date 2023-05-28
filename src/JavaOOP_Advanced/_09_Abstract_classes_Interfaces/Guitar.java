package JavaOOP_Advanced._09_Abstract_classes_Interfaces;

public class Guitar extends Instrument{

    public Guitar(String name, String brand){
        super(name, brand);
    }

    @Override
    public void play(){
        System.out.println("Guitar is now playing");
    }
}
