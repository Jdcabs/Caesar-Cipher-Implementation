import service.DecryptMessage;
import service.EncryptMessage;

public class main {
    public static void main(String[] args) {
        EncryptMessage encryptMessage = new EncryptMessage(4, "john");
        System.out.println(encryptMessage.encryptMessages());
        DecryptMessage decryptMessage = new DecryptMessage(4, "NSLR");
        System.out.println(decryptMessage.decryptMessages());
    }
}