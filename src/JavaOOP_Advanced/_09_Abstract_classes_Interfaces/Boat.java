package JavaOOP_Advanced._09_Abstract_classes_Interfaces;

public class Boat implements Movable{

    @Override
    public int moveForward(int forward){
        return forward;
    }
    @Override
    public int moveBackward(int backward){
        return backward;
    }
}
