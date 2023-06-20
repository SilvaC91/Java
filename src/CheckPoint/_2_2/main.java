package CheckPoint._2_2;

public class main {
    public static void main(String[] args) {

        Quadrato q1 = new Quadrato("Quadrato", 4);

        try{
            System.out.println(q1.computeArea());
        } catch(Exception e){
            e.printStackTrace();
        }

    }


}
