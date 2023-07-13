package dev.omedia.bootcamp2.cryptography;
// hmm. ოჰო. 
import java.util.stream.IntStream;

public class CaesarCipher {
    private final CharPair[] symbolRanges;


    public CaesarCipher(CharPair[] symbolRanges){
        if(!symbolRangeChecker(symbolRanges)){
            throw new IllegalArgumentException("Symbol ranges are incorrect");
        }
        this.symbolRanges = symbolRanges;
    }

    public CaesarCipherMessage encrypt (String message, int shift){
        return new CaesarCipherMessage(encodeString(message,shift),shift);
    }

    public String decrypt(CaesarCipherMessage message){// ეს მაგარია. რომ კოდის დუპლიაცია არ არის.
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

    private boolean symbolRangeChecker(CharPair[] arr){
        for(int i = 0 ; i< arr.length; i++){
            char start = arr[i].getStartSymbol();
            char end = arr[i].getEndSymbol();
            if(start>end){ ეს 
                return false;
            }
            for(int j = i-1 ; j>=0; j--){// ფორმატირებასაც მივაქციოთ ცოტა ყურადღება.
                char prevStart = arr[j].getStartSymbol();
                char prevEnd= arr[j].getEndSymbol();
                if( (start>=prevStart && start<=prevEnd) || (end>=prevStart && end<=prevEnd) || (start<prevStart && end>prevEnd)){
                    return false;
                }
            }
        }
        return true;
    }

    public CharPair[] getSymbolRanges() {
        return symbolRanges;
    }
}
