
public class Main {
    public static void main(String[] args) {

        BaseKrediManager[] krediManagers=new BaseKrediManager[]{new OgretmenKrediManager(),new TarimKrediManager(),new OgrenciKrediManager()};
        for(BaseKrediManager krediManager:krediManagers){
            System.out.println(krediManager.hesapla(1000));
        }


//        OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
//        System.out.println(ogretmenKrediManager.hesapla(1000));
//
//        TarimKrediManager tarimKrediManager=new TarimKrediManager();
//        System.out.println(tarimKrediManager.hesapla(2000));
    }
}