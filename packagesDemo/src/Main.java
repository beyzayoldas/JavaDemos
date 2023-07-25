//built-in:javanın içinde var anlamında!
//import ettiklerimiz!!
import matematik.*;
import matematik.DortIslem;
import matematik.Logaritma;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);

        System.out.println("İsim giriniz: ");

        String isim=giris.nextLine();

        System.out.println("Merhaba "+isim);

        DortIslem dortIslem=new DortIslem();
        int sonuc=dortIslem.topla(2,3);
        System.out.println(sonuc);
        Logaritma logaritma=new Logaritma();
     


    }
}