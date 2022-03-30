package service;

import java.util.ArrayList;
import java.util.Arrays;

public class EncryptMessage {

    private int key;
    private String message;

    public int getKey() {
        return key;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public EncryptMessage(int key, String message) {
        this.key = key;
        this.message = message;
    }

    public String encryptMessages() {
        // Creating a Reference of a Alpabetical Order
        ArrayList<Character> normalAlphabeth = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
                'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'));

        // Here we will Create a adjusted Alpabetical Order,
        // depends on what key was inputed.
        ArrayList<Character> cipherAlphabeth = new ArrayList<>();

        // Way to count every elements of the message inputed by the user.
        int counter = 0;

        // Here we will swap the Alpabetical Order to Cipher Alpabetical Order.
        for (int i = getKey(); i < normalAlphabeth.size(); i++) {
            cipherAlphabeth.add(normalAlphabeth.get(i));
        }

        for (int x = cipherAlphabeth.size(); x < 26; x++) {
            cipherAlphabeth.add(x, normalAlphabeth.get(counter));
            counter++;
        }

        // this is the place order of the encrypted message.
        String encryptedMessage = "";
        int counterString = 0;
        for (int i = 0; i < getMessage().length(); i++) {

            int temp = normalAlphabeth.indexOf(getMessage().toUpperCase().charAt(counterString));
            encryptedMessage = encryptedMessage + cipherAlphabeth.get(temp);
            counterString = counterString + 1;
        }

        return "Encrypted Message: " + encryptedMessage;
    }
}
