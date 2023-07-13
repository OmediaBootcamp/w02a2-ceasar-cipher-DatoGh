package dev.omedia.bootcamp2.cryptography;

public class CharPair {
    private char startSymbol;
    private char endSymbol;

    public CharPair(char startSymbol, char endSymbol) {
    // აქ რომ შეადარო სიმბოლოები ამაზე რას იტყვი? 
        this.startSymbol = startSymbol;
        this.endSymbol = endSymbol;
    }



    public void setStartSymbol(char startSymbol) {
        this.startSymbol = startSymbol;
    }

    public char getStartSymbol() {
        return startSymbol;
    }

    public char getEndSymbol() {
        return endSymbol;
    }
// სიმბოლოს ჩასწორება რამდენად კარგი იდეაა?
    public void setEndSymbol(char endSymbol) {
        this.endSymbol = endSymbol;
    }
}
