package dev.omedia.bootcamp2.cryptography;

public class CaesarCipherMessage {

    private String encryptedString;
    private int shift;

    public CaesarCipherMessage(String encryptedString, int shift) {
        this.encryptedString = encryptedString;
        this.shift = shift;
    }

    public int getShift() {// ეს ესე უნდა ჩანდეს ყველასთვის?
        return shift;
    }

    public String getEncryptedString() {
        return encryptedString;
    }

    public void setEncryptedString(String encryptedString) {
        this.encryptedString = encryptedString;
    }
// და მერე განახლებაც უნდა შეიძლებოდეს??? !!!
    public void setShift(int shift) {
        this.shift = shift;
    }

}
