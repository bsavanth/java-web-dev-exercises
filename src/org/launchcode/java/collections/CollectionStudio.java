package org.launchcode.java.collections;

import java.util.HashMap;


public class CollectionStudio {

    public static void main(String[] args) {

        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInString = quote.toCharArray();

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
