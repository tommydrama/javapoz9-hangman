package com.sda.hangman.domain;

import java.util.ArrayList;
import java.util.List;

public class HangmanGameService {

    public List<Integer> performCharacter(char c, String phrase){
        char[] charsFromPhrease = phrase.toCharArray();

        List<Integer> results = new ArrayList <Integer>();
        for (int i = 0; i < charsFromPhrease.length; i++) {
            if(equalsIgnoreCase(c,charsFromPhrease[i])){
                results.add(i);
            }
        }
        return results;
    }
        private boolean equalsIgnoreCase(char a, char b) {
        return Character.toLowerCase(a) == Character.toLowerCase(b);
    }
}
