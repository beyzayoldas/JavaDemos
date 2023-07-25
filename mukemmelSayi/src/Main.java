//6 mükemmel bir sayıdır. 1+2+3=6
//28=1+2+4+7+14=28
public class Main {
    public static void main(String[] args) {

        int sayi=6;
        int toplam=0;

        for(int i=1;i<sayi;i++){
            if(sayi % i==0){
                toplam=toplam+i;
            }
        }

        if(toplam==sayi){
            System.out.println("MüKEMMEL SAYIDIR!");
        }else{
            System.out.println("MüKEMMEL SAYI DEĞİLDİR!");
        }
    }
}