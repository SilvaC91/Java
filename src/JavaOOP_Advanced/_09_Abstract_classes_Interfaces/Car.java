package JavaOOP_Advanced._09_Abstract_classes_Interfaces;

public class Car implements Movable{

    @Override
    public int moveForward(int forward){
        return forward;
    }
    @Override
    public int moveBackward(int backward){
        return backward;
    }
}
