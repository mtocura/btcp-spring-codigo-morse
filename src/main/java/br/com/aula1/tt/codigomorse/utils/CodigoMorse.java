package br.com.aula1.tt.codigomorse.utils;

import java.util.*;

public class CodigoMorse {
    private static final Map<String, String> morseTable = new HashMap<>();

    public static String codigoMorse(String codigo) {
        populaTabelaMorse();

        String[] words = codigo.split("   ");
        List<String> characters;

        StringBuilder res = new StringBuilder();

        for(String word : words) {
            characters = Arrays.asList(word.split(" "));

            characters.forEach(character -> res.append(morseTable.get(character)));

            res.append(" ");
        }

        return res.toString();
    }

    private static void populaTabelaMorse() {
        morseTable.put(".-", "A");
        morseTable.put("-...", "B");
        morseTable.put("-.-.", "C");
        morseTable.put("-..", "D");
        morseTable.put(".", "E");
        morseTable.put("..-.", "F");
        morseTable.put("--.", "G");
        morseTable.put("....", "H");
        morseTable.put("..", "I");
        morseTable.put(".---", "J");
        morseTable.put("-.-", "K");
        morseTable.put(".-..", "L");
        morseTable.put("--", "M");
        morseTable.put("-.", "N");
        morseTable.put("---", "O");
        morseTable.put(".--.", "P");
        morseTable.put("--.-", "Q");
        morseTable.put(".-.", "R");
        morseTable.put("...", "S");
        morseTable.put("-", "T");
        morseTable.put("..-", "U");
        morseTable.put("...-", "V");
        morseTable.put(".--", "W");
        morseTable.put("-..-", "X");
        morseTable.put("-.--", "Y");
        morseTable.put("--..", "Z");

        morseTable.put("-----", "0");
        morseTable.put(".----", "1");
        morseTable.put("..---", "2");
        morseTable.put("...--", "3");
        morseTable.put("....-", "4");
        morseTable.put(".....", "5");
        morseTable.put("-....", "6");
        morseTable.put("--...", "7");
        morseTable.put("---..", "8");
        morseTable.put("----.", "9");
    }
}
