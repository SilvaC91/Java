package JavaOOP_Advanced._09_Abstract_classes_Interfaces;

public class Piano extends Instrument{

    public Piano(String name, String brand){
        super(name, brand);
    }

    @Override
    public void play(){
        System.out.println("Piano is now playing");
    }
}
