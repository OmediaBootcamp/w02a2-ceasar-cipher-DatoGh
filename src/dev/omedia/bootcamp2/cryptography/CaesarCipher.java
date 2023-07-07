package dev.omedia.bootcamp2.cryptography;

import java.util.stream.IntStream;

public class CaesarCipher {
    private final CharPair[] symbolRanges;


    public CaesarCipher(CharPair[] symbolRanges){
        this.symbolRanges = symbolRanges;
    }

    public CaesarCipherMessage encrypt (String message, int shift){
        return new CaesarCipherMessage(encodeString(message,shift),shift);
    }

    public String decrypt(CaesarCipherMessage message){
        return encodeString(message.getEncryptedString(), -message.getShift()); //uaryofiti shifti igivea rac decode.
    }

    private String encodeString(String text, int shift){
        char[] arr = text.toCharArray();
        return IntStream.range(0,arr.length)
                .mapToObj(i->arr[i])
                .reduce("",(str,ch)->str+mapSymbol(ch,shift),String::concat);
    }


    private char mapSymbol(char symbol, int shift){
        for(CharPair charPair : symbolRanges){
            if(charPair.getStartSymbol()<=symbol && charPair.getEndSymbol()>=symbol){
                int n = charPair.getEndSymbol()- charPair.getStartSymbol() + 1; //raodenoba = diff + 1
                return (char) ((symbol - charPair.getStartSymbol()+(n+shift%n))%n+charPair.getStartSymbol());
            }
        }
        return symbol;
    }

    public CharPair[] getSymbolRanges() {
        return symbolRanges;
    }
}
