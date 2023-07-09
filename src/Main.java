import dev.omedia.bootcamp2.cryptography.CaesarCipher;
import dev.omedia.bootcamp2.cryptography.CaesarCipherMessage;
import dev.omedia.bootcamp2.cryptography.CharPair;

public class Main {
    public static void main(String[] args) {
        CharPair cp1 = new CharPair('a','z');
        CharPair cp2 = new CharPair('ა','ჰ');
        CharPair cp3 = new CharPair('A','Z');
        CharPair[] arr = {cp1,cp2,cp3};
        CaesarCipher cc = new CaesarCipher(arr);
        CaesarCipherMessage message = cc.encrypt("აბგდ->Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod",25);
        System.out.println(message.getEncryptedString());
        System.out.println(cc.decrypt(message));
    }
}

