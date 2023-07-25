
public class Main {
    public static void main(String[] args) {

            char grade='F';
            switch(grade) {
                case 'A':
                    System.out.println("Mükemmel geçtiniz.");
                    break;
                    //case B ve case C için aynı çıktıyı almak istiyorsak:
                    //case 'B':
                    //case 'C':     şekline bırakmamız yeterlidir!!
                case 'B':
                    System.out.println("Çok iyi geçtiniz.");
                    break;
                case 'C':
                    System.out.println("İyi Geçtiniz.");
                    break;
                case 'D':
                    System.out.println("Ortalama Geçtiniz.");
                    break;
                case 'F':
                    System.out.println("Malesef geçemediniz.");
                    break;
                default:
                    System.out.println("Geçersiz not girdiniz.");

            }
    }
}