package JavaOOP_Advanced._03_Collection;

import java.util.*;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }


    /**
     * 1: Complete the function that removes any duplicates by using a set
     *    then recreates a new list of unique items
     *
     *   You can reset a list by using list = new ArrayList<>();
     */
    private static void exercise1() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "a", "b", "c", "a", "b", "c"));

        // Your code here
        Set<String> list2 = new HashSet<>();
        for (String str : list) {
            list2.add(str);
        }
        list = new ArrayList<>();
        for (String str : list2) {
            list.add(str);
        }


        if (list.size() == 3) {
            System.out.println("Exercise 1: Success");
        } else {
            System.out.println("Exercise 1: Failed");
        }
    }

    /**
     * 2: Write a method that takes a List of Strings or a Set of Strings and returns a Set of Strings.
     *    the method should take a collection as a parameter
     */
    private static void exercise2() {
        // Your code here
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "kiwi", "banana");
        Set<String> set = Set.of("apple", "banana");
        Set<String> set1 = toSet(list);
        Set<String> set2 = toSet(set);
        System.out.println(set1);
        System.out.println(set2);
    }

    // Write your method for exercise 2 here
    public static Set<String> toSet(Collection<String> collection){
        Set<String> newSet = new HashSet<>();
        for (String str : collection ){
            newSet.add(str);
        }
        return newSet;
    }


    /**
     * 3: Follow the instructions in the comments
     */
    private static void exercise3() {
        String str = "the fox and the lazy dog saw another fox with another not lazy dog";
        List<String> words = Arrays.stream(str.split(" ")).toList();
        Map<String, Integer> wordCount = new HashMap<>();

        // Write code to count the number of occurrences of each word in the String `words`
        // and store the counts in the Map `wordCount`, note you will need to first get the previous value
        // from the Map and then increment it by 1, if no previous value exists, use 0 as the previous value.

        // Your code here
        for (String string : words){
            if(!wordCount.keySet().contains(string)){
                    wordCount.put(string,1);
                }else{
                int count = wordCount.get(string) ;
                wordCount.put(string, count+1);
            }
        }

    }

    /**
     * 4: Answer the following questions
     *
     *    What is the best data structure to use in the following scenarios, chose either a List, Set or Map
     *    and explain why you chose that data structure.
     *
     *    1 - You want to store the students in order of their arrival
     *    Answer: LinkedList perché considera l'ordine in cui vengono aggiunti
     *    e possono esserci due o più valori uguali nel caso di studenti omonimi
     *
     *    2 - You want to store the students in a class and their grades
     *    Answer: TreeMap perché li ordina in ordine ascendente e contiene chiavi e valori,
     *    la chiave conterrà il nome dello studente e il valore sarà il suo anno scolastico
     *
     *    3 - You want to store the countries in the world in order of age
     *    Answer: HashMap, perché contiene chiavi e valori, la chiave conterrà la nazione e il
     *    valore sarà l'età, e poi ordinare per valore ascendente
     *
     *    4 - You want to store the products available for purchase in an online store, along with their corresponding prices.
     *    Answer: TreeMap perché li ordina in ordine ascendente e contiene chiavi e valori,
     *    la chiave conterrà il nome del prodotto e il valore sarà il suo prezzo
     *
     *    5 - You want to store the employees at a company in the order you added them
     *    Answer: LinkedList perché considera l'ordine in cui vengono aggiunti
     *    e possono esserci due o più valori uguali nel caso di impiegati omonimi
     *
     *    6 - You want to store the cities in a particular state, along with their populations.
     *    Answer: TreeMap perché li ordina in ordine ascendente e contiene chiavi e valori,
     *    la chiave conterrà il nome della città e il valore sarà la popolazione
     *
     *    7 - You want to store the books in a library, along with their authors and publication dates.
     *    Answer: TreeSet perché li ordina in ordine ascendente, conterrà oggetti che contengono
     *    nome del libro, nome autore e data di pubblicazione
     *
     *    8 - You want to store the courses offered at a university, along with the professors teaching each course.
     *    Answer: TreeMap perché li ordina in ordine ascendente e contiene chiavi e valori,
     *    la chiave conterrà il nome del corso e il valore sarà il relativo professore
     *
     *    9 - You want to store the movies in a movie rental store, along with their ratings and release dates.
     *    Answer: TreeMap perché li ordina in ordine ascendente e contiene chiavi e valori, la chiave conterrà
     *    il nome del film e il valore sarà un oggetto che contiene valutazione e data di pubblicazione
     *
     *    10 - You want to store the flights available for booking on an airline, along with their destinations and departure times.
     *    Answer: HashMap perché contiene chiavi e valori, la chiave conterrà
     *    il nome del volo e il valore sarà un oggetto che contiene destinazione e data di partenza
     *
     *    11 - You want to store the articles on a news website, along with their titles and publication dates.
     *    Answer: LinkedHashSet perché considera l'ordine in cui vengono aggiunti, non possono esserci due articoli con
     *    stesso nome, conterrà oggetti che contengono nome articolo, titolo e data di pubblicazione
     *
     *    12 - You want to store the songs in a music streaming service, along with their artists and album names.
     *    Answer: ArrayList perché accetta due o più variabili uguali, in caso di canzoni con stesso titolo
     *    conterrà oggetti che contengono titolo, artista e album
     */

}
