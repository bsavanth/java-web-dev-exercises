package org.launchcode.java.collections;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

public class CollectionsBonus {
    public static void main(String[] args) throws IOException {

        String quoted = "";

        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        System.out.println("Current relative path is: " + s);

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("/src/org.launchcode.java/collectionsquote.txt"), Charset.forName("UTF-8")));
        int c=0;
        while((c = reader.read()) != -1) {

            quoted=quoted.concat(String.valueOf(c));
        }

        char[] charactersInString = quoted.toCharArray();

        HashMap<Character, Integer> dict = new HashMap<>();

        for(int i=0; i <charactersInString.length;i++)
        {
            if(dict.containsKey(charactersInString[i]))
            {
                dict.put(charactersInString[i], dict.get(charactersInString[i])+1);
            }
            else
            {
                dict.put(charactersInString[i], 1);
            }
        }

        for(Integer ch: dict.values())
        {
            System.out.println(ch);
        }

    }




}

