/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 28/02/20
 *   Time: 4:15 PM
 */

package binaryGenerator;

public class BinaryGenerator {
    private String userInputStringInLowerCase;

    public BinaryGenerator(String userInputStringInLowerCase) {
        this.userInputStringInLowerCase = userInputStringInLowerCase;
    }

    public String getUserInputStringInLowerCase() {
        return userInputStringInLowerCase;
    }

    public void setUserInputStringInLowerCase(String userInputStringInLowerCase) {
        this.userInputStringInLowerCase = userInputStringInLowerCase;
    }

    public StringBuilder convertNormalStringToBinaryString() {
        StringBuilder stringBuilder = new StringBuilder();
        userInputStringInLowerCase = userInputStringInLowerCase.toLowerCase();
        for (int i = 0; i < userInputStringInLowerCase.length(); i++) {
            int ascii = userInputStringInLowerCase.charAt(i);
            String string = Integer.toBinaryString(ascii);
            int count = 8 - string.length();
            String string1 = "0";
            stringBuilder.append(string1.repeat(count));
            stringBuilder.append(string);
            //stringBuilder.append(" ");

        }
        return stringBuilder;
    }
}
