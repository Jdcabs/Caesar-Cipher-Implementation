package service;

import java.util.Scanner;

public class CaesarCipherImpl {

    private String message;
    private int key;
    private String encryptString;
    private String decryptString;
    private EncryptMessage encryptMessage;
    private DecryptMessage decryptMessage;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getEncryptString() {
        return encryptString;
    }

    public String getDecryptString() {
        return decryptString;
    }

    public void setEncryptString(String encryptString) {
        this.encryptString = encryptString;
    }

    public void setDecryptString(String decryptString) {
        this.decryptString = decryptString;
    }

    public void startEcnryptionAndDecryption() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wellcome to message Encryption and Decryption.");
        
        while(true) {
            try {
            System.out.print("\nEnter a Message: ");
            String message = scanner.nextLine();
            setMessage(message);

            System.out.print("\nEnter a Key: ");
            int numberValue = Integer.parseInt(scanner.nextLine());
            setKey(numberValue);
            
            }catch(Exception E){
                System.out.print("\nInvalid Data Inputed! " + E.getMessage() + "\n");
                continue;
            } 

            while(true) {

                try {
                System.out.print("\nPress [E] to Encryppt and [D] to Decrypt Message.(X to exit)");
                String decide = scanner.nextLine().toString();

                if(decide.trim().equalsIgnoreCase("E")) {
                    encryptMessage = new EncryptMessage(getKey(), getMessage());
                    System.out.println("\nEncrypted Message: " + encryptMessage.encryptMessages());

                }else if(decide.trim().equalsIgnoreCase("D")) {
                    
                    System.out.print("\nPlease Enter Encrypted Message Here: ");
                    String decrypt = scanner.nextLine();

                    decryptMessage = new DecryptMessage(getKey(), decrypt);
                    System.out.println("\nDecrypted Message: " + decryptMessage.decryptMessages());

                }else if(decide.trim().equalsIgnoreCase("X")) {
                    System.out.println("\nBye...");
                    break;
                }else 
                    System.out.println("\nError! Invalid Input");

                }catch (Exception e) {
                    System.out.println(e.getMessage());
                    continue;
                }
            }

            System.out.print("\nDo you want to try new Message ? [Y/N]: ");
            String yesOrNo = scanner.nextLine();

            if(yesOrNo.trim().equalsIgnoreCase("Y")){
                continue;
            }else{
                break;
            }
        }
    }
}
