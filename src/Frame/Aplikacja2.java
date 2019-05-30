package Frame;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;
 
public class Aplikacja2 {
    
public static boolean CzyPierwsza(int liczba)
{
for (int i = 2; i <= liczba/2; i++)
if( liczba%i == 0) return false;
 
return true;
}
public static ArrayList sitoEratostenesa(int N)
{
boolean [] tablica = new boolean [N-1];
for (int i = 0; i < N-1; i++)tablica[i] = true;
ArrayList<Integer> pierwsze = new ArrayList<Integer>();
for(int i = 2; i <= N;i++){
    if(tablica[i-2]){
pierwsze.add(i);
for(int j =2*i; j <= N; j += i)tablica[j-2]= false;
    }
  }
    return pierwsze;
}
public static int NWD(int A,int B)
{
    for (int i = Math.min(A, B); i > 0;i--)
        if (A%i == 0 && B%i == 0)return i;
    return -1;
}
public static int wyznacz_e(int phi,int n)
{
    int e = 3;
    while (NWD(e,phi) !=1 ) e += 2;
    return e;
}
public static int wyznacz_d(int e, int phi)
{
    int d = 1;
    while((d*e) % phi !=1)d++;
    return d;
}
  public static int [] ZamianaNaAscii(String tekst)
{
        int [] slownik = new int[tekst.length()];
        for (int i = 0 ; i < tekst.length(); i++) slownik[i]+=(int)tekst.charAt(i);
        return slownik;
}

  public static String  Deszyfrowanie(String tekst,int n,int d)
{
  int [] liczby = ZamianaNaAscii(tekst);
  int [] tab = new int [tekst.length()];
  BigInteger N =  BigInteger.valueOf(n);
  String Zdeszyfrowny ="";
  for(int i = 0;i<tekst.length();i++)
  {
    BigInteger C = BigInteger.valueOf(liczby[i]);
    BigInteger msgBack = (C.pow(d)).mod(N);
    tab[i] = msgBack.intValue();
  }
  for(int x:tab)
  {
      x=x-1;
      Zdeszyfrowny += (char)x;
  }
  return Zdeszyfrowny;
}
 
//    public static void main(String[] args) {
// int p,q,n,phi;
// ArrayList<Integer> pierwsze = sitoEratostenesa(200);
//       Random rand = new Random();
//    p = pierwsze.get(rand.nextInt(pierwsze.size()));
//    q = pierwsze.get(rand.nextInt(pierwsze.size()));
//    while(p==q) q = pierwsze.get(rand.nextInt(pierwsze.size()));
//    n= p*q;
//    phi = (p-1) * (q -1);
//    int e = wyznacz_e(phi,n);
//    int d = wyznacz_d(e,phi);
//     String tekst = "tat ";
//     System.out.println("Tekst:" + tekst);
//     String tekstZaszyfrowany = Szyfrowanie(tekst,n,e);
//     String tekstDeszyfrowany = Deszyfrowanie(tekstZaszyfrowany,n,d);
//    }   
} 