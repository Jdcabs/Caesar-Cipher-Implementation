public class main {
    public static void main(String[] args) {
        // EncryptMessage encryptMessage = new EncryptMessage(2, "Hello There");
        // System.out.println(encryptMessage.encryptMessages());
        
        // DecryptMessage decryptMessage = new DecryptMessage(4, "H E");
        // System.out.println(decryptMessage.decryptMessages());

        int[] intArr = {1,2,3,4,5};

        for(int i = 0; i < intArr.length; i++){
            if(intArr[i] == 2) {
                intArr[i] = 10;
            }
        }

        for (int i : intArr) {
            System.out.println(i);
        }
    }
}