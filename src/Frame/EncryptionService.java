package Frame;

public class EncryptionService {

    public static int[] ConvertFromASCII(String text) {
        int[] dictionary = new int[text.length()];
        for (int i = 0; i < text.length(); i++) {
            dictionary[i] += (int) text.charAt(i) + 1;
        }
        return dictionary;
    }

    public static String Encryption(String tekst, int n, int e) {
        int[] numbers = ConvertFromASCII(tekst);
        String encryptedText = "";
        for (int i = 0; i < tekst.length(); i++) {
            encryptedText += (char) (Math.pow(numbers[i], e) % n);
        }
        return encryptedText;
    }
}
