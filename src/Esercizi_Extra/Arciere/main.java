package Esercizi_Extra.Arciere;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class main {
    public static void main(String[] args) {

        Arciere a1 = new Arciere("Marco", "Bassi", 30, "Arcobaleno");

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

        try {
            a1.scriviScoreInFile();
        }
        catch (IOException e){
            System.err.println("C'è stato un errore!");
        }


    }
}
