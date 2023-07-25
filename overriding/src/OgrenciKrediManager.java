//asla bozma extends silme !!!
public class OgrenciKrediManager extends BaseKrediManager {

    //overriding yapmış olduk.Normalde faiz 1.18 idi.Biz öğrenci için 1.10 dan aldık.!
    public double hesapla(double tutar){
        return tutar * 1.10;
    }

}
