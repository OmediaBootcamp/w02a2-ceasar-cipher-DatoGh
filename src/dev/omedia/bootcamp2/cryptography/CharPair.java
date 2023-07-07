package dev.omedia.bootcamp2.cryptography;

public class CharPair {
    private char startSymbol;
    private char endSymbol;

    public CharPair(char startSymbol, char endSymbol) {
        this.startSymbol = startSymbol;
        this.endSymbol = endSymbol;
    }

    public char getStartSymbol() {
        return startSymbol;
    }

    public void setStartSymbol(char startSymbol) {
        this.startSymbol = startSymbol;
    }

    public char getEndSymbol() {
        return endSymbol;
    }

    public void setEndSymbol(char endSymbol) {
        this.endSymbol = endSymbol;
    }
}
