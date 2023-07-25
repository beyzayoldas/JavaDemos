
public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem=new DortIslem();

       int bol = dortIslem.Bol(15,5);
       int carp = dortIslem.Carp(2,3);
       int cikar = dortIslem.Cikar(6,1);
        int topla = dortIslem.Topla(8,9);

        System.out.println(bol);
        System.out.println(carp);
        System.out.println(cikar);
        System.out.println(topla);
    }
}