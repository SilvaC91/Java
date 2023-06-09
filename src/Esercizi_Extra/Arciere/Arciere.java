package Esercizi_Extra.Arciere;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

public class Arciere extends Person implements Playable{

    private int numFrecce;
    private String nomeArco;
    ArrayList<Integer> scores = new ArrayList<>();

    public int getNumFrecce() {
        return numFrecce;
    }

    public void setNumFrecce(int numFrecce) {
        this.numFrecce = numFrecce;
    }

    public String getNomeArco() {
        return nomeArco;
    }

    public void setNomeArco(String nomeArco) {
        this.nomeArco = nomeArco;
    }

    public ArrayList<Integer> getScores() {
        return scores;
    }

    public void setScores(ArrayList<Integer> scores) {
        this.scores = scores;
    }

    public Arciere(String nome, String cognome, int numFrecce, String nomeArco) {
        super(nome, cognome);
        this.numFrecce = numFrecce;
        this.nomeArco = nomeArco;
    }

    @Override
    public void play(int frecceDaLanciare) throws Exception{
        if (frecceDaLanciare > this.numFrecce){
            throw new Exception("Numero frecce a disposizione insufficienti");
        }else {
            int totaleScore = 0;
            Random random = new Random();
            int min = 1;
            int max = 10;

            for (int i =0; i<frecceDaLanciare; i++){
                totaleScore += random.nextInt(max - min + 1) + min;
            }
            this.numFrecce -= frecceDaLanciare;
            scores.add(totaleScore);
        }
    }

    public void ricaricaFrecce(int frecce){
        this.numFrecce += frecce;
    }

    public void stampaScore(){
        for (Integer score: this.scores) {
            System.out.println(score);
        }
    }

    @Override
    public String toString(){
        return "Nome= "+ this.getNome() +
               " Cognome= "   + this.getCognome() +
               " Arco= "   + this.nomeArco +
               " Punteggi= " + this.scores;
    }

    public void scriviScoreInFile() throws IOException {
        Path scoresPath = Paths.get("scores.txt");
        Files.createFile(scoresPath);
        Files.writeString(scoresPath, this.toString());


    }


}
