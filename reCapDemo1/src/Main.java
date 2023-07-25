
public class Main {
    public static void main(String[] args) {
        int sayi1=100;
        int sayi2=165;
        int sayi3=900;

        if(sayi1>sayi2){
            if(sayi1>sayi3){
                System.out.println("Sayı1 en büyüktür.");
            }
            else if(sayi3>sayi1){
                System.out.println("Sayı3 en büyüktür.");
            }
            }
        else if(sayi2>sayi3) {
            System.out.println("Sayı2 en büyüktür.");
        }
        else{
            System.out.println("Sayi3 en büyükür.");
        }

    }
}