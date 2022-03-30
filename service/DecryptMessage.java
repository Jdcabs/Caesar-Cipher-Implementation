package service;

import java.util.ArrayList;
import java.util.Arrays;

public class DecryptMessage {
    
    private int key;
    private String message;

    public DecryptMessage(int key, String message) {
        this.key = key;
        this.message = message;
        //TODO Auto-generated constructor stub
    }
    

    public int getKey() {
        return key;
    }
    public String getMessage() {
        return message;
    }

    public String decryptMessages() {
        
        // Creating a Reference of a Alpabetical Order
        ArrayList<Character> normalAlphabeth = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
                'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'));

        // Here we will Create a adjusted Alpabetical Order,
        // depends on what key was inputed.
        ArrayList<Character> cipherAlphabeth = new ArrayList<>();
        int counter = 0;

        // Here we will swap the Alpabetical Order to Cipher Alpabetical Order.
        for (int i = getKey(); i < normalAlphabeth.size(); i++) {
            cipherAlphabeth.add(normalAlphabeth.get(i));
        }

        for (int x = cipherAlphabeth.size(); x < 26; x++) {
            cipherAlphabeth.add(x, normalAlphabeth.get(counter));
            counter++;
        }

        String dencryptedMessage = "";
        int counterString = 0;

        for (int i = 0; i < getMessage().length(); i++) {

            int temp = cipherAlphabeth.indexOf(getMessage().toUpperCase().charAt(counterString));
            dencryptedMessage = dencryptedMessage + normalAlphabeth.get(temp);
            counterString = counterString + 1;
        }

        return "Decrypted Message: " + dencryptedMessage;
    }
}
