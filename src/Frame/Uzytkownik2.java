package Frame;

import java.math.BigInteger;
import java.util.Random;

public class Uzytkownik2 {
    
    public static BigInteger N, D, E, Z, p, q;
    
    public static void main(String[] args) {
        
        Uzytkownik1 uzyt1 = new Uzytkownik1();
        Uzytkownik2 uzyt2 = new Uzytkownik2();
        
        String c = encrypt("H");
        String p = Uzytkownik1.decrypt(c);
        System.out.println(c);
        System.out.println(p);
    }
    
    public Uzytkownik2() {
        generate();
    }
    
    static void generate() {
        Random r = new Random();
        p = new BigInteger(6, 100, r);
        r = new Random();
        q = new BigInteger(6, 100, r);
        N = p.multiply(q);
        Z = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
        E = new BigInteger("4");
        while (BigInteger.valueOf(znajdzNWD(Z.intValue(), E.intValue())).intValue() > 1) {
            E = E.add(new BigInteger("1"));
        }
        D = BigInteger.valueOf(modularMultiplicativeInverse(E, Z));
        
        if (D.equals(E)) {
            D.add(Z);
        }
    }
    
    public static void generateStatic() {
        System.out.println("Uzytkownik2 p = "+p);
        System.out.println("Uzytkownik2 q = "+q);  
        N = p.multiply(q);
        Z = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
        E = new BigInteger("4");
        while (BigInteger.valueOf(znajdzNWD(Z.intValue(), E.intValue())).intValue() > 1) {
            E = E.add(new BigInteger("1"));
        }
        D = BigInteger.valueOf(modularMultiplicativeInverse(E, Z)); 
    }
    
    static int NWD(BigInteger x, BigInteger y) {
        BigInteger nwd = x.gcd(y);
        return nwd.intValue();
    }
    
    static int modularMultiplicativeInverse(BigInteger number, BigInteger sizeOfAplhabet) {
        int a = number.intValue() % sizeOfAplhabet.intValue();
        for (int x = 1; x < sizeOfAplhabet.intValue(); x++) {
            if ((a * x) % sizeOfAplhabet.intValue() == 1) {
                return getMod(x, sizeOfAplhabet.intValue());
            }
        }
        return -1;
    }
    
    static int getMod(int x, int y) {
        int result = x % y;
        if (result < 0) {
            result += y;
        }
        return result;
    }
    
    static String encrypt(String plainText) {
        String cipherText = "";
        for (int i = 0; i < plainText.length(); i++) {
            int index = plainText.charAt(i);
            cipherText += "" + (char)(new BigInteger(index+"").pow(Uzytkownik1.E.intValue()).mod(Uzytkownik1.N).intValue());
        }
        return cipherText;
    }
    
    static String decrypt(String cipherText) {
        String plainText = "";
        for (int i = 0; i < cipherText.length(); i++) {
            int index = cipherText.charAt(i);
            plainText += "" + (char)(new BigInteger(index+"").pow(D.intValue()).mod(N).intValue());
        }
        return plainText;
    }
    
    private static int znajdzNWD(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }
        return znajdzNWD(number2, number1 % number2);
    }
}