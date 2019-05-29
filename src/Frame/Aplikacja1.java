package Frame;

public class Aplikacja1 {
    public static int [] ZamianaNaAscii(String tekst)
{
        int [] slownik = new int[tekst.length()];
        for (int i = 0 ; i < tekst.length(); i++) slownik[i]+=(int)tekst.charAt(i);
        return slownik;
}
        
    public static String Szyfrowanie(String tekst,int n,int e)
{
    int [] liczby = ZamianaNaAscii(tekst);
    String ZaszyfrowanyTekst = "";
    for(int i =0; i < tekst.length();i++)
    {
    ZaszyfrowanyTekst += (char)(Math.pow(liczby[i], e)%n);
    }
    return ZaszyfrowanyTekst;
}
    public static void main(String[] args) {
    
    } 
  }