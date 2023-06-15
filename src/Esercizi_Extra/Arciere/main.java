package Esercizi_Extra.Arciere;

public class main {
    public static void main(String[] args) {

        Arciere a1 = new Arciere("Marco", "Bassi", 50, "Arcobaleno");

        try {
            a1.play(5);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            a1.play(5);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            a1.play(5);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            a1.play(5);
        } catch (Exception e) {
            e.printStackTrace();
        }

        a1.stampaScore();
        a1.ricaricaFrecce(10);
        System.out.println(a1.toString());

    }
}
