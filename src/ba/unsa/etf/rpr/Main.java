package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Unesite n: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i < n; i++)
        {
            if(i%sumaCifara(i)==0) System.out.println(i);
        }
    }
    public static int sumaCifara(int br){
        int m=br, suma=0;
        while(m!=0)
        {
            suma+=m%10;
            m/=10;
        }
        return suma;
    }
}
