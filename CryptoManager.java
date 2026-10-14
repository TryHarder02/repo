/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: (CryptoManager checks whether strings contain
 * characters within the allowed ASCII range of 32–95.
 * It implements Vigenere, Playfair, and Caesar encryption
 * and decryption. Playfair uses an 8x8 matrix and encrypts
 * two characters at a time)
 * Due: 10/13/2026
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming  assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: _melanie castro_________
*/

package assignmentThree;

public class CryptoManager {

    private static final char upperRange = '_';
    private static final char lowerRange = ' ';

    public static boolean isStringInBounds(String plainText) {

        for (int i = 0; i < plainText.length(); i++) {
            char currentChar = plainText.charAt(i);

            if (currentChar > upperRange || currentChar < lowerRange) {
                return false;
            }
        }

        return true;
    }

    public static String vigenereEncryption(String plainText, String key) {

        if (!isStringInBounds(plainText)) {
            return "The selected string is not in bounds, Try again.";
        }

        if (key.isEmpty()) {
            return "The key cannot be empty.";
        }

        String encryptedText = "";
        int rangeSize = upperRange - lowerRange + 1;

        for (int i = 0; i < plainText.length(); i++) {

            char plainChar = plainText.charAt(i);
            int keyIndex = i % key.length();
            char keyChar = key.charAt(keyIndex);
            int shift = keyChar - 'A';

            int charPosition = plainChar - lowerRange;
            int newPosition = (charPosition + shift) % rangeSize;

            if (newPosition < 0) {
                newPosition += rangeSize;
            }

            int newCharValue = lowerRange + newPosition;
            char encryptedChar = (char) newCharValue;

            encryptedText += encryptedChar;
        }

        return encryptedText;
    }

    public static String vigenereDecryption(String encryptedText, String key) {

        if (!isStringInBounds(encryptedText)) {
            return "The selected string is not in bounds, Try again.";
        }

        if (key.isEmpty()) {
            return "The key cannot be empty.";
        }

        String decryptedText = "";
        int rangeSize = upperRange - lowerRange + 1;

        for (int i = 0; i < encryptedText.length(); i++) {

            char encryptedChar = encryptedText.charAt(i);
            int keyIndex = i % key.length();
            char keyChar = key.charAt(keyIndex);
            int shift = keyChar - 'A';

            int charPosition = encryptedChar - lowerRange;
            int newPosition = (charPosition - shift) % rangeSize;

            if (newPosition < 0) {
                newPosition += rangeSize;
            }

            int newCharValue = lowerRange + newPosition;
            char plainChar = (char) newCharValue;

            decryptedText += plainChar;
        }

        return decryptedText;
    }

    public static String playfairEncryption(String plainText, String key) {

        if (!isStringInBounds(plainText) || !isStringInBounds(key)) {
            return "The selected string is not in bounds, Try again.";
        }

        if (plainText.length() % 2 != 0) {
            return "Playfair requires an even number of characters.";
        }

        String encryptedText = "";

        int position = 0;
        char[][] matrix = new char[8][8];
        int rangeSize = upperRange - lowerRange + 1;
        boolean[] used = new boolean[rangeSize];

        for (int i = 0; i < key.length(); i++) {

            char currentChar = key.charAt(i);
            int usedIndex = currentChar - lowerRange;

            if (!used[usedIndex]) {
                int row = position / 8;
                int col = position % 8;

                matrix[row][col] = currentChar;
                used[usedIndex] = true;
                position++;
            }
        }

        for (int charValue = lowerRange;
             charValue <= upperRange; charValue++) {

            int usedIndex = charValue - lowerRange;

            if (!used[usedIndex]) {
                int row = position / 8;
                int col = position % 8;

                matrix[row][col] = (char) charValue;
                used[usedIndex] = true;
                position++;
            }
        }

        for (int i = 0; i < plainText.length(); i += 2) {

            char firstChar = plainText.charAt(i);
            char secondChar = plainText.charAt(i + 1);

            int firstRow = -1;
            int firstCol = -1;
            int secondRow = -1;
            int secondCol = -1;

            for (int row = 0; row < 8; row++) {
                for (int col = 0; col < 8; col++) {

                    if (matrix[row][col] == firstChar) {
                        firstRow = row;
                        firstCol = col;
                    }

                    if (matrix[row][col] == secondChar) {
                        secondRow = row;
                        secondCol = col;
                    }
                }
            }

            if (firstRow == secondRow) {

                firstCol = (firstCol + 1) % 8;
                secondCol = (secondCol + 1) % 8;

                firstChar = matrix[firstRow][firstCol];
                secondChar = matrix[secondRow][secondCol];

            } else if (firstCol == secondCol) {

                firstRow = (firstRow + 1) % 8;
                secondRow = (secondRow + 1) % 8;

                firstChar = matrix[firstRow][firstCol];
                secondChar = matrix[secondRow][secondCol];

            } else {

                firstChar = matrix[firstRow][secondCol];
                secondChar = matrix[secondRow][firstCol];
            }

            encryptedText += firstChar;
            encryptedText += secondChar;
        }

        return encryptedText;
    }

    public static String playfairDecryption(String encryptedText, String key) {

        if (!isStringInBounds(encryptedText) || !isStringInBounds(key)) {
            return "The selected string is not in bounds, Try again.";
        }

        if (encryptedText.length() % 2 != 0) {
            return "Playfair requires an even number of characters.";
        }

        String decryptedText = "";

        int position = 0;
        char[][] matrix = new char[8][8];
        int rangeSize = upperRange - lowerRange + 1;
        boolean[] used = new boolean[rangeSize];

        for (int i = 0; i < key.length(); i++) {

            char currentChar = key.charAt(i);
            int usedIndex = currentChar - lowerRange;

            if (!used[usedIndex]) {
                int row = position / 8;
                int col = position % 8;

                matrix[row][col] = currentChar;
                used[usedIndex] = true;
                position++;
            }
        }

        for (int charValue = lowerRange;
             charValue <= upperRange; charValue++) {

            int usedIndex = charValue - lowerRange;

            if (!used[usedIndex]) {
                int row = position / 8;
                int col = position % 8;

                matrix[row][col] = (char) charValue;
                used[usedIndex] = true;
                position++;
            }
        }

        for (int i = 0; i < encryptedText.length(); i += 2) {

            char firstChar = encryptedText.charAt(i);
            char secondChar = encryptedText.charAt(i + 1);

            int firstRow = -1;
            int firstCol = -1;
            int secondRow = -1;
            int secondCol = -1;

            for (int row = 0; row < 8; row++) {
                for (int col = 0; col < 8; col++) {

                    if (matrix[row][col] == firstChar) {
                        firstRow = row;
                        firstCol = col;
                    }

                    if (matrix[row][col] == secondChar) {
                        secondRow = row;
                        secondCol = col;
                    }
                }
            }

            if (firstRow == secondRow) {

                firstCol = (firstCol - 1 + 8) % 8;
                secondCol = (secondCol - 1 + 8) % 8;

                firstChar = matrix[firstRow][firstCol];
                secondChar = matrix[secondRow][secondCol];

            } else if (firstCol == secondCol) {

                firstRow = (firstRow - 1 + 8) % 8;
                secondRow = (secondRow - 1 + 8) % 8;

                firstChar = matrix[firstRow][firstCol];
                secondChar = matrix[secondRow][secondCol];

            } else {

                firstChar = matrix[firstRow][secondCol];
                secondChar = matrix[secondRow][firstCol];
            }

            decryptedText += firstChar;
            decryptedText += secondChar;
        }

        return decryptedText;
    }

    public static String caesarEncryption(String plainText, int key) {

        if (!isStringInBounds(plainText)) {
            return "The selected string is not in bounds, Try again.";
        }

        String encryptedText = "";
        int rangeSize = upperRange - lowerRange + 1;
        int shift = key % rangeSize;

        for (int i = 0; i < plainText.length(); i++) {

            char plainChar = plainText.charAt(i);
            int charPosition = plainChar - lowerRange;
            int shiftedPosition = (charPosition + shift) % rangeSize;

            if (shiftedPosition < 0) {
                shiftedPosition += rangeSize;
            }

            char encryptedChar = (char) (lowerRange + shiftedPosition);
            encryptedText += encryptedChar;
        }

        return encryptedText;
    }

    public static String caesarDecryption(String encryptedText, int key) {

        if (!isStringInBounds(encryptedText)) {
            return "The selected string is not in bounds, Try again.";
        }

        String decryptedText = "";
        int rangeSize = upperRange - lowerRange + 1;
        int shift = key % rangeSize;

        for (int i = 0; i < encryptedText.length(); i++) {

            char encryptedChar = encryptedText.charAt(i);
            int charPosition = encryptedChar - lowerRange;
            int shiftedPosition = (charPosition - shift) % rangeSize;

            if (shiftedPosition < 0) {
                shiftedPosition += rangeSize;
            }

            char plainChar = (char) (lowerRange + shiftedPosition);
            decryptedText += plainChar;
        }

        return decryptedText;
    }
}
