//remainder:kalan
//sayının asal olup olmadığını veren program
//isPrime:asal sayı mı? anlamındadır.
public class Main {
    public static void main(String[] args) {

        int sayi=1;
        int kalan=sayi % 2;
        System.out.println(kalan);
        boolean asalSayiMi=true; // ilk etapta sayı asal kabul edilir.

        if(sayi==1){
            System.out.println("Sayı asal değildir.");
            return;
        }

        if(sayi<1){
            System.out.println("Geçersiz sayıdır.");
        }

         for(int i=2;i<sayi;i++){ //2 den 24 e kadar
             if(sayi % i == 0){
                 asalSayiMi=false;
             }
         }
         if(asalSayiMi){
             System.out.println("Sayı asaldır.");
         }else{
             System.out.println("Sayı asal değildir.");
         }
    }
}