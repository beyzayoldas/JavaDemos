
public class Main {
    public static void main(String[] args) {

        String mesaj= "Bugün hava çok güzel!!";
        System.out.println(mesaj);

      /*  System.out.println("Eleman sayısı: "+mesaj.length()); //length eleman sayısını verir.
        System.out.println("5.eleman sayısı: "+mesaj.charAt(4)); //charAt içine yazılan sayının gittiği harfi verir.0 dan başlar.
        System.out.println(mesaj.concat(" Yaşasın!"));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("!"));
        char[] karakterler=new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av")); // av nerde başladı orayı aldık
        System.out.println(mesaj.lastIndexOf("a")); // sondan bakarsak sondaki ilk a yı alırız.Fakat baştan sayarız sona kadar
*/
        //replace:değiştirmek

        String yeniMesaj=mesaj.replace(' ','-');
        System.out.println(yeniMesaj);

        System.out.println(mesaj.substring(2)); //Bugün kelimesinde b 0 u 1 g 2 dir.2 den başlayanla devam edilir.
        System.out.println(mesaj.substring(2,4)); //2 den başlar 4 ü dahil etmez.Yani b-0 u-1 g-2 ü-3 n-4 g ve ü alınır.

        for(String kelime: mesaj.split(" ")){ //split kelimeleri teker teker yazar.
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim()); //trim boşlukları atar.
    }
}