package org.launchcode.java.collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class CollectionsBonus {
    public static void main(String[] args) throws IOException {

        String quoted = "";


        File file = new File("/Users/abhijeethsavanth/Desktop/java-web-dev-exercises/src/org/launchcode/java/collections/quote.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null)
            quoted = quoted.concat(st);



        char[] charactersInString = quoted.toCharArray();

        HashMap<Character, Integer> dict = new HashMap<>();

        for (char c : charactersInString) {
            if (dict.containsKey(c)) {
                dict.put(c, dict.get(c) + 1);
            } else {
                dict.put(c, 1);
            }
        }

        System.out.println("\n");

        dict.forEach((key, value) -> System.out.println("  "+key + " : " + value));

        System.out.println("\n");


    }




}

