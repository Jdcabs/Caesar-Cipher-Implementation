import service.CaesarCipherImpl;
import service.DecryptMessage;
import service.EncryptMessage;

public class main {
    public static void main(String[] args) {
       

        CaesarCipherImpl imp = new CaesarCipherImpl();
        imp.startEcnryptionAndDecryption();
    }
}