package CheckPoint._1;

import java.util.List;

public class traccia{
        /**
         *
         *  JAVA 13 CHECKPOINT N.1
         */
        public static void main(String[] args) {
            exercise1();
            exercise2();
            exercise3();
        }

        /**
         * Scrivi un metodo che prenda due stringhe come input e restituisca una nuova stringa
         * formata dalla concatenazine dei due dati in input e in aggiunta in fondo alla stringa ci deve essere un numero
         * che rappresenta il totale delle lettere delle due stringhe.
         * Il risultato finale deve essere scritto tutto in maiuscolo.
         * Stampa il risultato in console.
         */
        public static void exercise1() {

        }

        /**
         * Crea un metodo che generi casualmente delle password.
         * Il metodo deve essere in grado di generare password basati su alcuni gruppi di parole come "nomi + stringhe casuali + citta" o "nome città + nome colore".
         * Puoi utilizzare gli elenchi di parole predefiniti o creare i tuoi elenchi personalizzati.
         * La password finale deve pero' essere lunga almeno 12 Caratteri, altrimenti viene ritornata una Stringa contente 12 caratteri uguali
         */
        public static void exercise2() {
            final List<String> NOMI = List.of("Alessio", "Matteo", "Francesco", "Pietro", "Lorenzo", "Nicola", "Alessandra", "Veronica", "Maria", "Luigi", "Aurora", "Giulia", "Marco", "Piero", "Linda", "Beatrice", "Mario", "Enrico");
            final List<String> STRINGHE = List.of("bf4uf", "nfj337d37", "fnfj24k8g8", "dh748fj", "afqogj46d", "djf47h", "djfb3lw2", "pnlmun3d3d", "fm16s", "fb47jf432", "fj3jf", "qrrbzxo", "3434dew", "de30pk", "cb33i");
            final List<String> CITTA = List.of("Roma", "Milano", "Napoli", "Firenze", "Bari", "Torino", "Bologna", "Catanzaro", "Venezia");

        }

        /**
         * Scrivi una classe Java in un file separato che rappresenta un Giocatore di Tennis,
         * con attributi come id , cognome, numero partite perse e numero partite vinte.
         * Implementa un costruttore per inizializzare id , cognome, partite perse e partite vinte e ed un metodo che puo incrementare sia il numero partite vinte oppure il numero partite perse.
         * Realizzare inoltre un metodo che restituisca il totale delle partite giocate
         * Il numero delle vittorie non puo' ovviamente essere maggiore del numero delle partite giocate.
         */
        public static void exercise3() {

        }


}
