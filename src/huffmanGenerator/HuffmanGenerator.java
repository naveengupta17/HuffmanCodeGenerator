/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 28/02/20
 *   Time: 4:15 PM
 */

package huffmanGenerator;

import java.util.HashMap;

public class HuffmanGenerator {
    private String userInputStringInLowerCase;

    public HuffmanGenerator(String userInputStringInLowerCase) {
        this.userInputStringInLowerCase = userInputStringInLowerCase;
    }

    public String getUserInputStringInLowerCase() {
        return userInputStringInLowerCase;
    }

    public void setUserInputStringInLowerCase(String userInputStringInLowerCase) {
        this.userInputStringInLowerCase = userInputStringInLowerCase;
    }

    public StringBuilder convertNormalStringToHuffmanString() {
        userInputStringInLowerCase = userInputStringInLowerCase.toLowerCase();
        HashMap<Character, String> hashMap = new HashMap<>();
        hashMap.put('a', "1010");
        hashMap.put('b', "100000");
        hashMap.put('c', "00000");
        hashMap.put('d', "10000");
        hashMap.put('e', "010");
        hashMap.put('f', "110011");
        hashMap.put('g', "100010");
        hashMap.put('h', "0001");
        hashMap.put('i', "0110");
        hashMap.put('j', "1100001011");
        hashMap.put('k', "11000011");
        hashMap.put('l', "10111");
        hashMap.put('m', "110010");
        hashMap.put('n', "0111");
        hashMap.put('o', "1001");
        hashMap.put('p', "100001");
        hashMap.put('q', "1100001001");
        hashMap.put('r', "0010");
        hashMap.put('s', "0011");
        hashMap.put('t', "1101");
        hashMap.put('u', "00001");
        hashMap.put('v', "1100000");
        hashMap.put('w', "110001");
        hashMap.put('x', "100001000");
        hashMap.put('y', "100011");
        hashMap.put('z', "1100001010");
        StringBuilder stringBuilder1 = new StringBuilder();
        int i = 0;
        for (char ch : userInputStringInLowerCase.toCharArray()) {
            for (Character character : hashMap.keySet()) {
                if (character == userInputStringInLowerCase.charAt(i)) {
                    stringBuilder1.append(hashMap.get(character));
                    break;
                }

            }

        }

        return stringBuilder1;
    }
}

