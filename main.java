public class main {
    public static void main(String[] args) {
       
       
        SubstitutionCipherImpl cipher1 = new SubstitutionCipherImpl(2, "david");
        System.out.println(cipher1.encryptMessage());
    }
}