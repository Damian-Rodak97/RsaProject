package Frame;

import java.math.BigInteger;
import java.util.ArrayList;
 
public class DecryptionService {
    
public static boolean IsPrime(int number)
{
for (int i = 2; i <= number/2; i++)
if( number%i == 0) return false;
 
return true;
}
public static ArrayList SieveOfEratosthenes(int N)
{
boolean [] array = new boolean [N-1];
for (int i = 0; i < N-1; i++)array[i] = true;
ArrayList<Integer> prime = new ArrayList<Integer>();
for(int i = 2; i <= N;i++){
    if(array[i-2]){
prime.add(i);
for(int j =2*i; j <= N; j += i)array[j-2]= false;
    }
  }
    return prime;
}
public static int NWD(int A,int B)
{
    for (int i = Math.min(A, B); i > 0;i--)
        if (A%i == 0 && B%i == 0)return i;
    return -1;
}
public static int get_e(int phi,int n)
{
    int e = 3;
    while (NWD(e,phi) !=1 ) e += 2;
    return e;
}
public static int get_d(int e, int phi)
{
    int d = 1;
    while((d*e) % phi !=1)d++;
    return d;
}
  public static int [] ConvertToASCII(String text)
{
        int [] dictionary = new int[text.length()];
        for (int i = 0 ; i < text.length(); i++) dictionary[i]+=(int)text.charAt(i);
        return dictionary;
}

  public static String  Decryption(String text,int n,int d)
{
  int [] numbers = ConvertToASCII(text);
  int [] tab = new int [text.length()];
  BigInteger N =  BigInteger.valueOf(n);
  String decrypted ="";
  for(int i = 0;i<text.length();i++)
  {
    BigInteger C = BigInteger.valueOf(numbers[i]);
    BigInteger msgBack = (C.pow(d)).mod(N);
    tab[i] = msgBack.intValue();
  }
  for(int x:tab)
  {
      x=x-1;
      decrypted += (char)x;
  }
  return decrypted;
} 
} 